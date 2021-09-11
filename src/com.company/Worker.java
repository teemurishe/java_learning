package com.company;

public class Worker {
	String snf;
	String job;
	String email;
	String phone;
	int salary;
	int age;


	public void workerInfo() {
		System.out.println(Worker);
	}

	public Worker(String snf, String job, String email, String phone, int salary, int age) {
		this.snf = snf;
		this.job = job;
		this.email = email;
		this.phone = phone;
		this.salary = salary;
		this.age = age;
	}
}