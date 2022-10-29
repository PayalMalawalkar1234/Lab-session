package com.StudentsManagementSystem;

import java.util.HashMap;
import java.util.Scanner;

public class StudentFees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, StudentDetails> sfees = new HashMap<Integer, StudentDetails>();

		String id;
		Scanner sc = new Scanner(System.in);
		StudentDetails sd = new StudentDetails();
		sfees.put(1, new StudentDetails(101, "Ram", "Arts", 1000));
		sfees.put(2, new StudentDetails(102, "Sam", "Commerce", 1000));
		sfees.put(3, new StudentDetails(103, "Tom", "Science", 3000));
		sfees.put(4, new StudentDetails(104, "Riya", "Civil", 3000));
		sfees.put(5, new StudentDetails(105, "Piya", "Electronics", 4000));

		System.out.println("Enter The Id of Student:");
		id = sc.nextLine();

		boolean status = sfees.containsKey(id);

		if (status) {
			System.out.println("*Student Details are: *");
			sd = sfees.get(id);
			System.out.println(sd);

		}

		else {
			System.out.println(" *Student Not found* ");
		}

		sc.close();

	}

}
