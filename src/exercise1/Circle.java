//Exercise 1 : Perimeter Of A Circle.

/*
* @author: N'goran Kouadio Jean Cyrille
* @description: Write a program to find the area and perimeter of a circle
* Use the java.math libraries
* date: 09/02/2023
*/

// class cricle 
package exercise1;

public class Circle {
	// declaration part
	private double rayon;

	// default constructor
	public Circle() {
		super();
	}

	// constructor with one parameter the rayon
	public Circle(double rayon) {
		this.rayon = rayon;
	}

	// generate getter and setter
	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

	// a methode that resolve the area of circle and return a double
	public double areaCircle() {
		return Math.PI * Math.pow(rayon, 2);
	}

	// a methode that resolve the perimeter of circle and return a double
	public double perimeterCircle() {
		return Math.PI * 2 * rayon;
	}

}
