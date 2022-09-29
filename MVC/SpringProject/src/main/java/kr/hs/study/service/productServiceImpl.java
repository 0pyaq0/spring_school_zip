package kr.hs.study.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.hs.study.dao.productDAO;
import kr.hs.study.dto.productDTO;

@Service
public class productServiceImpl implements productService {

	@Autowired
	private productDAO dao;

	public void insert(productDTO dto) {
		dao.insert(dto);
	}

	public List<productDTO> selectAll() {
		return dao.selectAll();
	}

	public void update(productDTO dto) {
		// TODO Auto-generated method stub
		
	}

	public productDTO read(int productId) {
		return dao.read(productId);
	}

	public productDTO detailProduct(int productId) {
		// TODO Auto-generated method stub
		return dao.detailProduct(productId);
	}

}
