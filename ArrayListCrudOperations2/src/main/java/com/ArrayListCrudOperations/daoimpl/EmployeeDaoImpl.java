package com.ArrayListCrudOperations.daoimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ArrayListCrudOperations.dao.EmployeeDao;
import com.ArrayListCrudOperations.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	List<Employee> eList = new ArrayList<Employee>();

	Scanner sc = new Scanner(System.in);
	// creating new employee object

	public void addEmployee() {

		Employee e = new Employee();

		// input deatails of employee
		System.out.println("Enter the id :");
		e.setId(sc.nextInt());
		System.out.println("Enter the name :");
		e.setName(sc.next());
		System.out.println("Enter the salary :");
		e.setSalary(sc.nextFloat());

		// adding the employee into the collection
		eList.add(e);
		System.out.println(e);

	}

	public boolean deleteEmployee(int id) {
		// TODO Auto-generated method stub
		boolean status = false;
		Employee el = null;
		// finding the employee
		for (Employee e : eList) {
			if (e.getId() == id)
				el = e;
		}
		// check whether the record is present
		if (el == null)
			status = false;
		else {
			eList.remove(el);
			status = true;
		}

		return status;
	}

	// to find employee
	public Employee findEmployee(int id) {

		Employee efind = null;
		// finding the student
		for (Employee e : eList) {
			if (e.getId() == id)
				efind = e;
		}

		return efind;
	}

	// to update employee
	public boolean updateEmployee(int id) {
		// TODO Auto-generated method stub
		boolean status = false;
		Employee efind = null;
		// finding the employee
		for (Employee e : eList) {
			if (e.getId() == id)
				efind = e;
		}
		if (efind != null) {
			int ch = 0;
			System.out.println("1. Update name");
			System.out.println("2. Update Salary");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter the name :");
				efind.setName(sc.next());
				System.out.println("Name updated........");
				status = true;
				break;

			case 2:
				System.out.println("Enter the salary :");
				efind.setSalary(sc.nextFloat());
				System.out.println("Marks updated........");
				status = true;
				break;

			default:
				System.out.println("No such property.....");
			}

		} else
			status = false;
		return status;
	}

	public void displayAll() {
		// TODO Auto-generated method stub

		for (Employee e : eList) {
			System.out.println(e);
		}

	}

}
