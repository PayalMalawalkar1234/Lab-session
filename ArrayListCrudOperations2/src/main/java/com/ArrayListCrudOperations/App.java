package com.ArrayListCrudOperations;

import java.util.Scanner;

import com.ArrayListCrudOperations.dao.EmployeeDao;
import com.ArrayListCrudOperations.daoimpl.EmployeeDaoImpl;
import com.ArrayListCrudOperations.model.Employee;

/**
 * Hello world!
 *
 */
public class App {
	public static void menu() {
		System.out.println("MENU:");
		System.out.println("1. Add employee");
		System.out.println("2. Delete Employee");
		System.out.println("3. Update Employee");
		System.out.println("4. Search Employee");
		System.out.println("5. Display all the Employees");
		System.out.println("6.Exit");
	}

	public static void main(String[] args) {
		// creating Scanner Object
		Scanner sc1 = new Scanner(System.in);
		// creating object of impl
		EmployeeDao company = new EmployeeDaoImpl();

		// declaring varible choice
		try {
			int ch = 0;
			do {
				menu();
				ch = sc1.nextInt();
				switch (ch) {
				case 1:
					company.addEmployee();
					System.out.println("Employee inserted..........");
					break;
				case 2:
					System.out.println("Enter the Id to be deleted:");
					int id = sc1.nextInt();
					boolean flag = company.deleteEmployee(id);
					if (flag)
						System.out.println("Employee deleted.......");
					else
						System.out.println("Employee not found......");
					break;

				case 3:
					System.out.println("Enter the Id to be updated:");
					id = sc1.nextInt();
					flag = company.updateEmployee(id);
					if (flag)
						System.out.println("Employee updated......");
					else
						System.out.println("Employee not found......");
					break;

				case 4:
					Employee e = null;
					System.out.println("Enter the Id to be searched:");
					id = sc1.nextInt();
					e = company.findEmployee(id);
					if (e == null)
						System.out.println("Employee not found.......");
					else
						System.out.println(
								"Employee Id :" + e.getId() + "  Name:" + e.getName() + "   Salary:" + e.getSalary());
					break;

				case 5:
					company.displayAll();
					break;

				case 6:
					System.exit(0);
					break;
				default:
					System.out.println("Wrong input.......");

				}

			} while (ch != 6);

			// end of do while
			sc1.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
