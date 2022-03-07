package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.HelloWorld;
import kr.hs.study.beans.HelloWorldEn;
import kr.hs.study.beans.HelloWorldKr;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		HelloWorldEn h1 = (HelloWorldEn)ctx.getBean("h1", HelloWorldEn.class);
		System.out.println("h1 : " + h1);
		
		HelloWorldKr h2 = (HelloWorldKr)ctx.getBean("h2", HelloWorldKr.class);
		System.out.println("h2 : " + h2);
		
		ctx.close();
	}
	

}
