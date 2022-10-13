package com.salary;

public class SalariedEmployee extends Employee {

	private int Salary;

	public SalariedEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SalariedEmployee(String name, int age, String department) {
		super(name, age, department);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calculateEmpSalary(int numOfMonths) {
		// initialize empSalary
		this.Salary = numOfMonths * 20000;

	}
}
