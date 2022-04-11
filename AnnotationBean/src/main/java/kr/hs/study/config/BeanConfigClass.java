package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.DataBean1;
import kr.hs.study.beans.DataBean2;
import kr.hs.study.beans.DataBean3;
import kr.hs.study.beans.DataBean4;
import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;

@Configuration
public class BeanConfigClass {
	
	@Bean
	public TestBean1 java1() {
		return new TestBean1();
	}
	
	@Bean
	public DataBean1 data1() {
		return new DataBean1();
	}
	
	@Bean
	public DataBean2 data2() {
		return new DataBean2();
	}
	
	@Bean
	public TestBean3 java3() {
		return new TestBean3(new DataBean3(), new DataBean4());
	}
	
}
