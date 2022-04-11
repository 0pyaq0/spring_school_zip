package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.Designer;
import kr.hs.study.beans.Developer;
import kr.hs.study.beans.Employee;
import kr.hs.study.beans.Publisher;
import kr.hs.study.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext anno = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		Employee obj1 = anno.getBean("pub", Publisher.class);
		Employee obj2 = anno.getBean("dev", Developer.class);
		Employee obj3 = anno.getBean("des", Designer.class);
		obj1.CheckIn();
		obj2.CheckIn();
		obj3.CheckIn();
		
	}

}
