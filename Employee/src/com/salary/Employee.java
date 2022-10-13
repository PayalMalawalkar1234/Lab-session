package com.salary;

public class Employee {

	private String Name;
	private int Age;
	private String Department;
	private double Salary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int age, String department) {
		super();
		Name = name;
		Age = age;
		Department = department;

	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	public double getSalary() {
		return Salary;
	}

	@Override
	public String toString() {
		return "Employee [Name=" + Name + ", Age=" + Age + ", Department=" + Department + "]";
	}

	public void calculateEmpSalary(int timeDuration) {
		// initialize empSalary
		this.Salary = 0;
	}
}
