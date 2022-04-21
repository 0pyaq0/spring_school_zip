package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.IPrintMsg;
import kr.hs.study.beans.PrintMsg;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		PrintMsg p1 = ctx.getBean("p1", PrintMsg.class);
		p1.sayHello1();
		p1.sayHello2();
		
		ctx.close();
	}

}
