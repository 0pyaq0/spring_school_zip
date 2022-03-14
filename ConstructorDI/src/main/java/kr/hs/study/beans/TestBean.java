package kr.hs.study.beans;

public class TestBean {

	private int data1;
	private double data2;
	private String data3;
	
	public TestBean() {
		System.out.println("TestBean의 기본생성자");
	}
	
	public TestBean(int data1) {
		System.out.println("int형 변수 1개의 생성자");
		this.data1 = data1;
		this.data2 = 10.10;
		this.data3 = "spring1";
	}
	
	public TestBean(double data2) {
		System.out.println("double형 변수 1개의 생성자");
		this.data1 = 20;
		this.data2 = data2;
		this.data3 = "spring2";
	}
	
	public TestBean(String data3) {
		System.out.println("String형 변수 1개의 생성자");
		this.data1 = 30;
		this.data2 = 33.33;
		this.data3 = data3;
	}
	
	public TestBean(int data1,  double data2, String data3) {
		System.out.println("모두의 생성자");
		this.data1 = data1; //50
		this.data2 = data2; //55.55
		this.data3 = data3; //spring5
	}
	
	public void pr() {
		System.out.println("data1 : " + data1 );
		System.out.println("data2 : " + data2 );
		System.out.println("data3 : " + data3 );
	}
}
