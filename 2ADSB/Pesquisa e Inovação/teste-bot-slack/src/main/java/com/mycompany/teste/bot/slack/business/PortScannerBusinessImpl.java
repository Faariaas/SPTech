/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.teste.bot.slack.business;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.springframework.stereotype.Component;

import com.mycompany.teste.bot.slack.SlackRequestDTO;
import com.mycompany.teste.bot.slack.SlackResponceDTO;

/**
 *
 * @author gabriel.f.a.santos
 */
@Component
public class PortScannerBusinessImpl implements PortScannerBusiness {
	
	private final ExecutorService executorService = Executors.newFixedThreadPool(20);
	private static final int TIMEOUT = 200;
	
	public SlackResponceDTO getOpenPorts(SlackRequestDTO slackRequestDTO) throws InterruptedException, ExecutionException {
		final List<Future<Boolean>> futures = new ArrayList<>();
		String ip = slackRequestDTO.getText();
		
		for (int porta = 1; porta <= 65535; porta++) {
			futures.add(isPortOpen(executorService, ip, porta, TIMEOUT));
		}
		
		int amountOfOpenPorts = 0;
		int openPort = 0;
		List<String> openPorts = new ArrayList<>();
		
		for (final Future<Boolean> future : futures) {
			openPort++;

			if (future.get()) {
				openPorts.add(Integer.toString(openPort));
				amountOfOpenPorts++;	
			}
		}
		
		
		return new SlackResponceDTO(buildSlackResponseTextMessage(amountOfOpenPorts, openPorts, ip), null);
	}

	private Future<Boolean> isPortOpen(ExecutorService executorService, String ip, int port, int timeout) {
		return executorService.submit(new Callable<Boolean>() {
			@Override
			public Boolean call() {
				try {
					Socket socket = new Socket();
					socket.connect(new InetSocketAddress(ip, port), timeout);
					socket.close();
					return true;
					
				} catch (Exception ex) {
					return false;
				}
			}
		});
	}
	
	private String buildSlackResponseTextMessage(int amountOfOpenPorts, List<String> openPorts, String ip) {
		StringBuilder message = new StringBuilder("There is " + amountOfOpenPorts + " available ports on " + ip + ":");
		
		if (amountOfOpenPorts > 0) {
			openPorts.forEach(
					port -> message.append("\n " + ip + ":" + port));
		}
		return message.toString();
	}
}
