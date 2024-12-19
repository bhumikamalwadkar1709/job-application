package com.application.job.application.agency.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Tracker {
@Id
@GeneratedValue (strategy = GenerationType.AUTO)
public int applicationid;

private String companyname,jobtitle,email,ressumeversion;
private Date applicationdate,interviewdate;
public Tracker() {
	super();
	// TODO Auto-generated constructor stub
}
public Tracker(String companyname, String jobtitle, String email, String ressumeversion, Date applicationdate,
		Date interviewdate) {
	super();
	this.companyname = companyname;
	this.jobtitle = jobtitle;
	this.email = email;
	this.ressumeversion = ressumeversion;
	this.applicationdate = applicationdate;
	this.interviewdate = interviewdate;
}
public int getApplicationid() {
	return applicationid;
}
public void setApplicationid(int applicationid) {
	this.applicationid = applicationid;
}
public String getCompanyname() {
	return companyname;
}
public void setCompanyname(String companyname) {
	this.companyname = companyname;
}
public String getJobtitle() {
	return jobtitle;
}
public void setJobtitle(String jobtitle) {
	this.jobtitle = jobtitle;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getRessumeversion() {
	return ressumeversion;
}
public void setRessumeversion(String ressumeversion) {
	this.ressumeversion = ressumeversion;
}
public Date getApplicationdate() {
	return applicationdate;
}
public void setApplicationdate(Date applicationdate) {
	this.applicationdate = applicationdate;
}
public Date getInterviewdate() {
	return interviewdate;
}
public void setInterviewdate(Date interviewdate) {
	this.interviewdate = interviewdate;
}
@Override
public String toString() {
	return "Tracker [applicationid=" + applicationid + ", companyname=" + companyname + ", jobtitle=" + jobtitle
			+ ", email=" + email + ", ressumeversion=" + ressumeversion + ", applicationdate=" + applicationdate
			+ ", interviewdate=" + interviewdate + "]";
}


}
