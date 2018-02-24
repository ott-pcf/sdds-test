package com.test.sdds.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

@Configuration
public class TestCloudConfig {

	@Value("${jdbcUrl}")
	private String jdbcUrl;

	@Bean
	@Profile("cloud")
	DataSource dataSource() {
		try {
			return new SimpleDriverDataSource(com.mysql.jdbc.Driver.class.newInstance(), jdbcUrl);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
