
public class CalendarDate {
	
	private int year, month, day;
	private String monthSpelling;
	private String date; 
	
	public CalendarDate (int year, int month, int day)
	{
		
		if (month < 0 || month == 0)
			month = 1; 
		
		if (month > 12)
			month = 12;
		
		if (day < 0 || day == 0)
			day = 1; 
		
		if (month == 2 && day == 29)
		{
			if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
			{
				day = 29; 
			}
			else 
			{
				day = 28;
			}
		}
		
		if (day > 31)
			day = 31; 
		
		if (year<0)
			year = Math.abs(year);
		
		if (month == 4 || month == 6 || month == 9 || month == 11)
		{
			if(day == 31)
			{
				day = 30; 
			}
		}
		
		this.year = year;
		this.month = month; 
		this.day = day; 
		
		
	}
	
	public void setDate (int year, int month, int day){
		if (month < 0)
			month = 1; 
		if (month > 12)
			month = 12;
		if(day < 0)
			day = 1; 
		if(day > 31)
			day = 31; 
		if (year<0)
			Math.abs(year);
		
		this.year = year;
		this.month = month; 
		this.day = day; 
	}
	
	public int getYear()
	{
		return year;
	}
	
	public int getMonth()
	{
		return month; 
	}

	public String getMonthAsString()
	{
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
		return day; 
	}
	
	public String toString()
	{ 
		this.monthSpelling = getMonthAsString();
		
		date = monthSpelling + " " + day + ", " + year;
		return date; 
	}

	public boolean equals (CalendarDate otherDate)
	{
		boolean result = false;
		int monthCopy, dayCopy, yearCopy; 
		
		monthCopy = otherDate.getMonth();
		dayCopy = otherDate.getDay(); 
		yearCopy = otherDate.getYear();
		
		if (monthCopy == this.month)
		{
			if(dayCopy == this.day)
			{
				if (yearCopy == this.year)
				{
					result = true; 
				}
			}
		}
		
		return result;
		
	}
	
	public CalendarDate tomorrow()
	{ 
		int monthCopy, dayCopy, yearCopy;
		
		monthCopy = this.month; 
		dayCopy = this.day; 
		yearCopy = this.year;
		
		if (monthCopy == 12 && dayCopy == 31)
		{
			monthCopy = 1; 
			dayCopy = 1; 
			yearCopy++;
		}
		
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
		else if(monthCopy == 2)
		{
			if(yearCopy % 4 == 0 && yearCopy % 100 != 0 || yearCopy % 4 == 0)
			{
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
			else 
			{
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
		
		CalendarDate tomorrow = new CalendarDate (yearCopy, monthCopy, dayCopy);
		
		return tomorrow; 
	}

	public CalendarDate yesterday()
	{
		int monthCopy, dayCopy, yearCopy;
		
		monthCopy = this.month; 
		dayCopy = this.day; 
		yearCopy = this.year;
		
		if (monthCopy == 1 && dayCopy == 1)
		{
			monthCopy = 12; 
			dayCopy = 31; 
			yearCopy--;
		}
		
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
		else if(monthCopy == 3)
		{
			if(yearCopy % 4 == 0 && yearCopy % 100 != 0 || yearCopy % 4 == 0)
			{
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
			else 
			{
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
		
		CalendarDate yesterday = new CalendarDate (yearCopy, monthCopy, dayCopy);
		
		return yesterday; 
		
	}
		
	private int LeapYear()
	{
		int leapYear =0, monthCode = 0, floor, twoLastDigitYear, twoFirstDigitYear; 
		double dayOfWeek; 
		
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
	
	twoFirstDigitYear = year/100; 
	twoLastDigitYear = year%100;
	floor = ((5*twoLastDigitYear)/4);
	
	dayOfWeek = (((Math.floor(floor)+monthCode+day)-2*(twoFirstDigitYear%4)+7)%7);
	return (int) dayOfWeek; 

	}
	
	public String dayOfTheWeek()
	{
		String day = null;
		int dayOfWeek = LeapYear(); 
		
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
		
		return day; 
	}
}
