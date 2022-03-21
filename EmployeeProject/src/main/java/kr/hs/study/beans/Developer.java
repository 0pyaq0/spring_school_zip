package kr.hs.study.beans;

public class Developer implements Employee{
	public void Checkin() {
		System.out.println("개발자 10시 출근");
	}
	public void Checkout() {
		System.out.println("개발자 7시 퇴근");
	}
}
