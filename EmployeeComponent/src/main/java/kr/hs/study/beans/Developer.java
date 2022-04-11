package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("dev")
public class Developer implements Employee{
	private int CheckInTime;
	private int CheckOutTime;
	
	public Developer(@Value("10") int checkInTime, @Value("6") int checkOutTime) {
		super();
		CheckInTime = checkInTime;
		CheckOutTime = checkOutTime;
	}
	
	public void CheckIn() {
		System.out.println("개발자 " + CheckInTime +"시 출근");
	};
	public void CheckOut() {
		System.out.println("개발자 " + CheckOutTime +"시 퇴근");
	};
}
