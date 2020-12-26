package com.lost.dto;

public class MenuVO {
	private String mcode; // 메뉴 코드
	private String mname; // 메뉴 이름
	private String murl;  // 메뉴  url
	private String upcode; // 상위메뉴 코드
	private int isnav; //메뉴 레벨
	
	public MenuVO() {}
	
	public MenuVO(String mcode, String mname, String murl, String upcode, int isnav) {
		super();
		this.mcode = mcode;
		this.mname = mname;
		this.murl = murl;
		this.upcode = upcode;
		this.isnav = isnav;
	}

	public String getMcode() {
		return mcode;
	}

	public void setMcode(String mcode) {
		this.mcode = mcode;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getMurl() {
		return murl;
	}

	public void setMurl(String murl) {
		this.murl = murl;
	}

	public String getUpcode() {
		return upcode;
	}

	public void setUpcode(String upcode) {
		this.upcode = upcode;
	}

	public int getIsnav() {
		return isnav;
	}

	public void setIsnav(int isnav) {
		this.isnav = isnav;
	}

	@Override
	public String toString() {
		return "MenuVO [mcode=" + mcode + ", mname=" + mname + ", murl=" + murl + ", upcode=" + upcode + ", isnav="
				+ isnav + "]";
	}



	
	
	
}
