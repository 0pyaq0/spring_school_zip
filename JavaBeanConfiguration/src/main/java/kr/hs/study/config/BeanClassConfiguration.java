package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.TestBean1;

// config.xml의 역할과 동일 ( bean 생성)

@Configuration  //(이 파일은 spring 객체 생성 설정 파일임을 알려준다.)
public class BeanClassConfiguration {
	
	// <bean id="t1" class="kr.hs.study.beans.Testbean1"/>
	
	@Bean // bean 생성, bean 안에 메서드 실행해서 객체를 생성하렴 ~~~~~
	public TestBean1 java1() {
		TestBean1 t1 = new TestBean1();
		return t1; // t1 객체 생성, 리턴해서 자동으로 이름으로 지정한 메소드 안으로 들어감 (java1) 그 후 컨테이너에 넣기
		// java1을 갖고와서 써야함
	} 
	
	@Bean
	public TestBean1 java2() {
		TestBean1 t2 = new TestBean1();
		return t2;
	}
	
}
