package com.sculler.configclient.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@Configuration
@RefreshScope
public class SpClientConfig {
	@Value("${data.env}")
	private String env;
	
	@Value("${data.user.name}")
	private String username;
	
	@Value("${data.user.password}")
	private String userpass;

	public String getEnv() {
		return env;
	}

	public String getUsername() {
		return username;
	}

	public String getUserpass() {
		return userpass;
	}
	
}
