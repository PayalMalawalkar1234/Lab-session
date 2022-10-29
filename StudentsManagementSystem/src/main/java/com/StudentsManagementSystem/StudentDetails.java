package com.StudentsManagementSystem;

public class StudentDetails {

	private int studentId;
	private String studentName;
	private String studentCourse;
	private int studentFees;

	public StudentDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentDetails(int studentId, String studentName, String studentCourse, int studentFees) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentCourse = studentCourse;
		this.studentFees = studentFees;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentCourse() {
		return studentCourse;
	}

	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}

	public int getStudentFees() {
		return studentFees;
	}

	public void setStudentFees(int studentFees) {
		this.studentFees = studentFees;
	}

	@Override
	public String toString() {
		return "StudentDetails [studentId=" + studentId + ", studentName=" + studentName + ", studentCourse="
				+ studentCourse + ", studentFees=" + studentFees + "]";
	}

}
