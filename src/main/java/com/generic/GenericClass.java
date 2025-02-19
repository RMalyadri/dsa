package com.generic;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;

public class GenericClass<T,U> {
	private static Logger logger = System.getLogger("GenericClass");
	private T customer;
	private U product;
	public void add(T customer, U product) {
		this.customer = customer;
		this.product  = product;
	}
	
	public static <E> GenicType<E>  send(E e) {
		return new GenicType<>(e);
	}
	
	
	
	public void display() {
		logger.log(Level.INFO, customer+","+product);
	}

	public static void main(String[] args) {
		GenicType<String> genicType = GenericClass.send("maly");
		genicType.display();
		
	}

}
