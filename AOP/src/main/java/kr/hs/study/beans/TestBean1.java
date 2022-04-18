package kr.hs.study.beans;

import org.aspectj.lang.ProceedingJoinPoint;

//targetclass
public class TestBean1 {
	public void method1() {
		System.out.println("TestBean1ÀÇ method1");
		int a = 100/0;
	}
	
	public void method2() {
		System.out.println("TestBean2ÀÇ method2");
	}
	// joint point = method1, 2
	
}
