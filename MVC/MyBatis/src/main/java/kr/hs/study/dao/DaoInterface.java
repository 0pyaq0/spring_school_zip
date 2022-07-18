package kr.hs.study.dao;

import java.util.List;

import kr.hs.study.model.Databean;

public interface DaoInterface {
	public void insert(Databean dto);
	public List<Databean> select();
	public void update(Databean dto);

}
