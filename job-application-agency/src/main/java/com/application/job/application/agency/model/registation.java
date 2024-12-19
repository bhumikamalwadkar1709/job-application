package com.application.job.application.agency.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class registation {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int regid;
private String name, address, city, gender,contanct, emailId, password;
public registation() {
	super();
	// TODO Auto-generated constructor stub
}
public registation(String name, String address, String city, String gender, String contanct, String emailId,
		String password) {
	super();
	this.name = name;
	this.address = address;
	this.city = city;
	this.gender = gender;
	this.contanct = contanct;
	this.emailId = emailId;
	this.password = password;
}
public int getRegid() {
	return regid;
}
public void setRegid(int regid) {
	this.regid = regid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getContanct() {
	return contanct;
}
public void setContanct(String contanct) {
	this.contanct = contanct;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "registation [regid=" + regid + ", name=" + name + ", address=" + address + ", city=" + city + ", gender="
			+ gender + ", contanct=" + contanct + ", emailId=" + emailId + ", password=" + password + "]";
}

}
