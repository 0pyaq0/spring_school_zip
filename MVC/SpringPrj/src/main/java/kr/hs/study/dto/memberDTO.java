package kr.hs.study.dto;

import java.util.Date;

public class memberDTO {
	private String uname, userid, upw, uemail;
	private Date uregDate;

	public Date getUregDate() {
		return uregDate;
	}

	public void setUregDate(Date uregDate) {
		this.uregDate = uregDate;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUpw() {
		return upw;
	}

	public void setUpw(String upw) {
		this.upw = upw;
	}

	public String getUemail() {
		return uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	
	
}
