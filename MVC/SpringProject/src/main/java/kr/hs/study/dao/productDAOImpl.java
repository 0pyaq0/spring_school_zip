package kr.hs.study.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.hs.study.dto.productDTO;

@Repository
public class productDAOImpl implements productDAO {
	
	@Autowired
	private SqlSessionTemplate sqlsession;

	public void insert(productDTO dto) {
		sqlsession.insert("product.insert_data",dto);
	}

}
