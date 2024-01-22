package com.example.overallTask.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContextException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("api/log")
public class LogController {

	public static final Logger LOGGER = LoggerFactory.getLogger(LogController.class);

	@GetMapping("/printLogs")
	public String printLogs(@RequestParam(required = false) Integer testId) {
	LOGGER.debug("STARTING METHOD : " + "printLogs()");
	try {
			if (testId==null) {
			throw new ApplicationContextException("The test id is null");
		}
		if (testId == 0) {
				LOGGER.warn(" test id is zero");
			}
			LOGGER.info("The task id is valid data");
		} catch (Exception e) {
			LOGGER.error("error : {}", e.getMessage());
		}
		LOGGER.debug("ENDING METHOD : " + "printLogs()");
		return "Log printed successfull";
	}

}
