package kr.hs.study.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.hs.study.dto.boardDTO;

@Repository
public class boardDAOImpl implements boardDAO{
	
	@Autowired
	private SqlSessionTemplate sqlsession;

	public void insert(boardDTO dto) {
		sqlsession.insert("board_mapper_xml.insert_board",dto);
	}

	public List<boardDTO> selectAll() {
		return null;
	}

	public void update(boardDTO dto) {
		
	}

	public boardDTO read(int idx) {
		return null;
	}

	public void delete(int idx) {
		
	}

}
