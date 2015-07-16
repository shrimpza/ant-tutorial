package net.shrimpworks.ant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Application's main class.
 */
public class Main {

	public static void main(String... args) {
		Logger logger = LoggerFactory.getLogger(Main.class);

		// create a hello world instance...
		HelloWorld hw = new HelloWorld();

		// ... and use it to print Hello World.
		logger.info(hw.helloWorld());
	}
}