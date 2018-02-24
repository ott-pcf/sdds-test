package com.test.sdds.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

@Configuration
public class TestCloudConfig {

	@Value("${host}")
	private String host;

	@Value("${database}")
	private String database;

	@Value("${username}")
	private String username;

	@Value("${password}")
	private String password;

	@Bean
	@Profile("cloud")
	DataSource dataSource() {
		try {
			return new SimpleDriverDataSource(com.mysql.jdbc.Driver.class.newInstance(),
					host + database + "?user=" + username + "&password=" + password);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
