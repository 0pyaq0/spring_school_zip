package kr.hs.study.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.hs.study.dao.memberDAO;
import kr.hs.study.dto.memberDTO;

@Service
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

	public List<memberDTO> select (){
		return dao.select();
	}

}
