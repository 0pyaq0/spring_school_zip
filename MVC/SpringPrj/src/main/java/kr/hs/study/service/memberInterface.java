package kr.hs.study.service;

import java.util.List;

import kr.hs.study.dto.memberDTO;

public interface memberInterface {
	//디비에 저장, 수정, 삭제, 가져오기 메서드 작성
	public void insert(memberDTO dto);
	public void update(memberDTO dto);
	public void delete(memberDTO dto);
	public List<memberDTO> select();
}
