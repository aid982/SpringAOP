package org.osetskiy.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.osetskiy.model.Circle;

//@Aspect
public class LoggingAspect {
	//@Before("execution(public String getName())") // to all getname methods
	//@Before("execution(public String org.osetskiy.model.Circle.getName())")
	//@Before("execution(public String get*())") // to all string getters
	//@Before("execution(public * get*(*))")
	//@Before("allCircleMethods() && allGetters()")
	//@Before("allCircleMethods()")
	public void LoggingAdvice(JoinPoint joinPoint){
		System.out.println("Advice run "+joinPoint.getTarget());
		Circle circ = (Circle)joinPoint.getTarget();
		
		System.out.println(circ.getName());
		
	}
	
	//@Before("allGetters()")	
	public void SecondAdvice(){
		System.out.println("Second Advice run");
		
	}
	
	//@Pointcut("execution(public * get*(..))")
	public void allGetters() {}
	
	//@Pointcut("execution(public * org.osetskiy.model.Circle.*(..))")
	//@Pointcut("within(org.osetskiy.model.Circle)")
	//@Pointcut("within(org.osetskiy.model..*)")
	public void allCircleMethods() {}
	
	//@Before("args(String)")
	//@Before("args(name1)")
	//@After("args(name1)")
	//@AfterReturning(pointcut="args(name1)",returning ="returnString") // if executes fine 
	public void allString(String name1,Object returnString) 
	{
		System.out.println("Method with string args"+name1+"  output "+(String)returnString);
		
	}
	
	//@AfterThrowing("args(name)")
	//@AfterThrowing(pointcut = "args(name)", throwing = "ex")
	public void exception(String name,RuntimeException ex){
		System.out.println("method is trowns "+ex);
		
	}
	
	//@Around("allGetters()") 
	public void myArroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
		try {
			System.out.println("Before execution advice");
			proceedingJoinPoint.proceed();
			System.out.println("After execution advice");
			
			
			
		} catch (Throwable e) {			
			System.out.println("Exeption execution advice");
		}
		System.out.println("Finaly");
	}
	
	
	//@Around("allGetters()")
	//@Around("@annotation(org.osetskiy.aspect.Loggoble)")
	public Object myArroundAdviceReturn(ProceedingJoinPoint proceedingJoinPoint){
		Object retValue = null;
		try {
			System.out.println("Before execution advice");
			retValue = proceedingJoinPoint.proceed();
			
			System.out.println("After execution advice");		
			
			
			
		} catch (Throwable e) {			
			System.out.println("Exeption execution advice");
		}
		System.out.println("Finaly");
		return retValue;
	}
	
	public void loggingFromMyAdvice()
	{
		System.out.println("Proxy call");
		
	}
	
	
	
	
	
}
