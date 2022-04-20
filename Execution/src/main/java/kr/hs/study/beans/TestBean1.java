package kr.hs.study.beans;

public class TestBean1 {
	public void method1() {
		System.out.println("beans의 TestBean1의 method1");
	}
	public void method1(int a1) {
		System.out.println("int 매개변수 method1");
	}
	public void method1(String s1) {
		System.out.println("String 매개변수 method1");
	}
	public void method1(int a1, int a2) {
		System.out.println("정수형 매개변수2개 method1");
	}
	public void method1(int a1, String a2) {
		System.out.println("정수형 1개 , 문자열 매개변수1개 method1");
	}
	public int method1(int a1, int a2, int a3) {
		return a1+a2+a3;
	}
	
	public void method2() {
		System.out.println("beans의 TestBean1의 method2");
	}
}
