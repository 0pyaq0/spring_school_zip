package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean3;
import kr.hs.study.config.ConfigBeanClass;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(ConfigBeanClass.class);
		
		TestBean3 xml3 = ctx.getBean("t3", TestBean3.class);
		System.out.println("data1 : " + xml3.getData1());
		System.out.println("data2 : " + xml3.getData2());
		System.out.println("data3 : " + xml3.getData3());
		System.out.println("data4 : " + xml3.getData4());
		
		ctx.close();
		ctx2.close();
	}

}
