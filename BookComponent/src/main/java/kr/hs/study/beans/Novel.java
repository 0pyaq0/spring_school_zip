package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Novel implements Book {
	@Autowired
	public BookInfo noInfo;
	
	public void buy() {
		System.out.println(noInfo.getName() + "의 소설 '" + noInfo.getBook() + "'을 " + noInfo.getPrice() + "원에 산다.");
	}
	
	public void sell() {
		System.out.println(noInfo.getName() + "의 소설 '" + noInfo.getBook() + "'을 " + noInfo.getPrice() + "원에 판다.");
	}
	
	public void create() {
		System.out.println(noInfo.getName() + "의 소설 '" + noInfo.getBook() + "'을 " + noInfo.getPrice() + "원에 쓴다.");
	}
}
