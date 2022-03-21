package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.Book;
import kr.hs.study.beans.magazine;
import kr.hs.study.beans.novel;
import kr.hs.study.beans.poet;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		Book n1 = ctx.getBean("n1", novel.class);
		n1.buy();
		n1.sell();
		n1.create();
		
		System.out.println("=============================");
		
		Book p1 = ctx.getBean("p1", poet.class);
		p1.buy();
		p1.sell();
		p1.create();
		
		System.out.println("=============================");
		
		Book m1 = ctx.getBean("m1", magazine.class);
		m1.buy();
		m1.sell();
		m1.create();
		
		ctx.close();
	}

}
