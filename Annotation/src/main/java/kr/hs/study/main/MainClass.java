package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.config.BeanJavaConfig;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		TestBean2 obj2 = ctx.getBean("t2", TestBean2.class);
		System.out.println("data1 : " + obj2.getData1());
		
		System.out.println("------------------");
		
		TestBean2 obj_xml1 = ctx.getBean("t2", TestBean2.class);
		System.out.println("data1 : " + obj_xml1.getData1());
		System.out.println("data2 : " + obj_xml1.getData2());
		
		ctx.close();
		
		System.out.println("-------------------------------------------");
		
//		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanJavaConfig.class);
//		
//		TestBean2 obj3 = ctx2.getBean("java1", TestBean2.class);
//		System.out.println("data1 : " + obj3);
		
		
//		ctx2.close();
	}

}
