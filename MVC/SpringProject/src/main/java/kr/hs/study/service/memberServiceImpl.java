package kr.hs.study.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.hs.study.dao.memberDAO;
import kr.hs.study.dto.memberDTO;

@Service
public class memberServiceImpl implements memberService {

	@Autowired
	private memberDAO dao;
	
	public void insert(memberDTO dto) {
		dao.insert(dto);
	}

	public List<memberDTO> selectAll() {
		return dao.selectAll();
	}

	public void update(memberDTO dto) {
		dao.update(dto);
	}

	public memberDTO read(String userid) {
		return dao.read(userid);
	}

	public void delete(String userid) {
		dao.delete(userid);
	}
	

}
