package kr.hs.study.dao;

import kr.hs.study.dto.memberDTO;

public interface memberDAO {
	public void insert(memberDTO dto);
	public void update(memberDTO dto);
	public void delete(memberDTO dto);
	public void select(memberDTO dto);
}
