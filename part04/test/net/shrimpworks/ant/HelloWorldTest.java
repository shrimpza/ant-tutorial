package net.shrimpworks.ant;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {

	@Test
	public void shouldSayHelloWorld() {
		final HelloWorld helloWorld = new HelloWorld();

		assertEquals("Hello World!", helloWorld.helloWorld());
	}

}