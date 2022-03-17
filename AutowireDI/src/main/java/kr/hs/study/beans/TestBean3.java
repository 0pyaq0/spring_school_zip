package kr.hs.study.beans;

public class TestBean3 {
	private DataBean3 data3;
	private DataBean3 data4;
	
	public TestBean3(DataBean3 data3, DataBean3 data4) {
		System.out.println("TestBean3 기본 생성자");
		this.data3 = data3;
		this.data4 = data4;
	}

	public DataBean3 getData3() {
		return data3;
	}

	public DataBean3 getData4() {
		return data4;
	}
	
	
	
	
}
