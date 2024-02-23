package com.urbug2.web.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("samples")
public class SampleThymeleafController {

	@RequestMapping(method=RequestMethod.GET)
	public String sample() {
		return "samples"; // /main/resources/templates/samples.html
	}
	
}
