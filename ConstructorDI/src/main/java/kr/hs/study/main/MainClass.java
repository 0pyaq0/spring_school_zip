package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean;
import kr.hs.study.beans.TestBean2;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		//TestBean의 객체 t1 만들어서 obj1에 대입하여 주소출력
		/*TestBean obj1 = ctx.getBean("t1", TestBean.class);
		System.out.println("obj : " + obj1);
		obj1.pr();
		
		System.out.println("====================================");
		
		TestBean obj2 = ctx.getBean("t2", TestBean.class);
		obj2.pr();
		
		System.out.println("====================================");
		
		TestBean obj3 = ctx.getBean("t3", TestBean.class);
		obj3.pr();
		
		System.out.println("====================================");
		
		TestBean obj4 = ctx.getBean("t4", TestBean.class);
		obj4.pr();
		*/
		System.out.println("====================================");
		
		TestBean obj5 = ctx.getBean("t5", TestBean.class);
		obj5.pr();
		
		System.out.println("====================================");
		
		TestBean2 obj6 = ctx.getBean("t6", TestBean2.class);
		obj6.pr();
		
		System.out.println("====================================");
		
		TestBean2 obj7 = ctx.getBean("t7", TestBean2.class);
		obj7.pr();
		
		ctx.close();
	}

}
