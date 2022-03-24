package kr.hs.study.beans;

public class poet implements Book{

	private int price = 0;
	private String name = "";
	private String bookname = "";

	public poet(int price, String name, String bookname) {
		this.bookname = bookname;
		this.name = name;
		this.price = price;
	}

	public void buy() {
		System.out.println("lee의 시 "  + bookname + "을 " + price + " 에 구매");
	}
	public void sell() {
		System.out.println("poet 판매");
	}
	public void create() {
		System.out.println("poet 작성");
	}
}