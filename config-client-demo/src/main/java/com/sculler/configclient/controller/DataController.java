package com.sculler.configclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sculler.configclient.config.SpClientConfig;

@RestController
@RefreshScope
public class DataController {
	
	@Autowired
	private SpClientConfig config;
	
	@RequestMapping("/message")
	String getMsg() {
		StringBuilder sbc = new StringBuilder("env: ");
		sbc.append(config.getEnv());
		sbc.append(", username: ");
		sbc.append(config.getUsername());
		sbc.append(", password: ");
		sbc.append(config.getUserpass());
		return sbc.toString();
	}

}
