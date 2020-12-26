package com.jsp.servlet;

public class MemberVO {

	private String name, id, pw, major, protocol, hobbys, phone;

	public MemberVO(String name, String id, String pw, String major, String protocol, String hobbys, String phone) {
		super();
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.major = major;
		this.protocol = protocol;
		this.hobbys = hobbys;
		this.phone = phone;
	}

	public MemberVO() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public String getHobbys() {
		return hobbys;
	}

	public void setHobbys(String[] hobbys) {
		
		String tempHobbys="";
		
		if(hobbys!=null) {
			
			for(String hobby : hobbys) {
				tempHobbys+=hobby+",";
				
			}
			tempHobbys = tempHobbys.substring(0, tempHobbys.length()-1);
		}
		
		
		
		this.hobbys = tempHobbys;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String[] phone) {
		this.phone = phone[0]+"-"+phone[1]+"-"+phone[2];
	}

	@Override
	public String toString() {
		return "MemberVO [name=" + name + ", id=" + id + ", pw=" + pw + ", major=" + major + ", protocol=" + protocol
				+ ", hobbys=" + hobbys + ", phone=" + phone + "]";
	}

}
