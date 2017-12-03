package com.person;

public class Person {
	private String firstName;
	private String lastName;
	private int age;
	private double salary;

	public Person(String firstName, String lastName, int age, double salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.salary = salary;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getSalary() {
		return this.salary;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", salary=" + salary
				+ "]";
	}

}