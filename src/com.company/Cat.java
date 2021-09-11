package com.company;

public class Cat {
	String name;
	int age;

	public void sayMeow() {
		System.out.println(name + " meowed");
	}

	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}
}