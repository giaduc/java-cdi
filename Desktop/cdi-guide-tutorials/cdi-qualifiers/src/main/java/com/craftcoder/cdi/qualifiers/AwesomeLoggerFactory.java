package com.craftcoder.cdi.qualifiers;

import javax.enterprise.inject.Produces;

public class AwesomeLoggerFactory {

	@Produces
	@DebugMode
	public AwesomeLogger createDebugLogger() {
		boolean debugMode = true;
		LogConfiguration logInDebugMode = new LogConfiguration(false, debugMode, false);

		return new AwesomeLogger(logInDebugMode);
	}

	@Produces
	@InfoMode
	public AwesomeLogger createInfoLogger() {
		boolean infoMode = true;
		LogConfiguration logInInfoMode = new LogConfiguration(infoMode, false, false);

		return new AwesomeLogger(logInInfoMode);
	}

	@Produces
	@WarnMode
	public AwesomeLogger createWarnLogger() {
		boolean warnMode = true;
		LogConfiguration logInWarnMode = new LogConfiguration(false, false, warnMode);

		return new AwesomeLogger(logInWarnMode);
	}

}
