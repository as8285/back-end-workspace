package com.kh.model.vo;

import java.util.Date;

public class Member {

	private int mememberNo;
	private String memberId;
	private String memberPwd;
	private String memberName;
	private String gender;
	private String address;
	private String phone;
	private String status;
	private Date enrollDate;
	public Member(int mememberNo, String memberId, String memberPwd, String memberName, String gender, String address,
			String phone, String status, Date enrollDate) {
		super();
		this.mememberNo = mememberNo;
		this.memberId = memberId;
		this.memberPwd = memberPwd;
		this.memberName = memberName;
		this.gender = gender;
		this.address = address;
		this.phone = phone;
		this.status = status;
		this.enrollDate = enrollDate;
	}
	public Member() {
		super();
		
	}
	public int getMememberNo() {
		return mememberNo;
	}
	public void setMememberNo(int mememberNo) {
		this.mememberNo = mememberNo;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPwd() {
		return memberPwd;
	}
	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getEnrollDate() {
		return enrollDate;
	}
	public void setEnrollDate(Date enrollDate) {
		this.enrollDate = enrollDate;
	}
	@Override
	public String toString() {
		return "Member [mememberNo=" + mememberNo + ", memberId=" + memberId + ", memberPwd=" + memberPwd
				+ ", memberName=" + memberName + ", gender=" + gender + ", address=" + address + ", phone=" + phone
				+ ", status=" + status + ", enrollDate=" + enrollDate + "]";
	}
}
