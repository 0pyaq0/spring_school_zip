package kr.hs.study.advisor;

import org.aspectj.lang.ProceedingJoinPoint;

public class AdvisorClass {
	public void beforeMethod() {
		System.out.println("Advice의 before method");
	}
	
	public void AfterMethod() {
		System.out.println("Advice의 AfterMethod");
	}
	
	public void aroundmethod(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("around 메서드 호출1");
		pjp.proceed(); // 실제 핵심 메서드 실행
		System.out.println("around 메서드 호출2");
	}
	
	public void afterReturningMethod(){
		System.out.println("afterReturningMethod");
	}
	
	public void afterThrowableMethod(Throwable e) {
		System.out.println("afterThrowableMethod");
		System.out.println("e : " + e);
	}
}
