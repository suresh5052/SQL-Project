package com.firsttryingprojcet1.AspectAOP;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExceptionHandlerAspect {

	
	  private final Logger logger = LoggerFactory.getLogger(ExceptionHandlerAspect.class);

	    @AfterThrowing(pointcut = "execution(* com.firsttryingprojcet1.controller.*.*(..))", throwing = "ex")
	    public ResponseEntity<String> handleExceptions(Exception ex) {
	        logger.error("An exception occurred: " + ex.getMessage(), ex);
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred while processing your request.");
	    }
}
