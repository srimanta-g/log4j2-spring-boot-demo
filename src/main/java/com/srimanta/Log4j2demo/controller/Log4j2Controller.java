package com.srimanta.Log4j2demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Log4j2Controller {

	
	@RequestMapping(path = "/test", method = RequestMethod.GET)
	public String test() {
		return "test working";
	}
}
