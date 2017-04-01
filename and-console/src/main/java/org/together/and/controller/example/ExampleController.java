package org.together.and.controller.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ExampleController {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = LoggerFactory.getLogger(ExampleController.class);

	@GetMapping(value = "/layout")
	public ModelAndView layout() {
		String viewName = "layout/console-index";
		ModelAndView mav = new ModelAndView(viewName);
		return mav;
	}

	@GetMapping(value = "/demo")
	public ModelAndView demo() {
		String viewName = "example/demo";
		ModelAndView mav = new ModelAndView(viewName);
		return mav;
	}

}
