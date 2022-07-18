package kr.hs.study.dao;


import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.hs.study.model.Databean;

@Repository
public class DaoImpl implements DaoInterface{

	@Autowired
	private SqlSessionTemplate sqlSession; // 실제로 디비에 접속해서 mapper.xml에 있는 쿼리 날리는 애
	
	public void insert(Databean dto) {
		sqlSession.insert("test.insert_data", dto); // mapper에 있는 것을 insert해라
		
	}
	
	public List<Databean> select() {
		return sqlSession.selectList("test.select_data");
		
	}
	
}
