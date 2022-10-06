package com.demo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// For College Student
		CollegeStudent cS = new CollegeStudent(101, "Payal");
		cS.calcAvg(78, 77, 87, 88, 90);

		System.out.println("Student Details");
		System.out.println("Student Id is: " + cS.getStdId());
		System.out.println("Student Name is: " + cS.getStdName());
		System.out.println("Student Average marks is: " + cS.getAvgMarks());

		// For School Student

		SchoolStudent sS = new SchoolStudent(102, "Priya");
		cS.calcAvg(98, 77, 85);

		System.out.println("Student Details");
		System.out.println("Student Id is: " + sS.getStdId());
		System.out.println("Student Name is: " + sS.getStdName());
		System.out.println("Student average marks is: " + sS.getAvgMarks());
	}

}
