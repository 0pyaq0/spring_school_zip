package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("des")
public class Designer implements Employee {
	
	private int CheckInTime;
	private int CheckOutTime;
	
	public Designer(@Value("8") int checkInTime, @Value("10") int checkOutTime) {
		super();
		CheckInTime = checkInTime;
		CheckOutTime = checkOutTime;
	}
	
	public void CheckIn() {
		System.out.println("디자이너 " + CheckInTime +"시 출근");
	};
	public void CheckOut() {
		System.out.println("디자이너 " + CheckOutTime +"시 퇴근");
	};
}
