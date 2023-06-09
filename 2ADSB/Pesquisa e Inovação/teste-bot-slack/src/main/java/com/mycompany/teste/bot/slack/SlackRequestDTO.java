/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teste.bot.slack;

/**
 *
 * @author gabriel.f.a.santos
 */

public class SlackRequestDTO {
	private String token;
	private String team_id;
	private String team_domain;
	private String enterprise_id;
	private String enterprise_name;
	private String channel_id;
	private String channel_name;
	private String user_id;
	private String user_name;
	private String command;
	private String text;
	private String response_url;

    public SlackRequestDTO(String token, String team_id, String team_domain, String enterprise_id, String enterprise_name, String channel_id, String channel_name, String user_id, String user_name, String command, String text, String response_url) {
        this.token = token;
        this.team_id = team_id;
        this.team_domain = team_domain;
        this.enterprise_id = enterprise_id;
        this.enterprise_name = enterprise_name;
        this.channel_id = channel_id;
        this.channel_name = channel_name;
        this.user_id = user_id;
        this.user_name = user_name;
        this.command = command;
        this.text = text;
        this.response_url = response_url;
    }

        
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getTeam_id() {
        return team_id;
    }

    public void setTeam_id(String team_id) {
        this.team_id = team_id;
    }

    public String getTeam_domain() {
        return team_domain;
    }

    public void setTeam_domain(String team_domain) {
        this.team_domain = team_domain;
    }

    public String getEnterprise_id() {
        return enterprise_id;
    }

    public void setEnterprise_id(String enterprise_id) {
        this.enterprise_id = enterprise_id;
    }

    public String getEnterprise_name() {
        return enterprise_name;
    }

    public void setEnterprise_name(String enterprise_name) {
        this.enterprise_name = enterprise_name;
    }

    public String getChannel_id() {
        return channel_id;
    }

    public void setChannel_id(String channel_id) {
        this.channel_id = channel_id;
    }

    public String getChannel_name() {
        return channel_name;
    }

    public void setChannel_name(String channel_name) {
        this.channel_name = channel_name;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getResponse_url() {
        return response_url;
    }

    public void setResponse_url(String response_url) {
        this.response_url = response_url;
    }
        
        
}
