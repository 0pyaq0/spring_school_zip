package kr.hs.study.dao;

import java.util.List;

import kr.hs.study.dto.boardDTO;

public interface boardDAO {
	public void insert(boardDTO dto) ;
	public List<boardDTO> selectAll();
	public void update(boardDTO dto);
	public boardDTO read(int idx);
	public void delete(int idx);
	public int hit(int idx);
}
