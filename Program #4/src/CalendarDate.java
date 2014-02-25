/*+----------------------------------------------------------------------
 ||
 ||  Class CalendarDate.java
 ||
 ||         Author:  Gabriel Perez
 ||
 ||        Purpose:  This class was created for a user to create an 
 ||                  CalendarDate object with a month, day, and year input.
 ||                  Following the creation of the object a user can ask for
 ||                  the day of the week, the date of yesterday, the date
 ||					 of tomorrow, get month and month spelling.
 ||
 ||  Inherits From:  None.
 ||
 ||     Interfaces:  None.
 ||
 |+-----------------------------------------------------------------------
 ||
 ||      Constants:  None.
 ||
 |+-----------------------------------------------------------------------
 ||
 ||   Constructors:  Public CalendarDate, which take three ints (year, 
 ||					 month, and day) for arguments. This constructor will 
 ||					 create a correct date. This constructor will error check
 ||                  (i.e., Feb 29th 1993 is not valid therefore the constructor
 ||					 would return a object containing Feb 28th 1993. This
 ||					 constructor will also corrected out of bounds dates 
 || 				 and months. 
 ||
 ||  Class Methods:  None.
 ||					 
 ||  Inst. Methods:  void          setDate (int year, int month, int day)
 ||					 int           getYear ()
 ||					 int           getMonth ()
 ||					 String        getMonthAsString ()
 ||					 int           getDay () 
 ||				     String        toString ()
 ||					 boolean       equals (CalendarDate otherDate)
 ||					 CalendarDate  tomorrow ()
 ||					 CalendarDate  yesterday ()
 ||					 int           leapYear ()
 ||					 String        dayOfTheWeek ()
 ||
 ++-----------------------------------------------------------------------*/
public class CalendarDate {
	
	private int year, 	//year instance variable
				month, 	//month instance variable
				day;	//day instance variable
	private String monthSpelling;	//monthSpelling instance variable
	private String date; 			//date instance variable
	/*---------------------------------------------------------------------
    |  Method CalendarDate (int,int,int)
    |
    |  Purpose:  This is the constructor for the CalendarDate class. 
    | 			 This constructor will check to make sure the date that is 
    |			 inputted is a valid value, i.e., Feb 29th, 1993 is not valid
    |			 therefore the constructor will adjust this to Feb 28th, 1993. 
    |			 This constructor will also catch months that are past 12 and 
    | 			 before 1 and adjusted them to closest valid month. This is also
    |			 true for days. 
    |
    |  Pre-condition:  None.
    |
    |  Post-condition: A refernce to a calendarDate object will be created with valid 
    |				   values for the input given.
    |
    |  Parameters: int year -- The value of the year (yyyy) the user would like to use 
    | 				   when creating a CalendarDate object.
    |			   int month -- The value of month (1-12) the user would like to use
    |			   	   when creating a CalendarDate object. 
    |			   int day -- The value of day (1-31) the user would like to use when 
    |			   	   creating a CalendarDate object.
    |
    |  Returns:  A reference to the new CalendarDate object. 
    *-------------------------------------------------------------------*/
	public CalendarDate (int year, int month, int day)
	{
		
		if (month < 0 || month == 0) 	//if month is equal to or less than zero
			month = 1;               	//set month to 1
		
		if (month > 12)					//if month is greater than 12 set month to 12
			month = 12;
		
		if (day < 0 || day == 0)		//if day is equal to or less than 0 then set 
			day = 1; 					//day = 1
		
		if (month == 2 && day == 29)	//if month is feburary and day is 29 check if 
		{								//year is leap year
			if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
			{
				day = 29; 
			}
			else 						//if year is not leap year than day is set to 28
			{
				day = 28;
			}
		}
		
		if (day > 31)					//if day is greater than 31 than set day to 31
			day = 31; 
		
		if (year<0)						//if year is negative set year to absolute value 
			year = Math.abs(year);		//of year inputed
		
		if (month == 4 || month == 6 || month == 9 || month == 11) 	//These months only have 30 days
		{															//in the month. Therefore we correct
			if(day == 31)											//the issue if day is equal to 31
			{
				day = 30; 
			}
		}
		
		this.year = year;				//set instance variables (year)
		this.month = month; 			//(month)
		this.day = day; 				//(day)
		
		
	}
	/*---------------------------------------------------------------------
    |  Method 			setDate(int year, int month, int day), getYear(),
    |		  	 		getMonth(), getMonthAsString(), getDay()		
    |
    |  Purpose:  		These methods allow the user to change the instance variables
    |			 		within the object (i.e., year, month, day, monthSpelling, and 
    |			 		date). 
    |
    |  Pre-condition:  	A reference to a CalendarDate object must be established.
    |
    |  Post-condition: The getters will not change any of the instance variables. 
    |				   However, for the setters the user will be able to change 
    |				   the values of the instance variables. 
    |
    |  Parameters:
    |     int year -- The value of the year (yyyy) the user would like to use 
    | 				   when creating a CalendarDate object.
    |			   int month -- The value of month (1-12) the user would like to use
    |			   	   when creating a CalendarDate object. 
    |			   int day -- The value of day (1-31) the user would like to use when 
    |			   	   creating a CalendarDate object.
    |
    |  Returns:  The correct day, month, and year will be returned by the getters.
    |			 The setter will not return anything.
    *-------------------------------------------------------------------*/
	
	
	public void setDate (int year, int month, int day){
		if (month < 0 || month == 0) 	//if month is equal to or less than zero
			month = 1;               	//set month to 1
		
		if (month > 12)					//if month is greater than 12 set month to 12
			month = 12;
		
		if (day < 0 || day == 0)		//if day is equal to or less than 0 then set 
			day = 1; 					//day = 1
		
		if (month == 2 && day == 29)	//if month is feburary and day is 29 check if 
		{								//year is leap year
			if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
			{
				day = 29; 
			}
			else 						//if year is not leap year than day is set to 28
			{
				day = 28;
			}
		}
		
		if (day > 31)					//if day is greater than 31 than set day to 31
			day = 31; 
		
		if (year<0)						//if year is negative set year to absolute value 
			year = Math.abs(year);		//of year inputed
		
		if (month == 4 || month == 6 || month == 9 || month == 11) 	//These months only have 30 days
		{															//in the month. Therefore we correct
			if(day == 31)											//the issue if day is equal to 31
			{
				day = 30; 
			}
		}
		
		this.year = year;				//set instance variables (year)
		this.month = month; 			//(month)
		this.day = day; 				//(day)
		
	}
	
	public int getYear()
	{
		return year;	//returns year
	}
	
	public int getMonth()
	{
		return month;	//returns month
	}

	public String getMonthAsString()
	{
		//check the value in month and produces a string with the
		//month spelled out
		switch(month){
		case 1:  monthSpelling = "January";
				 break; 
		case 2:  monthSpelling = "February";
				 break;
		case 3:  monthSpelling = "March";
				 break; 
		case 4:  monthSpelling = "April";
				 break; 
		case 5:  monthSpelling = "May";
				 break; 
		case 6:  monthSpelling = "June";
				 break; 
		case 7:  monthSpelling = "July";
		         break; 
		case 8:  monthSpelling = "August";
				 break; 
		case 9:  monthSpelling = "September";
				 break; 
		case 10: monthSpelling = "October";
				 break; 
		case 11: monthSpelling = "November";
				 break; 
		case 12: monthSpelling = "December";
		         break; 
		
		}
		
		return monthSpelling; 
	}

	public int getDay()
	{
		return day;		//returns day
	}
	/*---------------------------------------------------------------------
    |  Method toString()
    |
    |  Purpose:  This method will create a string with the month spelling,
    |			 the day and the year (i.e., August 10, 2014).
    |
    |  Pre-condition: A reference to a CalendarDate object must be set.
    |
    |  Post-condition: This will return a string with month spelling, day, 
    |				   and year.
    |
    |  Parameters: None.
    |
    |  Returns:  This method will return a string containing a date
    |			 (i.e., August 10, 2014).
    *-------------------------------------------------------------------*/
	
	
	public String toString()
	{ 
		this.monthSpelling = getMonthAsString(); 		//get the month spelling
		
		date = monthSpelling + " " + day + ", " + year;	//Create string with date
		return date; 									//Return string
	}
	/*---------------------------------------------------------------------
    |  Method equals (CalendarDate otherDate)
    |
    |  Purpose:  This method will compare two reference of CalendarDates 
    |            objects to see if they contain the same date. This method
    |			 will return a boolean.
    |
    |  Pre-condition: Must have two references to different CalendarDate objects.
    |
    |  Post-condition: The method will return a boolean result whether the 
    |				   two dates are the same (true) or different (false).
    |
    |  Parameters:
    |      CalendarDate otherDate -- This is the reference to the object that 
    |					you would like to compare to the original. 
    |
    |  Returns:  This method will return a boolean result whether the two
    |			 dates are the same (true) or different (false).
    *-------------------------------------------------------------------*/
	

	public boolean equals (CalendarDate otherDate)
	{
		boolean result = false;	//boolean which will be returned
		
		int monthCopy, 	//copy of the month instance variable
			dayCopy, 	//copy of the day instance variable
			yearCopy; 	//copy of the year instance variable	
		
		//retrieve month, day, and year
		monthCopy = otherDate.getMonth();
		dayCopy = otherDate.getDay(); 
		yearCopy = otherDate.getYear();
		
		//comparing month
		if (monthCopy == this.month)
		{
			//comparing day
			if(dayCopy == this.day)
			{
				//comparing year
				if (yearCopy == this.year)
				{
					result = true;	//if year, day, and month are equal
									//boolean is true
				}
			}
		}
		
		return result;				//return boolean
		
	}
	/*---------------------------------------------------------------------
    |  Method tomorrow()
    |
    |  Purpose:  This method will calculate the date of tomorrow based on 
    |			 the original date that was placed in the reference to 
    |			 the CalendarDate object. 
    |
    |  Pre-condition: A reference to a CalendarDate object must be created.
    |
    |  Post-condition: This method will return a reference to a CalendarDate
    |			       object with the date of tomorrow stored within.
    |
    |  Parameters:	None.
    |
    |  Returns:  This method will return a reference to a CalendarDate
    |			       object with the date of tomorrow stored within.
    *-------------------------------------------------------------------*/
	
	public CalendarDate tomorrow()
	{ 
		int monthCopy, 	//copy of month instance variable
			dayCopy, 	//copy of day instance variable
			yearCopy;	//copy of year instance variable
		
		//retrieving data from instance variables
		monthCopy = this.month; 
		dayCopy = this.day; 
		yearCopy = this.year;
		
		//if day is end of year, tomorrow will be 1st of new year and new month
		if (monthCopy == 12 && dayCopy == 31)
		{
			monthCopy = 1; 
			dayCopy = 1; 
			yearCopy++;
		}
		//if month has 31 days than tomorrow will be the 1st of the month 
		else if(monthCopy == 1 || monthCopy == 3 || monthCopy == 5 || monthCopy == 7 || monthCopy == 8 || monthCopy == 10 )
		{
			if(dayCopy == 31)
			{
				monthCopy++;
				dayCopy = 1; 
			}
			else 
			{
				dayCopy++;
			}
		}
		//if month has 30 days than tomorrow will be the 1st of the month 
		else if(monthCopy == 4 || monthCopy == 6 || monthCopy == 9 || monthCopy == 11) 
		{
			if(dayCopy == 30)
			{
				monthCopy++;
				dayCopy = 1; 
			}
			else 
			{
				dayCopy++;
			}
		}
		//if february
		else if(monthCopy == 2)
		{
			//and leapyear
			if(yearCopy % 4 == 0 && yearCopy % 100 != 0 || yearCopy % 4 == 0)
			{
				//then if day is 29 tomorrow is new month
				if(dayCopy == 29)
				{
					monthCopy++; 
					dayCopy = 1; 
				}
				else 
				{
					dayCopy++; 
				}
			}
			//if not leapyear
			else 
			{
				//day is 28 tomorrow is new month
				if(dayCopy == 28)
				{
					monthCopy++; 
					dayCopy = 1;
				}
				else 
				{
					dayCopy++;
				}
			}
		}
		//create new reference to a CalendarDate object with correct year, month, and day
		CalendarDate tomorrow = new CalendarDate (yearCopy, monthCopy, dayCopy);
		
		return tomorrow; //return reference
	}
	/*---------------------------------------------------------------------
    |  Method yesterday()
    |
    |  Purpose:  This method will calculate the date of yesterday based on 
    |			 the original date that was placed in the reference to 
    |			 the CalendarDate object. 
    |
    |  Pre-condition: A reference to a CalendarDate object must be created.
    |
    |  Post-condition: This method will return a reference to a CalendarDate
    |			       object with the date of yesterday stored within.
    |
    |  Parameters:	None.
    |
    |  Returns:  This method will return a reference to a CalendarDate
    |			       object with the date of yesterday stored within.
    *-------------------------------------------------------------------*/

	public CalendarDate yesterday()
	{
		int monthCopy,		//copy of instance variable month
			dayCopy, 		//copy of instance variable day
			yearCopy;		//copy of instance variable year
		
		//retrieve data from instance variable
		monthCopy = this.month; 
		dayCopy = this.day; 
		yearCopy = this.year;
		
		//if first of month and first day, yesterday is past year and 31st
		if (monthCopy == 1 && dayCopy == 1)
		{
			monthCopy = 12; 
			dayCopy = 31; 
			yearCopy--;
		}
		//previous month has 31 days therefore day count goes to 31
		else if(monthCopy == 2 || monthCopy == 4 || monthCopy == 6 || monthCopy == 8 || monthCopy == 9 || monthCopy == 11 )
		{
			if(dayCopy == 1)
			{
				monthCopy--;
				dayCopy = 31; 
			}
			else 
			{
				dayCopy--;
			}
		}
		//previous month has 30 days therefor day count goes to 30 
		else if(monthCopy == 5 || monthCopy == 7 || monthCopy == 10 || monthCopy == 12) 
		{
			if(dayCopy == 1)
			{
				monthCopy--;
				dayCopy = 30; 
			}
			else 
			{
				dayCopy--;
			}
		}
		//if March
		else if(monthCopy == 3)
		{
			//if leapyear
			if(yearCopy % 4 == 0 && yearCopy % 100 != 0 || yearCopy % 4 == 0)
			{	
				//previous day would be 29 
				if(dayCopy == 1)
				{
					monthCopy--; 
					dayCopy = 29; 
				}
				else 
				{
					dayCopy--; 
				}
			}
			//if not leapyear
			else 
			{
				//previous day is 28
				if(dayCopy == 1)
				{
					monthCopy--; 
					dayCopy = 28;
				}
				else 
				{
					dayCopy--;
				}
			}
		}
		
		//creating a reference to a CalendarDate object with correct year, month, and day
		CalendarDate yesterday = new CalendarDate (yearCopy, monthCopy, dayCopy);
		
		return yesterday; 	//return reference
		
	}
	/*---------------------------------------------------------------------
    |  Method leapYear()
    |
    |  Purpose:  This method will check to see if the inputted year
    |            is a leap year. It will also provide the proper monthcode
    |			 to use in the BabwaniÕs Congruence equation. 
    |			 
    |
    |  Pre-condition:  A reference to a CalendarDate object must be created.
    |
    |  Post-condition: This method will return the day of the week(0-6,
    |				   Saturday-Friday).
    |
    |  Parameters:	None.
    |
    |  Returns:  This method will return the day of the week(0-6,
    |		     Saturday-Friday).
    *-------------------------------------------------------------------*/
		
	private int leapYear()
	{
		
		int leapYear =0, 			//leapYear flag, if set to 1 year is leapyear
			monthCode = 0, 			//monthCode used for BabwaniÕs Congruence
			floor, 					//Variable to hold floor calculation for BabwaniÕs Congruence
			twoLastDigitYear, 		//The two last digits of the year
			twoFirstDigitYear;		//The first two digits of the year
		
		double dayOfWeek; 			//Value of 0-6 (Saturday-Friday)
		
		if ((year%4 ==0 && year%100 !=0)||(year%400 ==0))	// Check if given year is leap year
			leapYear = 1; 					// If leap year set flag to 1

	if(month == 1)
		if(leapYear == 1)  // year is leap year and month is January
		{
			monthCode = 6;
		}
		else  // year is not leap year and month is January
		{
			monthCode = 0;
		}
	else if (month ==2)
		if(leapYear == 1)  // Year is leap year and month is February
		{
			monthCode = 2;
		}
		else  // Year is not leap year and month is February
		{
			monthCode = 3;
		}
	//Set monthCode by month
	switch(month)
	{
	case 3:  monthCode = 3; 
			 break; 
	case 4:  monthCode = 6;
			 break; 
	case 5:  monthCode = 1;
			 break; 
	case 6:  monthCode = 4;
			 break; 
	case 7:  monthCode = 6; 
			 break; 
	case 8:  monthCode = 2; 
			 break; 
	case 9:  monthCode = 5; 
			 break; 
	case 10: monthCode = 0; 
			 break; 
	case 11: monthCode = 3; 
			 break; 
	case 12: monthCode = 5; 
			 break; 
	}
	
	twoFirstDigitYear = year/100; 		//calculates the two first digits of year
	twoLastDigitYear = year%100;		//calculates the last two digits of year
	floor = ((5*twoLastDigitYear)/4);	//calculates the floor for the BabwaniÕs Congruence
	
	dayOfWeek = (((Math.floor(floor)+monthCode+day)-2*(twoFirstDigitYear%4)+7)%7); //BabwaniÕs Congruence
	return (int) dayOfWeek; 	//return day of week

	}
	/*---------------------------------------------------------------------
    |  Method dayOfTheWeek()
    |
    |  Purpose:  This method is used to find out what day of the week is 
    |            the user providing in the reference to the object.
    |
    |  Pre-condition:  A reference to a CalendarDate object must be created.
    |
    |  Post-condition: This method will return a string containing the day of 
    |					of the week the input fell on. 
    |
    |  Parameters: None.
    |
    |  Returns:  This method will return a string containing the day of 
    |					of the week the input fell on. 
    *-------------------------------------------------------------------*/	
	public String dayOfTheWeek()
	{
		String day = null;				//String for the day of the week
		int dayOfWeek = leapYear(); 	//value of day of the week 
		
		//match value from BabwaniÕs Congruence (dayOfWeek) with proper string
		switch(dayOfWeek)
		{
		case 0: day = "Saturday";
				break; 
		case 1: day = "Sunday";
				break; 
		case 2: day = "Monday";
				break; 
		case 3: day = "Tuesday";
				break;
		case 4: day = "Wednesday";
				break;
		case 5: day = "Thursday";
				break; 
		case 6: day = "Friday";
				break;
		}
		
		return day; //return string 
	}
}
