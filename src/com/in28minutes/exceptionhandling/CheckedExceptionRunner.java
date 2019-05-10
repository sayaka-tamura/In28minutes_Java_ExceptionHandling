/**
 * @author : Sayaka Tamura
 * May 10, 2019
 * Udemy Java Exception Handling
 * https://www.youtube.com/watch?v=34ttwuxHtAE&list=WL&index=6
 */
package com.in28minutes.exceptionhandling;

public class CheckedExceptionRunner {
	public static void main(String[] args) {
		/*
		 * try { someOtherMethod(); Thread.sleep(2000); } catch (InterruptedException e)
		 * { e.printStackTrace(); }
		 */
		// someOtherMethod(); // having an error
		someOtherMethod2();
	}

	private static void someOtherMethod2() throws RuntimeException {

	}

	private static void someOtherMethod() throws InterruptedException {
		Thread.sleep(2000);
	}
}
