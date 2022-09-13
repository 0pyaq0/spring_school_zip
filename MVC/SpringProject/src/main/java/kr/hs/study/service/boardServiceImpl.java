package kr.hs.study.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.hs.study.dao.boardDAO;
import kr.hs.study.dto.boardDTO;

@Service
public class boardServiceImpl implements boardService{
	
	@Autowired
	private boardDAO dao;

	public void insert(boardDTO dto) {
		dao.insert(dto);
	}

	public List<boardDTO> selectAll() {
		return null;
	}

	public void update(boardDTO dto) {
		
	}

	public boardDTO read(int idx) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(int idx) {
		// TODO Auto-generated method stub
		
	}



}
