package com.softra.dto;

public class Student {
	private int stuid;
	private String fname;
	private String lname;
	
	public Student() {}

	public Student(int stuid, String fname, String lname) {
		super();
		this.stuid = stuid;
		this.fname = fname;
		this.lname = lname;
	}

	public int getStuid() {
		return stuid;
	}

	public void setStuid(int stuid) {
		this.stuid = stuid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	@Override
	public String toString() {
		return "Student [stuid=" + stuid + ", fname=" + fname + ", lname=" + lname + "]";
	}
	
	
}
