package com.craftcoder.cdi.injectionpoint;

import javax.inject.Inject;
import javax.inject.Named;

public class Checkout {

	@Inject
	private Payment payment;
	
	@Inject
	private Logger logger;
	
	@Inject @Named("B") A a;
	
	public void finishCheckout() {
		logger.log("Finishing Checkout");
		
		payment.start();
		
		a.printName();
	}
	
}
