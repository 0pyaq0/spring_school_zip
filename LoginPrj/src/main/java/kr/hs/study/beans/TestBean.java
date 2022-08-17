package kr.hs.study.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TestBean {
	private String userid;
	private int userpassword;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public int getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(int userpassword) {
		this.userpassword = userpassword;
	}
	
	
}
