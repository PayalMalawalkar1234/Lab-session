package com.Throw;

public class Student {

	static void checkStudent(String stdName, int stdId) throws CustomException {

		if (stdName == null || stdId == 0) {

			throw new CustomException(stdName, stdId);
		}

		else {

			System.out.println("Student name is : " + stdName);
			System.out.println("Student Id is : " + stdId);
		}
	}

	public static void main(String[] args) throws CustomException {
		// student variables
		String stdName = "sam";
		int stdId = 101;

		// calling check student method
		checkStudent(stdName, stdId);

	}

}
