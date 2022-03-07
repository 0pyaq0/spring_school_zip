package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;

public class MainClass {

	public static void main(String[] args) {
		
		// xml 로딩하고 TestBean1의 객체 주소값 출력
		
		// 객체 생성 시 항상 제일 먼저 기본 생성자 실행
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		TestBean1 t1 = ctx.getBean("t1", TestBean1.class);
		System.out.println("t1 : " + t1);
		
		TestBean2 t2 = ctx.getBean("t2", TestBean2.class);
		System.out.println("t2 : " + t2);
		
		TestBean2 t3 = ctx.getBean("t2", TestBean2.class);
		System.out.println("t3 : " + t3);
		
		ctx.close();

	}

}