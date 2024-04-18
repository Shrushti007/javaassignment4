/*Write a program to calculate the square value of 
any number given by the user .
Add an exception handling block to check whether the user
enter letters instead of numbers*/
package assignment4;
import java.util.Scanner;
import java.util.*;
public class Calculate {

	public static void main(String args[]) {
		int num;

		Scanner s = new Scanner(System.in);
		System.out.print("Input a number.");

		try {
			num = s.nextInt();

			if (num < 0) {
				throw new InputMismatchException("Only Positive Numbers!");
			}

			int square = num * num;
			System.out.println("Square: " + square);
		} catch (InputMismatchException e) {
			System.out.println("invalid input! " + e.getMessage());
		}
	}
}