/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.teste.bot.slack.business;

import java.util.concurrent.ExecutionException;

import com.mycompany.teste.bot.slack.SlackRequestDTO;
import com.mycompany.teste.bot.slack.SlackResponceDTO;
/**
 *
 * @author gabriel.f.a.santos
 */

public interface PortScannerBusiness {
	
  SlackResponceDTO getOpenPorts(SlackRequestDTO slackRequestDTO) throws InterruptedException, ExecutionException;
	
}
