package kr.hs.study.dao;

import java.util.List;

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
	
	public List<productDTO> selectAll() {
		return sqlsession.selectList("product.select_data");
	}

	public void update(productDTO dto) {
		// TODO Auto-generated method stub
		
	}

	public productDTO read(int productId) {
		return sqlsession.selectOne("product.read",productId);
	}

	public productDTO detailProduct(int productId) {
		return sqlsession.selectOne("product.detailProduct", productId);
	}
	
	

}
