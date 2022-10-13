
package com.salary;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SalariedEmployee employee1 = new SalariedEmployee("Ram", 34, "IT");
		System.out.println(employee1);

		employee1.calculateEmpSalary(2);
		System.out.println("Employee Name is : " + employee1.getName());
		System.out.println("Employee Dept is : " + employee1.getDepartment());
		System.out.println("Employee age is : " + employee1.getAge());
		System.out.println("Employee Salary in a day is : " + employee1.getSalary() + "Rs");

		HourlySalariedEmployee employee2 = new HourlySalariedEmployee("Sam", 35, "Automobile");
		System.out.println(employee2);
		employee2.calculateEmpSalary(9);
		System.out.println("Employee Name is : " + employee2.getName());
		System.out.println("Employee Dept is : " + employee2.getDepartment());
		System.out.println("Employee age is : " + employee2.getAge());
		System.out.println("Employee Salary in a day is : " + employee2.getSalary() + "Rs");

	}

}
