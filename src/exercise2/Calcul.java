//Exercise 2 : Calculate The Product

/*
* @author: N'goran Kouadio Jean Cyrille
* @description: Write a java program that takes three inputs from the user and calculates the product:
* average,
* sum,
* largest, and smallest of the three numbers.
* Use the java.math libraries
* date: 09/02/2023
*/

// class Calcul 
package exercise2;

import java.util.Scanner;

public class Calcul {

	// a public static method to make operation
	public static void calcul() {
		// declaration part
		int firstNumnber, secondnumber, thirdNumber;
		int[] tab;
		System.out.println("## WELCOME TO OUR CALCULATION SYSTEM");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the first number ");
		firstNumnber = sc.nextInt();

		System.out.println("Please enter the second number");
		secondnumber = sc.nextInt();

		System.out.println("Please enter a thrid number");
		thirdNumber = sc.nextInt();

		System.out.println("The : " + multiplicity(firstNumnber, secondnumber, thirdNumber));
		System.out.println("The sum is : " + sum(firstNumnber, secondnumber, thirdNumber));
		System.out.println("The average is: " + average(firstNumnber, secondnumber, thirdNumber));
		tab = smallestNumber(firstNumnber, secondnumber, thirdNumber);
		System.out.println("the smallest number is : " + tab[0] + "\n the greatest number is: " + tab[1]);
	}

	// the method make the multiplicity of each member and return a integer
	private static int multiplicity(int x, int y, int z) {
		int multiplicity = x * y * z;
		return multiplicity;
	}

	// the method make the sum of each member and return a integer
	private static int sum(int x, int y, int z) {
		int somme = Integer.sum(Integer.sum(x, y), z);
		return somme;
	}

	// the method make the average of all number and return a integer
	private static double average(int x, int y, int z) {
		double average = multiplicity(x, y, z) / 3;
		return average;
	}
	// the method return a array of number in order

	private static int[] smallestNumber(int x, int y, int z) {
		int small = Math.min(Math.min(x, y), z);
		int great = Math.max(Math.max(x, y), z);
		return new int[] { small, great };
	}

}
