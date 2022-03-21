package kr.hs.study.beans;

public class novel implements Book{

	private int price = 0;
	private String name = "";
	private String bookname = "";

	public novel(int price, String name, String bookname) {
		this.bookname = bookname;
		this.name = name;
		this.price = price;
	}

	public void buy() {
		System.out.println("kim의 소설 " + bookname + "을 " + price + " 에 구매");
	}
	public void sell() {
		System.out.println("novel 판매");
	}
	public void create() {
		System.out.println("novel 작성");
	}
}
