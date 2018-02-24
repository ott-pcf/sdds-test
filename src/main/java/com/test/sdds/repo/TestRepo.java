package com.test.sdds.repo;

import org.springframework.data.repository.CrudRepository;

import com.test.sdds.model.TestData;

public interface TestRepo extends CrudRepository<TestData, Long> {
}