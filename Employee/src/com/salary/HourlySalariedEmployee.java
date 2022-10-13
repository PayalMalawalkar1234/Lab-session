package com.salary;

public class HourlySalariedEmployee extends Employee {

	private int Salary;

	public HourlySalariedEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HourlySalariedEmployee(String name, int age, String department) {
		super(name, age, department);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calculateEmpSalary(int numOfHours) {
		// initialize empSalary
		this.Salary = numOfHours * 300;
	}

}