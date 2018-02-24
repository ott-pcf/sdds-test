package com.test.sdds.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.sdds.model.TestData;
import com.test.sdds.repo.TestRepo;

@RestController
public class TestController {

	@Autowired
	private TestRepo testRepo;

	@GetMapping("/test")
	public Iterable<TestData> test() {
		return this.testRepo.findAll();
	}

}
