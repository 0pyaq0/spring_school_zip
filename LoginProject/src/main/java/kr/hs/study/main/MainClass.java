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
		t1.setUserpass(1111);
		t1.setUsername("김다리");
		
		dao.insert_data(t1);
		
		TestBean t2 = anno.getBean(TestBean.class);
		t2.setUserid("lee");
		t2.setUserpass(2222);
		t2.setUsername("이로니");
		
		dao.insert_data(t2);
		
		TestBean t3 = anno.getBean(TestBean.class);
		t3.setUserid("park");
		t3.setUserpass(3333);
		t3.setUsername("박호니");
		
		dao.insert_data(t3);
		
		System.out.println("insert!!");
		
		anno.close();
	}

}
