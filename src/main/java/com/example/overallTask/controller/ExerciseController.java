package com.example.overallTask.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContextException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api/exe")
public class ExerciseController {
	public static  final Logger LOGGER=LoggerFactory.getLogger(ExerciseController.class);
	@PostMapping("/log")
	public String practiceLog(@RequestParam(required = false)Integer test){
		LOGGER.debug("STARTING METHOD {}", "practiceLog()");
//		try {
//			if(test==0)
//			{
//				throw new ApplicationContextException("THE TEST VALUE IS ZERO");
//			}
//			if(test==null)
//			{
//				LOGGER.warn("THE TEST VALUE IS NULL");
//			}
//			LOGGER.info("THE TEST VALUE IS VALID");
//		}catch(Exception e)
//		{
//			LOGGER.debug("ERROR :{}",e.getMessage());
//		}
		LOGGER.info("HI IAM INFO");
		LOGGER.warn("HI IAM WARN");
		LOGGER.error("HI IAM ERROR");
		LOGGER.debug("ENDING METHOD :{}","practiceLog()");
		return "SUCCESFULLY LOG CREATED";
	}

}
