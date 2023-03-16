/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teste.bot.slack;

import java.io.IOException;
import org.json.JSONObject;

/**
 *
 * @author gabriel.f.a.santos
 */
public class Test {
    public static void main(String[] args) throws IOException, InterruptedException {
        JSONObject json = new JSONObject();
        
        json.put("text", "Shopping");
        
        Slack.sendMessage(json);
    }
}
