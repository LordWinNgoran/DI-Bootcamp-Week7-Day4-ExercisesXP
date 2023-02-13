//Exercise 1 : Perimeter Of A Circle.

/*
* @author: N'goran Kouadio Jean Cyrille
* @description: Write a program to find the area and perimeter of a circle
* Use the java.math libraries
* date: 09/02/2023
*/

// class Main 
package exercise1;

public class Main {

	public static void main(String[] args) {

		// we create a instance of circle and send one parameter
		Circle cercle1 = new Circle(5);
		// The output is the area and the perimeter
		System.out.println("THe area of the circle is : " + cercle1.areaCircle());
		System.out.println("\nThe perimeter of the circle is : " + cercle1.perimeterCircle());

	}

}
