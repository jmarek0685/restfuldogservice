package com.example.restfuldogservice;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.restfuldogservice.rest.DogBreedController;

//Following spring guide for testing
//https://spring.io/guides/gs/testing-web/
@SpringBootTest
class SmokeTest  {

	@Autowired
	private DogBreedController controller;
	

	@Test
	public void contexLoads() throws Exception {
		assertThat(controller).isNotNull();
	}
}
