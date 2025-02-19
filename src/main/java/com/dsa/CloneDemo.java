package com.dsa;

public class CloneDemo implements Cloneable {
	int a;
	int b;
	Cust cust;
	public CloneDemo() {
		System.out.println("object is created");
	}
	public static void main(String[] args) throws Exception {
		CloneDemo cd = new CloneDemo();
		cd.a=23;
		cd.b=34;
		cd.cust = new Cust("maly");
		CloneDemo d2 = (CloneDemo)cd.clone();
		System.out.println(cd+","+d2);
//		Class object = Class.forName("com.test.CloneDemo");	
//		Object obj = object.newInstance();
		//System.out.println(obj);
		d2.a=45;
		d2.cust.setName("maly2");
		System.out.println(cd.cust.getName()+","+d2.cust.getName());
	}
	
	
	
	
	
	
}
