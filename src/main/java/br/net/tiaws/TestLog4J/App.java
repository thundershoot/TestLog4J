package br.net.tiaws.TestLog4J;

import org.apache.log4j.*;

public class App {
	public static void main(String[] args) {
		Logger logger = LogManager.getLogger(App.class);
		logger.trace("Trace Message!");
		logger.debug("Debug Message!");
		logger.info("Info Message!");
		logger.warn("Warn Message!");
		logger.error("Error Message!");
		logger.fatal("Fatal Message!");
		System.out.println("Hello World!");
	}
}
