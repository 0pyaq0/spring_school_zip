package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.Designer;
import kr.hs.study.beans.Developer;
import kr.hs.study.beans.Employee;
import kr.hs.study.beans.publisher;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		Employee d1 = ctx.getBean("d1", Designer.class);
		d1.Checkin();
		d1.Checkout();
		
		System.out.println("====================================");
		
		Employee d2 = ctx.getBean("d2", Developer.class);
		d2.Checkin();
		d2.Checkout();
		
		System.out.println("====================================");
		
		Employee p1 = ctx.getBean("p1", publisher.class);
		p1.Checkin();
		p1.Checkout();
		
		System.out.println("====================================");
		
		
		ctx.close();
	}

}
