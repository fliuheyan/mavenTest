package org.maven.test.serviceimpl;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;


@Service("aopTestServiceImpl")
@Aspect
//org.maven.test.serviceimpl.RetrieveUserInfoServiceImpl.batchRetrieveUserInfo(..)
public class AopTestServiceImpl {
	@Pointcut("execution(* org.maven.test.serviceimpl.RetrieveUserInfoServiceImpl.batchRetrieveUserInfo(..))")
	private void batchUpdatePointCut(){
		
	}
	
	@After("batchUpdatePointCut()")
	public void doAfter(){
		System.out.println("after service");
	}
	
	@Before("execution(* batchRetrieveUserInfo(..))")
	public void doBefore(JoinPoint joinPoint){
		System.out.println("This is aop test: " + joinPoint.getArgs() + " " + joinPoint.getSignature());
	}
}
