package com.covid.epass.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class UserPojo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int aid;
private String destination;
private String proofno;
private String mobileno;
private String upurpose;
private int noOfperson;
private String startDate;
private String endDate;
private String vtype;
private String vNo;
private String email;
private String address;
private String gender;
private String uname;
private String district;

//Setting default value as OnProcess in database when user applies for pass
@Column(name="status")
private String status="OnProcess";
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getProofno() {
	return proofno;
}
public void setProofno(String proofno) {
	this.proofno = proofno;
}
public String getMobileno() {
	return mobileno;
}
public void setMobileno(String mobileno) {
	this.mobileno = mobileno;
}
public String getUpurpose() {
	return upurpose;
}
public void setUpurpose(String upurpose) {
	this.upurpose = upurpose;
}
public int getNoOfperson() {
	return noOfperson;
}
public void setNoOfperson(int noOfperson) {
	this.noOfperson = noOfperson;
}
public String getStartDate() {
	return startDate;
}
public void setStartDate(String startDate) {
	this.startDate = startDate;
}
public String getEndDate() {
	return endDate;
}
public void setEndDate(String endDate) {
	this.endDate = endDate;
}
public String getVtype() {
	return vtype;
}
public void setVtype(String vtype) {
	this.vtype = vtype;
}
public String getvNo() {
	return vNo;
}
public void setvNo(String vNo) {
	this.vNo = vNo;
}
public int getAid() {
	return aid;
}
public void setAid(int aid) {
	this.aid = aid;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getDistrict() {
	return district;
}
public void setDistrict(String district) {
	this.district = district;
}
public String getDestination() {
	return destination;
}
public void setDestination(String destination) {
	this.destination = destination;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
@Override
public String toString() {
	return "UserPojo [aid=" + aid + ", destination=" + destination + ", proofno=" + proofno + ", mobileno=" + mobileno
			+ ", upurpose=" + upurpose + ", noOfperson=" + noOfperson + ", startDate=" + startDate + ", endDate="
			+ endDate + ", vtype=" + vtype + ", vNo=" + vNo + ", email=" + email + ", address=" + address + ", gender="
			+ gender + ", uname=" + uname + ", district=" + district + ", status=" + status + "]";
}


}
