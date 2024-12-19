package com.application.job.application.agency.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class JobDetails {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int jobid;

private int jobDetails,userid,salary;
private String status;
public JobDetails() {
	super();
	// TODO Auto-generated constructor stub
}
public JobDetails(int jobDetails, int userid, int salary, String status) {
	super();
	this.jobDetails = jobDetails;
	this.userid = userid;
	this.salary = salary;
	this.status = status;
}
public int getJobDetails() {
	return jobDetails;
}
public void setJobDetails(int jobDetails) {
	this.jobDetails = jobDetails;
}
public int getJobid() {
	return jobid;
}
public void setJobid(int jobid) {
	this.jobid = jobid;
}
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
@Override
public String toString() {
	return "JobDetails [jobDetails=" + jobDetails + ", jobid=" + jobid + ", userid=" + userid + ", salary=" + salary
			+ ", status=" + status + "]";
}


}
