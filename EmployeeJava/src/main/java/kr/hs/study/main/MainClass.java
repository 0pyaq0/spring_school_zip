package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.Designer;
import kr.hs.study.beans.Developer;
import kr.hs.study.beans.publisher;
import kr.hs.study.config.BeanJavaConfig;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanJavaConfig.class);
		
		Designer d1 = ctx.getBean("d1", Designer.class);
		d1.Checkin();
		d1.Checkout();
		
		System.out.println("==================================");
		
		Developer d2 = ctx.getBean("d2", Developer.class);
		d2.Checkin();
		d2.Checkout();
		
		System.out.println("==================================");
		
		publisher p1 = ctx.getBean("p1", publisher.class);
		p1.Checkin();
		p1.Checkout();
		
		System.out.println("==================================");
		
		ctx.close();
	}

}
