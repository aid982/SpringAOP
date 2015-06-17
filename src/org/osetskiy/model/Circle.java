package org.osetskiy.model;

import org.osetskiy.aspect.Loggoble;

public class Circle {
	private String name;
    @Loggoble
	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Set method is called ");
		this.name = name;
	//	throw(new RuntimeException());
	}
	
	public String setNameReturn(String name) {
		System.out.println("Set method is called ");
		this.name = name;
		return name;
		
	}
	
	
	
	

}
