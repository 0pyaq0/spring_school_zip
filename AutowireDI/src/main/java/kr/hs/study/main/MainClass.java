package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean3;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		//TestBean1 t1 = ctx.getBean("t1", TestBean1.class);
		//System.out.println("data1 : " + t1.getData1());
		//System.out.println("data2 : " + t1.getData2());
		
		//System.out.println("===========================================");
		
		//TestBean1 t2 = ctx.getBean("t2", TestBean1.class);
		//System.out.println("data1 : " + t2.getData1());
		//System.out.println("data2 : " + t2.getData2());
		
		//System.out.println("===========================================");
		
		//TestBean1 t3 = ctx.getBean("t3", TestBean1.class);
		//System.out.println("data3 : " + t3.getData1());
		
		System.out.println("===========================================");
		
		TestBean3 t4 = ctx.getBean("t4", TestBean3.class);
		System.out.println("data3 : " + t4.getData3());
		System.out.println("data4 : " + t4.getData4());
		
		ctx.close();

	}

}
