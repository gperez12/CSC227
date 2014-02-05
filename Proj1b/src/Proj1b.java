/*========================================================================================
 |    Assignment:	Program #1(b): Compound Interest
 |        Author:	Gabriel Perez
 |  Sect. Leader:       Patrick Hickey
 |
 |        Course:	CSc 227
 |    Instructor:  	L. McCann
 |      Due Date:	January 28, 2014, by 9:00 p.m. MST
 |
 |   Description: 	Given a person's age on their next birthday, the amount
 |			of dollars invested, and the investment's APY as a percentage,
 |			this program will calculate the APR, the worth when the user
 |			turns 70 years old, the worth if the user waits five years
 |			extra and the difference between the two values. This program
 |			uses the following equations: APR = c((1 + APY)^(1/c) -1) and
 |			V = p(1 + (APR/c))^cy. For this program c is equal to 365 days
 |			(number of days in a year) and y is equal to the age of the
 |			user minus 70.0 years.
 |
 |  Deficiencies:       If a user places an age over the age of 70 the calculations
 |			will be incorrect.
 *========================================================================================*/

import java.util.*;		// Java API's "util" package has the Scanner class

public class Proj1b 
{

	public static void main(String [] args)
	{
		final double DAYS_IN_YEAR = 365;  // Amount of days in a year
		
		double age,		  // Age of user on next birthday
		       ageDelta,          // Holds 70.0 - age and 70 - (age + 5)
		       principal,      	  // Dollar amount to be invested
		       apy,		  // Saving account's annual percentage yield in percent
		       value,	    	  // The investment worth if user invested at the age provided in dollars
		       apr,		  // Annualized percentage rate in decimal form
		       aprPercentage,	  // Annualized percentage rate in percent
		       value2,		  // The investment worth if user waits 5.0 years in dollars 
		       delta;		  // The difference between value and value 2 in dollars 
		
		Scanner keyboard;
		
		keyboard = new Scanner (System.in);
		
		System.out.print("\nImagine that you make an investment on "
				+ "your next birthday.\nThis program will "
				+ "compute the value of that investment \nwhen "
				+ "you turn 70.0, and will tell you the amount\n"
				+ "you will lose by waiting just 5.0 years to "
				+ "make the investment.\n");
		
		System.out.print("\nHow many years old will you be on your next "
				+ "birthday?:"); 
		age = keyboard.nextInt();
		
		System.out.print("Enter the amount, in dollars, to be invested:");
		principal = keyboard.nextDouble();
		
		System.out.print("Enter the investment's APY as a percent (ex: 3.5):");
		apy = keyboard.nextDouble();
		
		apr = (DAYS_IN_YEAR * (Math.pow((1+(apy/100)),(1/DAYS_IN_YEAR))-1));	// Calculates APR in decimal form
										        // to be used in other calculations
		aprPercentage = (apr*100);	//Converts APR from decimal form to percentage
		
		ageDelta = 70-age;		// Subtracts 70 years minus the age of the user
					 	// on their next birthday
		
		value = principal * Math.pow((1+(apr/DAYS_IN_YEAR)),(DAYS_IN_YEAR * ageDelta));  // Calculates value by using
											         // V = p(1 + (APR/c))^cy
		
		System.out.print("\n\nBe aware: Your investment's APR is just " 
				+ aprPercentage + "%.\n");

		System.out.print("\nAt age " + age + ", an investment of $"
				+ principal + ",\ncompounded 365.0 times per"
				+ " year using an APY of " + apy + 
				", \nwill be worth $" + value + " when you turn "
				+ "70.0 years old.\n" );
		
		ageDelta = ageDelta - 5;	// Calculates the years if a user decides
						// to wait 5.0 years
		
		value2 = principal * Math.pow((1+(apr/DAYS_IN_YEAR)),(DAYS_IN_YEAR * ageDelta));   // Calculates value if a user
									                           // waits 5.0 extra years
		delta = value - value2;	// Calculates the difference in dollars
					// between the value if the user was to
					// invest at the age provided and the value 
					// if the user was to wait 5.0 years
		
		System.out.print("\nIf you wait just 5.0 years before investing the"
				+ " same amount, \nit will be worth only $"
				+ value2 + " at the age 70.0,\na difference"
			        + " of $" + delta + ".\n");
		
	} //main

} // class CompoundInterest
