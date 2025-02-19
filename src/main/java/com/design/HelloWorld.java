package com.design;

public class HelloWorld {

	public static void main(String[] args) {
		User alex = new User("Alex");
		User mike = new User("Mike");
		System.out.println("Alex is " + alex.name);
		System.out.println("Mike is " + mike.name);
		System.out.println("--------------------");

		swap(alex, mike);
		System.out.println("Alex is " + alex.name);
		System.out.println("Mike is " + mike.name);
		System.out.println("--------------------");

		changeName(alex);
		System.out.println("Alex is " + alex.name);

	}

	public static void swap(User u1, User u2) {
		User temp = u1;
		u1 = u2;
		u2 = temp;
	}

	public static void changeName(User u) {
		u.name = "Josh";
		u = new User("Jack");
		u.name = "Adam";
	}

	public static class User {
		public String name;

		public User(String name) {
			this.name = name;
		}
	}

}
