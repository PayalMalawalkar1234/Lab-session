package com.demo;

public class SchoolStudent extends Student {

	private int avgMarks;

	public SchoolStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SchoolStudent(int stdId, String stdName) {
		super(stdId, stdName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calcAvg(int... s) {
		this.avgMarks = (s[0] + s[1] + s[2]) / 3;
	}

}
