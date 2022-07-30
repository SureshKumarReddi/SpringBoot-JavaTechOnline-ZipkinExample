package com.Suresh.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AppOneController {

	private Logger logger = LoggerFactory.getLogger(AppOneController.class);

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/m1")
	public String methodOne() {
		logger.info(" ************ inside method one *************");
		String response = restTemplate.getForObject("http://localhost:9091/m2", String.class);
		logger.info("*************  resposne from microservice-1  ************* " + response);
		return "   returning from microservice -1  ";
	}
}
