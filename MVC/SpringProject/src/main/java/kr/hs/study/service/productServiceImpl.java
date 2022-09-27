package kr.hs.study.service;

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

}
