package kr.hs.study.service;

import org.springframework.beans.factory.annotation.Autowired;

import kr.hs.study.dao.memberDAO;
import kr.hs.study.dto.memberDTO;

public class memberImpl implements memberInterface {
	
	@Autowired
	memberDAO dao;

	public void insert(memberDTO dto) {
		dao.insert(dto);
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
