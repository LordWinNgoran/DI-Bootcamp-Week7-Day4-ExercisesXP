//Exercise 3 : Number Generators

/*
* @author: N'goran Kouadio Jean Cyrille
* @description:Create a random number generator using new Random().
* to obtain a random number from 0 to x - 1, use the method nextInt(x).
* date: 09/02/2023
*/

// class RandomNumber 
package exercise3;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	public static void generateNumber(){
		//declaration part
		int X, N;
		int[] tab;
        Scanner sc = new Scanner(System.in);
        // sk the user to enter numbers
        System.out.println("Please enter first number");
        X = sc.nextInt();
        System.out.println("Enter a second number");
         N = sc.nextInt();
         //generate a random number
        Random r = new Random();
        tab = new int[N];
        for (int i = 0; i < N; i++) {
            tab[i] = r.nextInt(X - 1) + 1;
            System.out.println(tab[i]);
        }
    }
}
