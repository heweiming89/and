package org.together.and.controller.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CloudDemoController {

	@Autowired
	private DiscoveryClient client;
	
	
	
	
}
