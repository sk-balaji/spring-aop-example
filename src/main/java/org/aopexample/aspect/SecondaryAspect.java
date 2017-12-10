package org.aopexample.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class SecondaryAspect {
	
	@Before("execution(* org.aopexample.service.*.addEmployee(..))")
	public void afterAddEmployee(JoinPoint joinPoint) {
		System.out.println("Secondary aspect");
	}

}
