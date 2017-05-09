package org.together.and.controller;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.together.and.dto.Person;

@RestController
public class PersonController {

	@GetMapping(value = "/person/{id}")
	public Person person(@PathVariable Integer id) {
		Person person = new Person();
		person.setName("曾阿牛");
		person.setAge(27);
		person.setSalary(BigDecimal.valueOf(7200));
		person.setBirthday(new Date());
		return person;
	}

}
