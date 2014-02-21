
public class Prog4 {

	public static void main (String [] args)
	{
		CalendarDate tomorrow, yesterday;
		CalendarDate date = new CalendarDate(1992,8,8);
		boolean result;
		
		System.out.println("Creating new CalendarData object with 1992, 8, 8");
		CalendarDate testing = new CalendarDate (1993, 2, 29);
		System.out.println(); 
		
		System.out.println("Calling getYear()...should return 1992" + 
						   "\nOutput: " + testing.getYear());
		
		System.out.println("Calling getMonth()....should return 8" +
						   "\nOutput: " + testing.getMonth());
		
		System.out.println("Calling getDay()...should return 8" +
						   "\nOutput: " + testing.getDay());
		
		System.out.println("Calling getMonthAsString()....should return August" +
						   "\nOutput: " + testing.getMonthAsString()); 
		
		System.out.println("Calling toString()...should return August 8, 1992" +
						   "\nOutput: " + testing.toString());
		
		System.out.println("Testing dayOfTheWeek().....should return Saturday" +
						   "\nOutput: " + testing.dayOfTheWeek()); 
		
		System.out.println("Testing tomorrow()....should return CalendarDate object will test next line\n"); 
		tomorrow = testing.tomorrow();
		
		System.out.println("Testing tomorrow() output with toString()...should return August 9, 1992"
							+"\nOutput: " + tomorrow.toString());
		System.out.println("Testing yesterday()...should return CalendarDate object, will test next line");
		yesterday = testing.yesterday(); 
		System.out.println("Testing yesterday() output with toString()...should return August 7, 1992"
				+ "\nOutput: " + yesterday.toString());		
		
		result = testing.equals(date);
		System.out.println("Testing equals()....should return true"
						+ "\nOutput: " + result);
		
		
	
	}
}
