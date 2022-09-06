package kr.hs.study.dao;

import java.util.List;

import kr.hs.study.dto.memberDTO;

public interface memberDAO {
	public void insert(memberDTO dto) ;
	public List<memberDTO> selectAll();
	public void update(memberDTO dto);
	public memberDTO read(String userid);
	public void delete(String userid);
}
