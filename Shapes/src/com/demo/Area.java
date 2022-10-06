package com.demo;

public class Area extends Shapes {
	double Area = 0;

	@Override
	void RectangleArea(float length, float breadth) {

		Area = length * breadth;
		System.out.println("Area of Rectangle is: " + Area);

	}

	@Override

	void SquareArea(float Side) {

		Area = Side * Side;

		System.out.println("Area of Square is: " + Area);

	}

	@Override

	void CircleArea(float radius) {

		Area = (radius * radius) * 3.14;

		System.out.println("Area of Circle is: " + Area);

	}

}
