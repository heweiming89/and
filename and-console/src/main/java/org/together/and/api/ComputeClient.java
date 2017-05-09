package org.together.and.api;

//import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.together.and.dto.Person;

//@FeignClient(ConfigConstant.AND_BIZ_SERVICE)
public interface ComputeClient {

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);

	@RequestMapping(value = "/person/{id}", method = RequestMethod.GET)
	Person getPerson(@PathVariable(value = "id") Integer id);

}
