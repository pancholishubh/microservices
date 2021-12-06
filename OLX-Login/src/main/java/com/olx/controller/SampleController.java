package com.olx.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	
	@Value("${spring.datasource.url}")
	private String dbURL;

	@GetMapping(value="/read-config")
	public String getConfig() {
		return "db url = "+dbURL;
	}
}
