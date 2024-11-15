package com.sam.spring1;

import org.springframework.beans.factory.annotation.Autowired;

public class Alien {
	@Autowired
	private int age;
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
//	public void Alien(int age) {
//		this.age = age;
//	}
	public void code() {
		System.out.println("coding..");
	}

}
