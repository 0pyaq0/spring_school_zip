package kr.hs.study.service;

import java.util.List;

import kr.hs.study.dto.productDTO;

public interface productService {
	public void insert(productDTO dto);
	public List<productDTO> selectAll();
	public void update(productDTO dto) ;
	public productDTO read(int productId);
	public productDTO detailProduct(int productId);
}
