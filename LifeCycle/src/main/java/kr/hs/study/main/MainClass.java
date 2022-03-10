package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.DataBean1;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		DataBean1 d1 = ctx.getBean("d1", DataBean1.class);
		// DataBean1 d2 = ctx.getBean("d2", DataBean1.class);
		// DataBean1 d3 = ctx.getBean("d3", DataBean1.class);
		// DataBean1 d4 = ctx.getBean("d3", DataBean1.class);
		
		
		System.out.println(d1);
		
		ctx.close();

	}

}
