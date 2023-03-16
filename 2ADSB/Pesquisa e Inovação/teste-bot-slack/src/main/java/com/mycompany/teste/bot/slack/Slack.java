/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teste.bot.slack;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.json.JSONObject;

/**
 *
 * @author gabriel.f.a.santos
 */
public class Slack {
    
    private static HttpClient client = HttpClient.newHttpClient();
    private static final String URL = "https://hooks.slack.com/services/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";
    
    public static void sendMessage(JSONObject content) throws IOException, InterruptedException{
        HttpRequest request = HttpRequest.newBuilder(
                URI.create(URL)).header("accept", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(content.toString()))
                .build();
        
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
    
        System.out.println(String.format("Status: %s", response.statusCode()));
        System.out.println(String.format("Responde: %s", response.body()));
    }
}
