package com.craftcoder.cdi.injectionpoint;

import javax.inject.Named;

@Named("C")
public class C implements A {

	@Override
	public void printName() {
		System.out.println("C");

	}

}
