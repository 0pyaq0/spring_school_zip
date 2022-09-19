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
		return dao.selectAll();
	}

	public void update(boardDTO dto) {
		dao.update(dto);
	}

	public boardDTO read(int idx) {
		return dao.read(idx);
	}

	public void delete(int idx) {
		dao.delete(idx);
	}

	public int hit(int idx) {
		// TODO Auto-generated method stub
		return dao.hit(idx);
	}




}
