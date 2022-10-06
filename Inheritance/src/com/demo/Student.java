package com.demo;

public class Student {
	private int stdId;
	private String stdName;
	private int avgMarks;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int stdId, String stdName) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;

	}

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public int getAvgMarks() {
		return avgMarks;
	}

	public void setAvgMarks(int avgMarks) {
		this.avgMarks = avgMarks;
	}

	public void calcAvg(int... marks) {
		this.avgMarks = 0;
	}

}
