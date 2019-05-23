package com.fh.project.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//@Component
@Aspect
public class LogAspectJ {

	@Pointcut("execution(* com.fh.project..*.*(..))")
	public void point(){}

}
