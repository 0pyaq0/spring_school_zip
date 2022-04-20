package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		TestBean1 t1 = ctx.getBean("t1", TestBean1.class);
		t1.method1();
		t1.method2();
		t1.method1(100);
		t1.method1("심이진");
		t1.method1(100, 50);
		t1.method1(10, "심이진");
		t1.method1(10, 10, 10);
		
		ctx.close();
	}

}
