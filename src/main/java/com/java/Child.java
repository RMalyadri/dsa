package com.java;

public class Child extends Parent {
	 protected int a=24;
	 public boolean getBoo() {
		   return false;
	 }
	 public static void main(String[] args) {
		 Parent p = new Child();
		 p.useBoo();
	}
}
