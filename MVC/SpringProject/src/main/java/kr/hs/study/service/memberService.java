package kr.hs.study.service;

import java.util.List;

import kr.hs.study.dto.memberDTO;

public interface memberService {
	//디비에 저장, 수정, 삭제, 가져오기 메서드 작성
	public void insert(memberDTO dto);
	public List<memberDTO> selectAll();
	public void update(memberDTO dto) ;
	public memberDTO read(String userid);
	public void delete(String userid);

}
