/*1. Create a Thread using Lambda
 *  Name: Payal Malawalkar
 *  Dt.13 October 2022
 */

package com.demo;

public class Main {
	public static void main(String[] args) {

		// anonymous class
		Drawable d = new Drawable() {
			public void draw() {
				System.out.println("I am drawing ");

			}

			@Override
			public void method1() {
				// TODO Auto-generated method stub

			}

		};

		d.draw();

		// lambda only works with functional interfaces
		// lambda with no parameters
		// (): Parameters
		// -> Arrow token
		// {}body;

		Movable d1 = () -> {
			System.out.println("I am drawing with lambda");
		};
		d1.move();

	}
}
