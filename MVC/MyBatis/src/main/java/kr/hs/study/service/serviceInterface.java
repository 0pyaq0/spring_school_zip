package kr.hs.study.service;

import java.util.List;

import org.springframework.ui.Model;

import kr.hs.study.model.Databean;

public interface serviceInterface {
	public void insert(Databean dto);
	public List<Databean> select();
	public void update(Databean dto);
}
