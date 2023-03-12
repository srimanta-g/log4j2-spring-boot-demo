package com.srimanta.Log4j2demo.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Log4j2Controller {

	
	private static final Logger LOGGER = LogManager.getLogger(Log4j2Controller.class);
	
	@RequestMapping(path = "/test", method = RequestMethod.GET)
	public String test() {
		LOGGER.info("/GET request triggered");
		return "test working";
	}
}
