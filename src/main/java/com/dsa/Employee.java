package com.dsa;

import java.io.Serializable;

public class Employee extends Super implements Serializable {
	
	private int eid;
	private String name;
	private	double sal;
	
	public Employee(int eid, String name, double sal) {
		System.out.println("is called");
		this.eid = eid;
		this.name = name;
		this.sal = sal;
	}
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}

}
