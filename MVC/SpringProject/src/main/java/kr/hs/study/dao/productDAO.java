package kr.hs.study.dao;

import java.util.List;

import kr.hs.study.dto.productDTO;

public interface productDAO {
	public void insert(productDTO dto) ;
	public List<productDTO> selectAll();
	public void update(productDTO dto);
	public productDTO read(int productId);
	public productDTO detailProduct(int productId);
}
