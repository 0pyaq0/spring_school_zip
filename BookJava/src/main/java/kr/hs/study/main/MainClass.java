package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.novel;
import kr.hs.study.config.BeanJavaConfig;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanJavaConfig.class);
		
		novel n1 = ctx.getBean("n1", novel.class);
		n1.buy();
		n1.create();
		n1.sell();
		
		ctx.close();
	}

}
