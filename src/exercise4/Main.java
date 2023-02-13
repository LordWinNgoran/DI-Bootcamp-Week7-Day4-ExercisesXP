// Exercise 4 : Java Conventions Exercise

/*
* @author: N'goran Kouadio Jean Cyrille
* @description: 1- Declare a class named Person with three instance variables: firstName, lastName, and age.
* 2- Create a constructor for the class that takes in three arguments: firstName, lastName, and age. 
* Assign the arguments to the instance variables.
* 3- Add getters and setters for each instance variable. The naming conventions for getters and setters are as 
* follows: get + variable name for getters, and set + variable name for setters.
* 4- Add a method named introduce that returns a string introducing the person in the following format: 
* "Hello, my name is [firstName] [lastName] and I am [age] years old."
* 
* date: 09/02/2023
*/

// class Person 
package exercise4;

public class Main {

	public static void main(String[] args) {
		 //We create a instance of Person with parameters
        Person person1 = new Person("Lordwin", "James", 25);
        System.out.println(person1.introduce());

	}

}
