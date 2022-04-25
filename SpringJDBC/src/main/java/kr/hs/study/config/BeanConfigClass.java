package kr.hs.study.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@ComponentScan({"kr.hs.study.beans", "kr.hs.study.dao"})
public class BeanConfigClass {
// 데이터베이스 접속정보 ( BasicDataSource 사용 )
	
	@Bean
	public BasicDataSource source() {
		BasicDataSource source = new BasicDataSource();
		source.setDriverClassName("oracle.jdbc.OracleDriver");
		source.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		source.setUsername("scott");
		source.setPassword("tiger");
		
		return source;
	}
	
	@Bean
	// db에 접속해서 실제 쿼리를 실행하는 애를 bean으로 등록, 자동 주입해서 갖고와야함
	public JdbcTemplate db (BasicDataSource source) {
		JdbcTemplate db = new JdbcTemplate(source);
		return db;
	}
}
