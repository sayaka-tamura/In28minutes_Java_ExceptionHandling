/**
 * @author : Sayaka Tamura
 * May 10, 2019
 * Udemy Java Exception Handling
 * https://www.youtube.com/watch?v=34ttwuxHtAE&list=WL&index=6
 */
package com.in28minutes.exceptionhandling;

import java.util.Scanner;

public class FinallyRunner {

	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			int[] numbers = { 12, 3, 4, 5 };
			int number = numbers[5];
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Before Scanner Close");
			if (scanner != null)
				scanner.close();
		}
		System.out.println("Just before closing out main");
	}

}
