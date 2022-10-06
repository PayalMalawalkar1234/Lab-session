package com.areas;

public abstract class Shapes {

	Shapes() {
		System.out.println("----Areas of Different Shapes----");

	}

	abstract void RectangleArea(float length, float breadth);

	abstract void SquareArea(float side);

	abstract void CircleArea(float radius);

}
