package org.together.and.controller.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.together.and.api.ComputeClient;
import org.together.and.dto.Person;

@RestController
public class ConsumerController {

	@GetMapping(value = "/add")
	public Integer add() {
		Integer result = 0;
		// result =
		// restTemplate.getForEntity("http://COMPUTE-SERVICE/add?a=10&b=20",
		// Integer.class).getBody();
//		result = computeClient.add(20, 70);
		return result;
	}

	// @GetMapping(value = "/person")

	// public Person person() {
	// Person person = computeClient.getPerson(100);
	// result =
	// restTemplate.getForEntity("http://COMPUTE-SERVICE/add?a=10&b=20",
	// Integer.class).getBody();
	// return person;
//	}

}
