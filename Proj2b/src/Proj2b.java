/*====================================================================================
 |	Assignment:	Program #2(b): One-Month Calendar
 |	    Author:	Gabriel Perez
 |    Sect. Leader:	Patrick Hickey
 |
 |	    Course:	CSc 227
 |	Instructor:	L. McCann
 |	  Due Date:	February 4, 2014, by 9:00 p.m. MST
 |
 |     Description:	Given a month (1-12) and a year entered by the users, this
 |			program will generate a calendar for the given month. This
 |			program will use an equation known as Babwani's Congruence
 |			to calculate the starting day of the first of every month
 |			to generate a correct calendar. This program will also determine
 |			if the year happens to be a leap year.
 |
 |    Deficiencies:	None known; this program meets specifications.
*==========================================================================================*/

import java.util.*;	// Java API's "util" packaged has the Scanner class

public class Proj2b
{
	public static void main (String [] args)
	{
		Scanner keyboard;		// To reference Scanner object for keyboard input
		int month,			// Stores the month, i.e. (1-12)
			year,			// Stores year input from user
			twoFirstDigitYear,	// Stores the first two digits from year
			twoLastDigitYear,	// Stores the last two digits from year
			leapYear=0,		// Flag for leap year, if flag is 0 then there is no leap year,
						// if flag is 1 that year is leap year
			monthCode = 0,		// Stores month code for Babwani's Congruence
			day = 1,		// Stores first day of the month to use in Babwani's Congruence
			count = 0,		// Counts the number of times while loop is executed
		        days =1,		// Displays day number in calendar
		        daysInMonth = 0;	// Stores the number of day within a certain month
		double dayOfWeek;		// Stores the day in which the first of the month starts on
		double floor;			// Calculates ((5*year)/4) in Babwani's Congruence, this is completed by using Math.floor()

		keyboard = new Scanner (System.in);

		System.out.print("Enter the corresponding number for the month you will "
				+ "would like to display a calendar for (1-Jan, 2-Feb, etc..):");
		month = keyboard.nextInt();	// stores month from the keyboard/user

		System.out.print("Enter the year you will like to view:");
		year = keyboard.nextInt();	// Stores year from the keyboard/user

		// Do-While loop to check if user input is not vaild
		do{
			if (month <=0 || month > 12)	// If month is not between 1-12 ask for vaild month
			{
			   System.out.print("\nI'm sorry but the value you have entered is "+
					   "invaild!\nPlease choose a positive integer from 1"
					   + " to 12\nfor the corresponding month: ");

			   month = keyboard.nextInt();
			}

		}while(month < 0 || month > 12 || year <=0);

		System.out.print("\n");		// Display new line
		twoFirstDigitYear = year/100;	// Take the first two digits of the year and store
		twoLastDigitYear  = year%100;	// Take the last two digits of the year and store

		if ((year%4 ==0 && year%100 !=0)||(year%400 ==0))	// Check if given year is leap year
			leapYear = 1; 					// If leap year set flag to 1

		if(month == 1)
			if(leapYear == 1)  // year is leap year and month is January
			{
				monthCode = 6;
				System.out.println("January " + year + ":\n");
				daysInMonth = 31;
			}
			else  // year is not leap year and month is January
			{
				monthCode = 0;
				System.out.println("January " + year + ":\n");
				daysInMonth = 31;
			}
		else if (month ==2)
			if(leapYear == 1)  // Year is leap year and month is February
			{
				monthCode = 2;
				System.out.println("February " + year + ":\n");
				daysInMonth = 29;
			}
			else  // Year is not leap year and month is February
			{
				monthCode = 3;
				System.out.println("February " + year + ":\n");
				daysInMonth = 28;
			}
		else if (month == 3)  // Month is March
			{
				daysInMonth = 31;
				monthCode = 3;
				System.out.println("March " + year + ":\n");
			}
		else if (month == 4)  // Month is April
			{
				daysInMonth = 30;
				monthCode = 6;
				System.out.println("April " + year + ":\n");
			}
		else if (month == 5)  // Month is May
			{
				daysInMonth = 31;
				monthCode = 1;
				System.out.println("May " + year + ":\n");
			}
		else if (month == 6)  // Month is June
			{
				daysInMonth = 30;
				monthCode = 4;
				System.out.println("June " + year + ":\n");
			}
		else if (month == 7) // Month is July
			{
				daysInMonth = 31;
				monthCode = 6;
				System.out.println("July " + year + ":\n");
			}
		else if (month == 8) // Month is August
			{
				daysInMonth = 31;
				monthCode = 2;
				System.out.println("August " + year + ":\n");
			}
		else if (month == 9)  // Month is September
			{
				daysInMonth = 30;
				monthCode = 5;
				System.out.println("September " + year + ":\n");
			}
		else if (month == 10)  // Month is October
			{
				daysInMonth = 31;
				monthCode = 0;
				System.out.println("October " + year + ":\n");
			}
		else if (month == 11)  // Month is November
			{
				daysInMonth = 30;
				monthCode = 3;
				System.out.println("November " + year + ":\n");
			}
		else if (month == 12)  // Month is December
			{
				daysInMonth = 31;
				monthCode = 5;
				System.out.println("December " + year + ":\n");
			}

		floor = ((5*twoLastDigitYear)/4);	// Babwani's Congruence ((5*year)/4)
		dayOfWeek = (((Math.floor(floor)+monthCode+day)-2*(twoFirstDigitYear%4)+7)%7);	// Babwani's Congruence answer is between 0-6 (Saturday-Friday)

		System.out.println("Su\tMo\tTu\tWe\tTh\tFr\tSa");	// Displays headers for the days of the week

		// for loop to display the number in the correct spot for the month
		for (int i =1; i<daysInMonth+dayOfWeek; i++)
		{
			if (dayOfWeek ==0)	// Special case if the first of the month is on a saturday
				dayOfWeek =7;

			if (count<dayOfWeek-1)	// Displays tabs to help line up for the first of the month
			{
				System.out.print("\t");
				count++;
			}
			else	// Displays the days within the calendar including formatting to make sure everything looks neat
			{
				System.out.print(days + "\t");
				days++;

				if(i%7==0)	// Every seventh day this will print a new line for display
					System.out.print("\n");
			}

		}

		System.out.print("\n");	// Displays new line for formatting

	}  // main

}   // class Proj2b
