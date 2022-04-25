package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.TestBean;
import kr.hs.study.config.BeanConfigClass;
import kr.hs.study.dao.TestDAO;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext anno = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		//1. dao 가지고 오기
		TestDAO dao = anno.getBean(TestDAO.class);
		
		//2. TestBean 객체 t1 만들어서 10, Spring 넣기
		TestBean t1 = anno.getBean(TestBean.class);
		t1.setData1(10);
		t1.setData2("spring");
		
		//3. dao의 insert_data 호출
		dao.insert_data(t1);
		
		//4. TestBean 객체 t2 만들어서 20, Spring2 넣기
		TestBean t2 = anno.getBean(TestBean.class);
		t2.setData1(20);
		t2.setData2("spring2");
		
		//5. dao의 insert_data 호출
		dao.insert_data(t2);
		
		System.out.println("inserted!!!");
		
		anno.close();
	}

}
