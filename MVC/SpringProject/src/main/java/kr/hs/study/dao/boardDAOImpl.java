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
		return sqlsession.selectList("board_mapper_xml.select_board");
	}

	public void update(boardDTO dto) {
		sqlsession.update("board_mapper_xml.update_board", dto);
	}

	public boardDTO read(int idx) {
		return sqlsession.selectOne("board_mapper_xml.read",idx);
	}

	public void delete(int idx) {
		sqlsession.delete("board_mapper_xml.delete_board", idx);
	}

	public int hit(int idx) {
		// TODO Auto-generated method stub
		return sqlsession.update("board_mapper_xml.update_board", idx);
	}

}
