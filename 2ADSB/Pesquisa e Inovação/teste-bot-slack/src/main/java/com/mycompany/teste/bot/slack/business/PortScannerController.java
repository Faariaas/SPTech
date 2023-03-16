/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teste.bot.slack.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.teste.bot.slack.SlackRequestDTO;
import com.mycompany.teste.bot.slack.SlackResponceDTO;
import com.mycompany.teste.bot.slack.business.PortScannerBusiness;
import com.mycompany.teste.bot.slack.business.PortScannerBusinessImpl;
/**
 *
 * @author gabriel.f.a.santos
 */
public class PortScannerController {
	
	@Autowired
	private PortScannerBusiness portScannerBusiness;
	
	@Autowired
	private SlackVerificationTokenBusiness slackVerificationTokenBusiness;
	
	@RequestMapping(path = "/ports", method = RequestMethod.POST)
	public ResponseEntity<SlackResponseDTO> getAvailablePorts(SlackRequestDTO slackRequestDTO) {
		SlackResponseDTO slackResponseDTO = new SlackResponseDTO();
		
		if (slackRequestDTO.getToken() == null ||
				!slackVerificationTokenBusiness.isRequestComingFromSlack(slackRequestDTO.getToken())) {
			slackResponseDTO.setText("The provided Validation Token is not valid!");
			return new ResponseEntity<SlackResponseDTO>(slackResponseDTO, HttpStatus.FORBIDDEN);
		}
		
		try {
			slackResponseDTO = portScannerBusiness.getOpenPorts(slackRequestDTO);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<SlackResponseDTO>(slackResponseDTO, HttpStatus.OK); 
	}

}
