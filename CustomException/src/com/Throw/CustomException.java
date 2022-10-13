package com.Throw;

public class CustomException extends Exception {

	CustomException(String name, int id) {
		if (name == null) {
			System.out.println("No Name");
		}

		if (id == 0) {
			System.out.println("No id");
		}
	}
}
