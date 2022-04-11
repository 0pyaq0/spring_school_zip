package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Magazine implements Book {
	@Autowired
	private BookInfo maInfo;
	
	public void buy() {
		System.out.println(maInfo.getName() + "의 잡지 '" + maInfo.getBook() + "'을 " + maInfo.getPrice() + "원에 산다.");
	}
	
	public void sell() {
		System.out.println(maInfo.getName() + "의 잡지 '" + maInfo.getBook() + "'을 " + maInfo.getPrice() + "원에 판다.");
	}
	
	public void create() {
		System.out.println(maInfo.getName() + "의 잡지 '" + maInfo.getBook() + "'을 " + maInfo.getPrice() + "원에 쓴다.");
	}

}
