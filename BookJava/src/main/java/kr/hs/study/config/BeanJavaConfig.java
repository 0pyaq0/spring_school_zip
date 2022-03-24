package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.magazine;
import kr.hs.study.beans.novel;
import kr.hs.study.beans.poet;

@Configuration
public class BeanJavaConfig {

	@Bean
	public novel n1() {
		novel n1 = new novel(8000, "kim", "spring1");
		return n1;
	}
	
	@Bean
	public poet p1() {
		poet p1 = new poet(10000, "lee", "spring2");
		return p1;
	}
	
	@Bean
	public magazine m1() {
		magazine m1 = new magazine(20000, "park", "spring3");
		return m1;
	}
}
