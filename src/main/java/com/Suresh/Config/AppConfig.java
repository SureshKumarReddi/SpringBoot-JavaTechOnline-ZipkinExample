package com.Suresh.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import brave.sampler.Sampler;

@Configuration
public class AppConfig {

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	//collects the data from sleuth and hand it over to Zipkin client
	
	@Bean
	public Sampler sampleObj() {
		return Sampler.ALWAYS_SAMPLE; 
	}
}
