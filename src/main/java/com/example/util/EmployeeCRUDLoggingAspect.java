package com.example.util;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import com.example.model.Employee;

@Aspect
public class EmployeeCRUDLoggingAspect {

	// *****************************************Before************************************************************

	@Before("execution(* com.example.DAOImpl.EmployeeManagerImpl.*(..))")
	public void logBeforeAllMethods(JoinPoint joinPoint) {
		System.out.println("****LoggingAspect.logBeforeAllMethods() : " + joinPoint.getSignature().getName());
	}

	@Before("execution(* com.example.DAOImpl.EmployeeManagerImpl.getEmployeeById(..))")
	public void logBeforeGetEmployee(JoinPoint joinPoint) {
		System.out.println("****LoggingAspect.logBeforeGetEmployee() : " + joinPoint.getSignature().getName());
	}

	@Before("execution(* com.example.DAOImpl.EmployeeManagerImpl.createEmployee(..))")
	public void logBeforeCreateEmployee(JoinPoint joinPoint) {
		System.out.println("****LoggingAspect.logBeforeCreateEmployee() : " + joinPoint.getSignature().getName());
	}

	@Before("execution(* com.example.DAOImpl.EmployeeManagerImpl.deleteEmployee(..))")
	public void logBeforedeleteEmployee(JoinPoint joinPoint) {
		System.out.println("****LoggingAspect.logBeforeDeleteEmployee() : " + joinPoint.getSignature().getName());
	}

	// ***********************************************After*********************************************************

	@After("execution(* com.example.DAOImpl.EmployeeManagerImpl.*(..))")
	public void logAfterAllMethods(JoinPoint joinPoint) {
		System.out.println("****LoggingAspect.logAfterAllMethods() : " + joinPoint.getSignature().getName());
	}

	@After("execution(* com.example.DAOImpl.EmployeeManagerImpl.getEmployeeById(..))")
	public void logAfterGetEmployee(JoinPoint joinPoint) {
		System.out.println("****LoggingAspect.logAfterGetEmployee() : " + joinPoint.getSignature().getName());
	}

	@After("execution(* com.example.DAOImpl.EmployeeManagerImpl.createEmployee(..))")
	public void logAfterCreateEmployee(JoinPoint joinPoint) {
		System.out.println("****LoggingAspect.logAfterCreateEmployee() : " + joinPoint.getSignature().getName());
	}

	@After("execution(* com.example.DAOImpl.EmployeeManagerImpl.deleteEmployee(..))")
	public void logAfterdeleteEmployee(JoinPoint joinPoint) {
		System.out.println("****LoggingAspect.logAfterDeleteEmployee() : " + joinPoint.getSignature().getName());
	}

	// **************************************************Around*****************************************************

	@Around("execution(* com.example.DAOImpl.EmployeeManagerImpl.*(..))")
	public void logAroundAllMethods(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("****LoggingAspect.logAroundAllMethods() : " + joinPoint.getSignature().getName()
				+ ": Before Method Execution");
		try {
			joinPoint.proceed();
		} finally {
			// Do Something useful, If you have
		}
		System.out.println("****LoggingAspect.logAroundAllMethods() : " + joinPoint.getSignature().getName()
				+ ": After Method Execution");
	}

	@Around("execution(* com.example.DAOImpl.EmployeeManagerImpl.getEmployeeById(..))")
	public void logAroundGetEmployee(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("****LoggingAspect.logAroundGetEmployee() : " + joinPoint.getSignature().getName()
				+ ": Before Method Execution");
		try {
			joinPoint.proceed();
		} finally {
			// Do Something useful, If you have
		}
		System.out.println("****LoggingAspect.logAroundGetEmployee() : " + joinPoint.getSignature().getName()
				+ ": After Method Execution");
	}

	@Around("execution(* com.example.DAOImpl.EmployeeManagerImpl.createEmployee(..))")
	public void logAroundCreateEmployee(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("****LoggingAspect.logAroundCreateEmployee() : " + joinPoint.getSignature().getName()
				+ ": Before Method Execution");
		try {
			joinPoint.proceed();
		} finally {
			// Do Something useful, If you have
		}
		System.out.println("****LoggingAspect.logAroundCreateEmployee() : " + joinPoint.getSignature().getName()
				+ ": After Method Execution");
	}

	// *********************************************AfterReturning*****************************************************

	@AfterReturning("execution(* com.example.DAOImpl.EmployeeManagerImpl.*(..))")
	public void logAfterReturningAllMethods() throws Throwable {
		System.out.println("****LoggingAspect.logAfterReturningAllMethods() ");
	}

	@AfterReturning(pointcut = "execution(* com.example.DAOImpl.EmployeeManagerImpl.getEmployeeById(..))", returning = "retVal")
	public void logAfterReturningGetEmployee(Object retVal) throws Throwable {
		System.out.println("****LoggingAspect.logAfterReturningGetEmployee() ");
		//System.out.println(((Employee) retVal).getId());
	}

	@AfterReturning("execution(* com.example.DAOImpl.EmployeeManagerImpl.createEmployee(..))")
	public void logAfterReturningCreateEmployee() throws Throwable {
		System.out.println("****LoggingAspect.logAfterReturningCreateEmployee() ");
	}
	
	// *********************************************AfterThrowing*****************************************************
	
	@AfterThrowing (pointcut = "execution(* com.example.DAOImpl.EmployeeManagerImpl.*(..))", throwing = "ex")
    public void logAfterThrowingAllMethods(Exception ex) throws Throwable 
    {
        System.out.println("****LoggingAspect.logAfterThrowingAllMethods() " + ex);
    }
}
