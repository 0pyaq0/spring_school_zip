package kr.hs.study.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import kr.hs.study.dto.memberDTO;

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

	public void select(memberDTO dto) {
		// TODO Auto-generated method stub

	}

}
