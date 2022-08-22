package kr.hs.study.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.hs.study.dto.memberDTO;

@Repository
public class memberDAOImpl implements memberDAO {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	public void insert(memberDTO dto) {
		sqlSession.insert("member.insert_data", dto);
	}

	public void update(memberDTO dto) {
		// TODO Auto-generated method stub

	}

	public void delete(memberDTO dto) {
		// TODO Auto-generated method stub

	}

	public List<memberDTO> select() {
		return sqlSession.selectList("member.select_data");
		
	}

}
