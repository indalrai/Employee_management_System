package com.cats.ems.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import com.cats.ems.model.Employee;
import lombok.extern.slf4j.Slf4j;

@Aspect
@Slf4j
@Component
public class EmployeeAopAspect {

	@Pointcut("execution(* com.cats.ems.controller.*.*(..))")
	public void loggingPointCut() {
	}

	@Around("loggingPointCut()")
	public Object before(ProceedingJoinPoint jointPoint) throws Throwable {
		log.info("Before method invoked::" + jointPoint.getArgs()[0]);
		Object object = jointPoint.proceed();
		return object;
	}

}
