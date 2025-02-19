package com.design;

import com.java.Parent;

public class ChildExp implements ParentExp {

	@Override
	public void exceptionHandling() throws Exception{
		ParentExp exp = () -> System.out.println("implaetmd");	
		exp.exceptionHandling();
	}
	
  

}
