package org.together.and.controller.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.together.and.api.ComputeClient;

@RestController
public class ConsumerController {

	@Autowired
	RestTemplate restTemplate;

	@Autowired
	ComputeClient computeClient;

	@GetMapping(value = "/add")
	public Integer add() {
		Integer result = 0;
//		result = restTemplate.getForEntity("http://COMPUTE-SERVICE/add?a=10&b=20", Integer.class).getBody();
		result = computeClient.add(20, 70);
		return result;
	}

}
