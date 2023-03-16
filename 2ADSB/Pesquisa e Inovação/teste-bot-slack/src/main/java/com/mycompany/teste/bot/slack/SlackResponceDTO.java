/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teste.bot.slack;

import java.util.List;

/**
 *
 * @author gabriel.f.a.santos
 */
public class SlackResponceDTO {
	
	private String text;
	private List<String> attachments;

    public SlackResponceDTO(String text, List<String> attachments) {
        this.text = text;
        this.attachments = attachments;
    }

        
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<String> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<String> attachments) {
        this.attachments = attachments;
    }
        
}
