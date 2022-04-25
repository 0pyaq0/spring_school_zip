package kr.hs.study.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.beans.TestBean;

@Component
public class TestDAO {
	// jdbc template을 자동주입, 실제 쿼리를 알려준다.
	@Autowired
	private JdbcTemplate db; 
	
	
	//실제 쿼리 작성
	
	
	//1. insert
	public void insert_data(TestBean bean) { // 자동으로 TestBean의 주소값을 주입한다
		// container에 있는 TestBean의 객체가 bean에 자동주입된다.
		String sql = "insert into test values(?,?)";
		db.update(sql, bean.getData1(), bean.getData2());
	}
}
