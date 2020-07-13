// Part of NoException: https://noexception.machinezoo.com
// Generated code. Edit generate.py instead.
package com.machinezoo.noexception.throwing;

import java.io.*;
import java.util.concurrent.*;
import org.junit.jupiter.api.*;

public class ThrowingRunnableTest {
	void takeThrowing(ThrowingRunnable functional) {
	}
	void takeNonThrowing(Runnable functional) {
	}
	@Test
	public void lambdas() {
		takeNonThrowing(() -> {
		});
		takeThrowing(() -> {
		});
		takeThrowing(() -> {
			if (ThreadLocalRandom.current().nextBoolean())
				throw new IOException();
			else
				return;
		});
		Throwable throwable = new IOException();
		takeThrowing(() -> {
			if (ThreadLocalRandom.current().nextBoolean())
				throw throwable;
			else
				return;
		});
	}
}
