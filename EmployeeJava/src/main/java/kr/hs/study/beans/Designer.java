package kr.hs.study.beans;

public class Designer implements Employee{
	
	private int starttime = 0;
	private int endtime = 0;
	
	public Designer(int starttime, int endtime) {
		this.starttime=starttime;
		this.endtime=endtime;
	}
	
	public void Checkin() {
		System.out.println("디자이너 "+ starttime +"시 출근");
	}
	public void Checkout() {
		System.out.println("디자이너 "+ endtime +"시 퇴근");
	}
}
