package com.craftcoder.cdi.injectionpoint;

import javax.inject.Named;

@Named("B")
public class B implements A {

	@Override
	public void printName() {
		System.out.println("B");
	}

}
