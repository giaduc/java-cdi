package com.craftcoder.cdi.qualifiers;

import javax.inject.Inject;

public class Checkout {

	@Inject
	// @LoggerMode(desiredMode = Mode.DEBUG)
	// @DebugMode
	// @InfoMode
	@WarnMode
	private AwesomeLogger logger;

	public void finishCheckout() {
		logger.log("Finishing Checkout");
	}

}
