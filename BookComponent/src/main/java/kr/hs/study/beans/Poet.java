package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Poet implements Book{
	@Autowired
	public BookInfo poInfo;
	
	public void buy() {
		System.out.println(poInfo.getName() + "의 시 '" + poInfo.getBook() + "'를 " + poInfo.getPrice() + "원에 산다.");
	}
	
	public void sell() {
		System.out.println(poInfo.getName() + "의 시 '" + poInfo.getBook() + "'를 " + poInfo.getPrice() + "원에 판다.");
	}
	
	public void create() {
		System.out.println(poInfo.getName() + "의 시 '" + poInfo.getBook() + "'를 " + poInfo.getPrice() + "원에 쓴다.");
	}
}
