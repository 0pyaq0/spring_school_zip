package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.Designer;
import kr.hs.study.beans.Developer;
import kr.hs.study.beans.publisher;

@Configuration
public class BeanJavaConfig {

	@Bean
	public Designer d1() {
		Designer d1 = new Designer(8, 11);
		return d1;
	}
	
	@Bean
	public Developer d2() {
		Developer d2 = new Developer(11, 6);
		return d2;
	}
	
	@Bean
	public publisher p1() {
		publisher p1 = new publisher(10, 10);
		return p1;
	}
}
