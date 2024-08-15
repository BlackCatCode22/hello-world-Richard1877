// This is a comment
/*
*Richard Schoelles
* 08/15/2014
* AddTwoNumbers Java
 */

import java.util.Scanner;  // Import the Scanner class


public class AddTwoNumbers {
    public static void main(String[] args) {
        System.out.println ("\n\n Welcome to the Double Int Program !\n\n");

        int firstnum = 0;
        int secondNum = 0;
        int sumOfBothNumbers = 0;

        System.out.println("\n The value of sumOfBothNumbers is: " + sumOfBothNumbers);

        // Create a scanner subject
        Scanner myScannerObject = new Scanner (System.in);

        // Ask USer for the first int
        System.out.println("\n Please enter a whole nimber: ");
        firstnum = myScannerObject.nextInt();

        // Unit test for our first user input
        System.out.println("\n The value of firstnum is: " + firstnum);

        // Ask USer for the second int
        System.out.println("\n Please enter a second whole number: ");
        secondNum = myScannerObject.nextInt();

        // Unit test for our second user input
        System.out.println("\n The value of secondNum is: " + secondNum);

        // Processong
        // Add the two ints unput from the user.
        // the total of firstnum and secondNum will be stored in
        // the variable named: sumOfBothNumbers

        sumOfBothNumbers = firstnum + secondNum;

        // Output the value of the variable named: sumOfBothNumbers
        System.out.println("\n The value of sumOfBothNumbers is: " + sumOfBothNumbers);

    }
}