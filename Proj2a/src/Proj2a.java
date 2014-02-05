/*===========================================================================================
 |	Assignment:	Program #2(a): Hailstones
 |	    Author:	Gabriel Perez
 |    Sect. Leader:	Patrick Hickey
 |
 |	    Course:	CSc 227
 |	Instructor:	L. McCann
 |	  Due Date:	February 4, 2014, by 9:00 p.m. MST
 |
 |	Description:	Given a positive integer value, this program
 |			will determine if the value is odd or even and
 |			conduct the correct equation to calculate the
 |			hailstone sequence. This program will also count
 |			the number of values within the sequence and will
 |			also display the max value within the sequence.
 |
 |    Deficiencies:	None known; this program meets specifications.
*=============================================================================================*/

import java.util.*;	//Java API's "util" package has the Scanner class

public class Proj2a
{

	public static void main(String [] args)
	{
		int startingValue,	// Positive integer user will input to start hailstone
			count = 0,	// Keeps track of how many time the loop is executed
			temp,		// Stores the intial integer before altercation
			max = 0,	// Stores the number with the highest value
			total = 1; 	// Counts how many numbers are within the series

		Scanner keyboard;	// To reference Scanner object for keyboard input

		keyboard = new Scanner (System.in);

		System.out.print("Enter the starting value for the hailstone sequence:");
		startingValue = keyboard.nextInt();	// Retrieve positive integer from keyboard

		// Do-While loop to check for incorrect input from user
		do{
			if(startingValue < 0){
				System.out.print("I'm sorry but you have entered an invaild response!"
						+ "Please choose a number greater than zero: ");
				startingValue = keyboard.nextInt();
			}

		}while(startingValue < 0);

		// Displays the starting number of the hailstones sequence
		System.out.println("\nThe sequence of hailstones formed from " + startingValue
						  + " is :\n");

		// Displays the beginning number of the sequence
		System.out.printf("%8d",startingValue);

		// While loop that calculates the correct equation for odd and even number
		while (startingValue >1)
		{
			temp = startingValue;	// Stores the inital value for comparsion for max

			if (startingValue % 2 == 0)	// Check for value if even
			{
			  startingValue = startingValue/2;
			}

			else	// Value is odd or not even
			{
			  startingValue = (startingValue*3)+1;
			}

			count ++;	// increase count by one
			total ++;	// increase total by one

			if(count == 8)	// Displays new line after 8 loops and resets to 0
			{
				System.out.print("\n");
				count = 0;
			}

			if(temp > max)	// Checks if previous number is greater than current max
			{
				max = temp;
			}

			System.out.printf("%8d", startingValue);	// Displays number within sequence
		}

		System.out.print("\n");	// Displays new line

		System.out.println("\nThe hailstone sequence contains " + total +
				" hailstones, and the largest\nvalue in the" +
				" sequence is " + max + ".");				// Displays summary

	}    //main

}    // class Proj2a


