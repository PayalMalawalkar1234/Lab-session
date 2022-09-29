package com.aggregation;

public class Author {
	private String Authorname;
	private int age;

	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Author(String authorname, int age) {
		super();
		this.Authorname = authorname;
		this.age = age;
	}

	public String getName() {
		return getName();
	}

	public void setName(String name) {
		this.Authorname = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Author [Authorname=" + Authorname + ", age=" + age + "]";
	}

}
