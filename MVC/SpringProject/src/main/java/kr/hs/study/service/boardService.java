package kr.hs.study.service;

import java.util.List;

import kr.hs.study.dto.boardDTO;

public interface boardService {
	public void insert(boardDTO dto);
	public List<boardDTO> selectAll();
	public void update(boardDTO dto);
	public boardDTO read(int idx);
	public void delete(int idx);
}
