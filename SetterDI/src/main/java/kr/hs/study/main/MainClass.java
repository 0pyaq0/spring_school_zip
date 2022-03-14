package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean;
import kr.hs.study.beans.TestBean2;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		TestBean t1 = ctx.getBean("t1", TestBean.class);
		System.out.println("data1 : " + t1.getData1());
		System.out.println("data2 : " + t1.getData2());
		System.out.println("data3 : " + t1.isData3());
		System.out.println("data4 : " + t1.getData4());
		
		System.out.println("==================================");
		
		TestBean2 t2 = ctx.getBean("t2", TestBean2.class);
		System.out.println("data1 : " + t2.getData1());
		System.out.println("data2 : " + t2.getData2());
		
		ctx.close();
	}

}
