/*====================================================================================
 |	Assignment:	Program #4: Prog4.java
 |	    Author:	Gabriel Perez
 |    Sect. Leader:	Patrick Hickey
 |
 |	    Course:	CSc 227
 |	Instructor:	L. McCann
 |	  Due Date:	February 25, 2014, by 9:00 p.m. MST
 |
 |     Description:	This program will create a CalendarDate object. Following
 |			this creation it will go through a series of method calls. Once 
 |			all the calls have been made on this one object we will call
 |			setDate to change the values within the object. This will happen
 |			for a total of five time with different values that will try to 
 |			break the CalendarDate class. 
 |					
 |    Deficiencies:	None known; this program meets specifications.
*==========================================================================================*/
public class Prog4 {

	public static void main (String [] args)
	{
		CalendarDate tomorrow, yesterday;
		boolean result;
		CalendarDate compare = new CalendarDate(1992,8,8);
		
		/* instantiating new CalendarDate object with 
		 * int year = 1992, int month = 8, and int day = 8.
                 */
		
		System.out.println("Creating new CalendarData object with 1992, 8, 8");
		CalendarDate testing = new CalendarDate (1992,8, 8);
		
		System.out.println();
		
		//testing getYear()
		System.out.println("Calling getYear()...should return 1992" + 
						   "\nOutput: " + testing.getYear());
		
		//testing getMonth()
		System.out.println("Calling getMonth()....should return 8" +
						   "\nOutput: " + testing.getMonth());
		
		//testing getDay()
		System.out.println("Calling getDay()...should return 8" +
						   "\nOutput: " + testing.getDay());
		
		//testing getMonthAsString()
		System.out.println("Calling getMonthAsString()....should return August" +
						   "\nOutput: " + testing.getMonthAsString());
		
		//testing toString()
		System.out.println("Calling toString()...should return August 8, 1992" +
						   "\nOutput: " + testing.toString());
		
		//testing dayOfTheWeek()
		System.out.println("Testing dayOfTheWeek().....should return Saturday" +
						   "\nOutput: " + testing.dayOfTheWeek()); 
		
		//calling tomorrow()
		System.out.println("Testing tomorrow()....should return CalendarDate object will test next line"); 
		tomorrow = testing.tomorrow();
		
		//testing tomorrow()
		System.out.println("Testing tomorrow() output with toString()...should return August 9, 1992"
							+"\nOutput: " + tomorrow.toString());
		
		//Calling yesterday()
		System.out.println("Testing yesterday()...should return CalendarDate object, will test next line");
		yesterday = testing.yesterday(); 
		
		//testing yesterday()
		System.out.println("Testing yesterday() output with toString()...should return August 7, 1992"
				+ "\nOutput: " + yesterday.toString());	
		
		//testing equals(CalendarDate otherDate)
		result = testing.equals(compare);
		System.out.println("Testing equals()....should return true"
						+ "\nOutput: " + result);
		
		System.out.println(); 
		
		//testing setDate()
		System.out.println("Setting values to 0,0,0");
		testing.setDate(0, 0, 0);

		//testing getYear()
		System.out.println("Calling getYear()...should return 0" + 
						   "\nOutput: " + testing.getYear());
		
		//testing getMonth()
		System.out.println("Calling getMonth()....should return 1" +
						   "\nOutput: " + testing.getMonth());
		
		//testing getDay()
		System.out.println("Calling getDay()...should return 1" +
						   "\nOutput: " + testing.getDay());
		
		//testing getMonthAsString()
		System.out.println("Calling getMonthAsString()....should return January" +
						   "\nOutput: " + testing.getMonthAsString()); 
		
		//testing toString()
		System.out.println("Calling toString()...should return January 1, 0" +
						   "\nOutput: " + testing.toString());
		
		//testing dayOfTheWeek()
		System.out.println("Testing dayOfTheWeek().....should return Saturday" +
						   "\nOutput: " + testing.dayOfTheWeek()); 
		
		//calling tomorrow()
		System.out.println("Testing tomorrow()....should return CalendarDate object will test next line"); 
		tomorrow = testing.tomorrow();
		
		//testing tomorrow()
		System.out.println("Testing tomorrow() output with toString()...should return January 2, 0"
							+"\nOutput: " + tomorrow.toString());
		
		//calling yesterday()
		System.out.println("Testing yesterday()...should return CalendarDate object, will test next line");
		yesterday = testing.yesterday(); 
		
		//testing yesterday()
		System.out.println("Testing yesterday() output with toString()...should return December 31, 1"
				+ "\nOutput: " + yesterday.toString());	
		
		//testing equals(CalendarDate otherDate)
		result = testing.equals(compare);
		System.out.println("Testing equals()....should return false"
						+ "\nOutput: " + result);
		
		System.out.println(); 
		
		//testing setDate()
		System.out.println("Setting values to 1993,2,29");
		testing.setDate(1993, 2, 29);

		//testing getYear()
		System.out.println("Calling getYear()...should return 1993" + 
						   "\nOutput: " + testing.getYear());
		
		//testing getMonth()
		System.out.println("Calling getMonth()....should return 2" +
						   "\nOutput: " + testing.getMonth());
		
		//testing getDay()
		System.out.println("Calling getDay()...should return 28" +
						   "\nOutput: " + testing.getDay());
		
		//testing getMonthAsString()
		System.out.println("Calling getMonthAsString()....should return February" +
						   "\nOutput: " + testing.getMonthAsString()); 
		
		//testing toString()
		System.out.println("Calling toString()...should return February 28, 1993" +
						   "\nOutput: " + testing.toString());
		
		//testing dayOfTheWeek()
		System.out.println("Testing dayOfTheWeek().....should return Sunday" +
						   "\nOutput: " + testing.dayOfTheWeek()); 
		
		//calling tomorrow()
		System.out.println("Testing tomorrow()....should return CalendarDate object will test next line"); 
		tomorrow = testing.tomorrow();
		
		//testing tomorrow()
		System.out.println("Testing tomorrow() output with toString()...should return March 1, 1993"
							+"\nOutput: " + tomorrow.toString());
		
		//calling yesterday()
		System.out.println("Testing yesterday()...should return CalendarDate object, will test next line");
		yesterday = testing.yesterday(); 
		
		//testing yesterday()
		System.out.println("Testing yesterday() output with toString()...should return February 27, 1993"
				+ "\nOutput: " + yesterday.toString());	
		
		//testing equals(CalendarDate otherDate)
		result = testing.equals(compare);
		System.out.println("Testing equals()....should return false"
						+ "\nOutput: " + result);
		
		System.out.println();
		
		//testing setDate()
		System.out.println("Setting values to 2013,12,31");
		testing.setDate(2013, 12, 31);

		//testing getYear()
		System.out.println("Calling getYear()...should return 2013" + 
						   "\nOutput: " + testing.getYear());
		
		//testing getMonth()
		System.out.println("Calling getMonth()....should return 12" +
						   "\nOutput: " + testing.getMonth());
		
		//testing getDay()
		System.out.println("Calling getDay()...should return 31" +
						   "\nOutput: " + testing.getDay());
		
		//testing getMonthAsString()
		System.out.println("Calling getMonthAsString()....should return December" +
						   "\nOutput: " + testing.getMonthAsString()); 
		
		//testing toString()
		System.out.println("Calling toString()...should return December 31, 2013" +
						   "\nOutput: " + testing.toString());
		
		//testing dayOfTheWeek()
		System.out.println("Testing dayOfTheWeek().....should return Tuesday" +
						   "\nOutput: " + testing.dayOfTheWeek()); 
		
		//calling tomorrow()
		System.out.println("Testing tomorrow()....should return CalendarDate object will test next line"); 
		tomorrow = testing.tomorrow();
		
		//testing tomorrow()
		System.out.println("Testing tomorrow() output with toString()...should return January 1, 2014"
							+"\nOutput: " + tomorrow.toString());
		
		//calling yesterday()
		System.out.println("Testing yesterday()...should return CalendarDate object, will test next line");
		yesterday = testing.yesterday(); 
		
		//testing yesterday()
		System.out.println("Testing yesterday() output with toString()...should return December 30, 2013"
				+ "\nOutput: " + yesterday.toString());	
		
		//testing equals(CalendarDate otherDate)
		result = testing.equals(compare);
		System.out.println("Testing equals()....should return false"
						+ "\nOutput: " + result);
		
		System.out.println(); 
		
		//testing setDate()
		System.out.println("Setting values to -2015,35,90");
		testing.setDate(-2015, 35, 90);

		//testing getYear()
		System.out.println("Calling getYear()...should return 2015" + 
						   "\nOutput: " + testing.getYear());
		
		//testing getMonth()
		System.out.println("Calling getMonth()....should return 12" +
						   "\nOutput: " + testing.getMonth());
		
		//testing getDay()
		System.out.println("Calling getDay()...should return 31" +
						   "\nOutput: " + testing.getDay());
		
		//testing getMonthAsString()
		System.out.println("Calling getMonthAsString()....should return December" +
						   "\nOutput: " + testing.getMonthAsString()); 
		
		//testing toString()
		System.out.println("Calling toString()...should return December 31, 2015" +
						   "\nOutput: " + testing.toString());
		
		//testing dayOfTheWeek()
		System.out.println("Testing dayOfTheWeek().....should return Thursday" +
						   "\nOutput: " + testing.dayOfTheWeek()); 
		
		//calling tomorrow()
		System.out.println("Testing tomorrow()....should return CalendarDate object will test next line"); 
		tomorrow = testing.tomorrow();
		
		//testing tomorrow()
		System.out.println("Testing tomorrow() output with toString()...should return January 1, 2016"
							+"\nOutput: " + tomorrow.toString());
		
		//calling yesterday()
		System.out.println("Testing yesterday()...should return CalendarDate object, will test next line");
		yesterday = testing.yesterday(); 
		
		//testing yesterday()
		System.out.println("Testing yesterday() output with toString()...should return December 30, 2015"
				+ "\nOutput: " + yesterday.toString());	
		
		//testing equals(CalendarDate otherDate)
		result = testing.equals(compare);
		System.out.println("Testing equals()....should return false"
						+ "\nOutput: " + result);
		
		
	
	} //main
} //Class Proj4
