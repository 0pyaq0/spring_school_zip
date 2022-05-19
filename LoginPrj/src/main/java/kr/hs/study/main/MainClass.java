package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.TestBean;
import kr.hs.study.config.BeanConfigClass;
import kr.hs.study.dao.TestDAO;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext anno = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		TestDAO dao = anno.getBean(TestDAO.class);
		
		TestBean t1 = anno.getBean(TestBean.class);
		t1.setUserid("kim");
		t1.setUserpassword("1111");
		
		dao.insert_data(t1);
		
		TestBean t2 = anno.getBean(TestBean.class);
		t2.setUserid("Lee");
		t2.setUserpassword("2222");
		
		dao.insert_data(t2);
		
		TestBean t3 = anno.getBean(TestBean.class);
		t3.setUserid("Park");
		t3.setUserpassword("3333");
		
		dao.insert_data(t3);
		
		System.out.println("insert!!");
		
		anno.close();
	}

}
