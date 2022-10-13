package com.demo;

public interface Drawable {

	public void draw();

	default void saySketche() {
		System.out.println("Sketches");
		method1();

	}

	public void method1();
}
