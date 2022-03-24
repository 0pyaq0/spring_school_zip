package kr.hs.study.beans;

public class publisher implements Employee{
	
	private int starttime = 0;
	private int endtime = 0;
	
	public publisher(int starttime, int endtime) {
		this.starttime=starttime;
		this.endtime=endtime;
	}
	
	public void Checkin() {
		System.out.println("ÆÛºí¸®¼Å "+ starttime +"½Ã Ãâ±Ù");
	}
	public void Checkout() {
		System.out.println("ÆÛºí¸®¼Å "+ endtime +"½Ã Åð±Ù");
	}
}
