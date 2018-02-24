package com.test.sdds;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.test.sdds.model.TestData;
import com.test.sdds.repo.TestRepo;

@SpringBootApplication
public class SddsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SddsApplication.class, args);
	}

	@Autowired
	private TestRepo testRepo;

	@Override
	public void run(String... args) throws Exception {
		this.testRepo.save(new TestData("adhi"));

	}

}