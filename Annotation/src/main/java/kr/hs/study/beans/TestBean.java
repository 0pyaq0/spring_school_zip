package kr.hs.study.beans;

public class TestBean {
	private int data1;

	public TestBean() {
		System.out.println("TestBean 기본생성자");
	}
	

	public TestBean(int data1) {
		this.data1=data1;
	}
}
