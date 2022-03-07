package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		
		// config.xml을 로딩시킨다 : 객체를 생성해서 컨테이너에 보관한다.
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		// getBean : 컨테이너에 있는 객체를 java파일에 갖고와서 사용하기 위해 쓴다
		TestBean t1 = (TestBean)ctx.getBean("t1");  // id값 : object
		
		System.out.println("t1 : " + t1); // t1이 있는 메모리의 주소값이 찍힌다
		
		
		//TestBean t2 = (TestBean)ctx.getBean("t2");
		TestBean t2 = (TestBean)ctx.getBean("t1", TestBean.class);
		System.out.println("t2 : " + t2);
		
		ctx.close();
	}

}
