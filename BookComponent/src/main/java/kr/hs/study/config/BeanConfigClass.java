package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.BookInfo;

@Configuration
@ComponentScan(basePackages = "kr.hs.study.beans")
public class BeanConfigClass {
	@Bean
	public BookInfo noInfo() {
		return new BookInfo("Kim", "spring", 8000);
	}

	@Bean
	public BookInfo poInfo() {
		return new BookInfo("Lee", "spring2", 10000);
	}
	
	@Bean
	public BookInfo maInfo() {
		return new BookInfo("Park", "spring3", 20000);
	}
	
}
