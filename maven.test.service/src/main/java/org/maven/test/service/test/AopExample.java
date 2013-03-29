package org.maven.test.service.test;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;

@Aspect
@Service
public class AopExample {
	@Before(value="execution(org.maven.test.serviceimpl.RetrieveUserInfoServiceImpl(..))")
	public void doAruound(JoinPoint joinPoint){
		System.out.println(joinPoint.getArgs() + " " + joinPoint.getSignature());
	}
}
