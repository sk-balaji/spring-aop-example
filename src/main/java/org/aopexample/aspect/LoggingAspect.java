package org.aopexample.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(0)
public class LoggingAspect {
	
	public LoggingAspect() {
		System.out.println("Creating Logging aspect object");
	}

	@Around("execution(* org.aopexample.service.*.addEmployee(..))")
	public void afterAddEmployee(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("Logging aspect before proceed");
		joinPoint.proceed();
		System.out.println("Logging aspect after proceed");
		/*System.out.println(joinPoint.getSignature());
		Employee emp = (Employee)joinPoint.getArgs()[0];
		emp.setId(1);
		System.out.println(joinPoint.getArgs()[0]);*/
	}
}
