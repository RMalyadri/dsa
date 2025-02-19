package com.java;

public enum MyEnum {
	
	METHOD1{
		public void impl() {
			System.out.println("one");
			
		}
	},
	METHOD2{
		public void impl() {
			System.out.println("two");
		}
	};
	
//	public String getName() {
//		return name;
//	}
//	
	public abstract void impl();

}
