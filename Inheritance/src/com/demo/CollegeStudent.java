package com.demo;

public class CollegeStudent extends Student {

	private int avgMarks;

	public CollegeStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CollegeStudent(int stdId, String stdName) {
		super(stdId, stdName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calcAvg(int... s) {
		this.avgMarks = (s[0] + s[1] + s[2] + s[3] + s[4]) / 5;
	}

}
