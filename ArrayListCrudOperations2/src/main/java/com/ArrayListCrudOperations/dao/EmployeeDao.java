package com.ArrayListCrudOperations.dao;

import com.ArrayListCrudOperations.model.Employee;

public interface EmployeeDao {

	void addEmployee();

	boolean deleteEmployee(int id);

	boolean updateEmployee(int id);

	Employee findEmployee(int id);

	void displayAll();

}
