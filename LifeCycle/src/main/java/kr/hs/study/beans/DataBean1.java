package kr.hs.study.beans;

public class DataBean1 {
	public DataBean1() {
		System.out.println("DataBean1의 기본생성자");
	}
	
	public void init() {
		System.out.println("init-method 호출");
	}
	
	public void destroy() {
		System.out.println("destroy_method 호출");
	}

}
