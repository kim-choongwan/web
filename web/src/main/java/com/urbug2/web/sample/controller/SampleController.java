package com.urbug2.web.sample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@RequestMapping("/sample/")
	public String hello() {
		return "Hello world";
	}
}
