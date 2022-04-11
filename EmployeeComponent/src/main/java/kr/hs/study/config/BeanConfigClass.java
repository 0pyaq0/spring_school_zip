package kr.hs.study.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("kr.hs.study.beans") // beans 폴더 파일을 다 스캔해서 자동 객체 생성
public class BeanConfigClass {
	

}
