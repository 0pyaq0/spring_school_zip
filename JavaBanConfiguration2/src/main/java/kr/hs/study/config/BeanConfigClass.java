package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import kr.hs.study.beans.TestBean1;

@Configuration
public class BeanConfigClass {
	
	@Bean
	public TestBean1 java1() {
		TestBean1 t1 = new TestBean1();
		return t1;
	}
	
	@Bean(name="new")
	@Scope("prototype")
	public TestBean1 java2() {
		TestBean1 t2 = new TestBean1();
		return t2;
	}

	@Bean
	@Lazy // getbean 메소드 실행할 때
	@Scope("prototype") // 객체를 새로 계속 생성하는 옵션
	public TestBean1 java3() {
		return new TestBean1();
	}
}
