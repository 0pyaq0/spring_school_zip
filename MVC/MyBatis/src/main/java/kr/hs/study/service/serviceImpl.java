package kr.hs.study.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.hs.study.dao.DaoInterface;
import kr.hs.study.model.Databean;

@Service
public class serviceImpl implements serviceInterface {
	
	@Autowired
	private DaoInterface dao;
	
	public void insert(Databean dto) {
		dao.insert(dto);
	}
	
	public List<Databean> select(){
		return dao.select();
	}

}
