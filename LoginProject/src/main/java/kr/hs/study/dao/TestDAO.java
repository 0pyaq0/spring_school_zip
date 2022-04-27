package kr.hs.study.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.beans.TestBean;

@Component
public class TestDAO {
	@Autowired
	private JdbcTemplate db;
	
	public void insert_data(TestBean bean) {
		String sql = "insert into test values(?,?,?)";
		db.update(sql, bean.getUserid(), bean.getUserpass(), bean.getUsername() );
	}
}
