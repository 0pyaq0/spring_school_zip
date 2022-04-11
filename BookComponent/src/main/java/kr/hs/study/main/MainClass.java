package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.Book;
import kr.hs.study.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext anno = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		ClassPathXmlApplicationContext xml = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		Book xml1 = xml.getBean("novel", Book.class);
		Book xml2 = xml.getBean("poet", Book.class);
		Book xml3 = xml.getBean("magazine", Book.class);
		
		System.out.println("---xml");
		xml1.buy();
		xml2.buy();
		xml3.buy();
		
		Book novel = anno.getBean("novel", Book.class);
		Book poet = anno.getBean("poet", Book.class);
		Book magazine = anno.getBean("magazine", Book.class);
		
		System.out.println("---anno");
		novel.buy();
		poet.buy();
		magazine.buy();
	}

}
