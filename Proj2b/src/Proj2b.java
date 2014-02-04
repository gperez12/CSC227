import java.util.*;

public class Proj2b {
	
	public static void main (String [] args)
	{
		Scanner keyboard; 
		int month, 
			year, 
			twoFirstDigitYear,
			twoLastDigitYear,
			leapYear=0,
			monthCode = 0,
			day = 1,
			count = 0, x =1, daysInMonth = 0;
		double dayOfWeek;
		double floor; 
		
		keyboard = new Scanner (System.in);
		
			System.out.print("Enter the month (1-Jan, 2-Feb, etc..) and the year:");
			month = keyboard.nextInt();
			year = keyboard.nextInt();
			
		do{
			if (month <=0 || month > 12){
			System.out.print("I'm sorry but the value you have entered is "+
							"invaild!\nPlease choose a positive integer from 1 to 12\n"
							+ "for the corresponding month: ");
			month = keyboard.nextInt();
			}
			
		}while(month < 0 || month > 12 || year <=0);
		
		twoFirstDigitYear = year/100; 
		twoLastDigitYear  = year%100;
		
		if ((year%4 ==0 && year%100 !=0)||(year%400 ==0))
			leapYear = 1; //if leapyear flag
		
		if(month == 1)
			if(leapYear == 1){
				monthCode = 6;
				System.out.println("January " + year + ":\n");
				daysInMonth = 31;
			}
			else{
				monthCode = 0; 
				System.out.println("January " + year + ":\n");
				daysInMonth = 31;
			}
		else if (month ==2)
			if(leapYear == 1){
				monthCode = 2;
				System.out.println("February " + year + ":\n");
				daysInMonth = 29; 
			}
			else{
				monthCode = 3; 
				System.out.println("February " + year + ":\n");
				daysInMonth = 28; 
			}
		else if (month == 3){
				daysInMonth = 31;
				monthCode = 3;
				System.out.println("March " + year + ":\n");
			}
		else if (month == 4){
				daysInMonth = 30;
				monthCode = 6;
				System.out.println("April " + year + ":\n");
			}
		else if (month == 5){
				daysInMonth = 31;
				monthCode = 1;
				System.out.println("May " + year + ":\n");
			}
		else if (month == 6){
				daysInMonth = 30;
				monthCode = 4; 
				System.out.println("June " + year + ":\n");
			}
		else if (month == 7){
				daysInMonth = 31;
				monthCode = 6; 
				System.out.println("July " + year + ":\n");
			}
		else if (month == 8){
				daysInMonth = 31;
				monthCode = 2; 
				System.out.println("August " + year + ":\n");
			}
		else if (month == 9){
				daysInMonth = 30;
				monthCode = 5; 
				System.out.println("September " + year + ":\n");
			}
		else if (month == 10){
				daysInMonth = 31;
				monthCode = 0;
				System.out.println("October " + year + ":\n");
			}
		else if (month == 11){
				daysInMonth = 30; 
				monthCode = 3;
				System.out.println("November " + year + ":\n");
			}
		else if (month == 12){
				daysInMonth = 31;
				monthCode = 5; 
				System.out.println("December " + year + ":\n");
			}
		
		//System.out.println("First: "+ twoFirstDigitYear);
		//System.out.println("Last: "+ twoLastDigitYear);
		
		floor = ((5*twoLastDigitYear)/4);
		dayOfWeek = (((Math.floor(floor)+monthCode+day)-2*(twoFirstDigitYear%4)+7)%7);
		
		//System.out.println("Day of week is: "+ dayOfWeek); 
		System.out.println("Su\tMo\tTu\tWe\tTh\tFr\tSa");
		
		for (int i =1; i<daysInMonth+dayOfWeek; i++)
		{
			if (dayOfWeek ==0)
				dayOfWeek =7;
			
			if (count<dayOfWeek-1){
				System.out.print("\t");
				count++;
			}
			else{
				System.out.print(x + "\t");
				x++;
				
				if(i%7==0)
					System.out.print("\n");
				}
			
		}
	}

}
