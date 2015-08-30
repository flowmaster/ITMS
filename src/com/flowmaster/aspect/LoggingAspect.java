package com.flowmaster.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;

public class LoggingAspect {
	
	private Logger logger = Logger.getLogger(LoggingAspect.class);
    
    @Around("execution(* com.flowmaster.*.*.*(..))")
    public Object aroundWebMethodE(ProceedingJoinPoint pjp) throws Throwable {      
        String packageName = pjp.getSignature().getDeclaringTypeName();
        String methodName = pjp.getSignature().getName();
        long start = System.currentTimeMillis();
        if(!pjp.getSignature().getName().equals("initBinder")) {
           logger.info("Entering method [" + packageName + "." + methodName +  "]");
        }
        Object output = pjp.proceed();
        long elapsedTime = System.currentTimeMillis() - start;
        if(!methodName.equals("initBinder")) {
           logger.info("Exiting method [" + packageName + "." + methodName + "]; exec time (ms): " + elapsedTime);
        }
        return output;
    }
}
