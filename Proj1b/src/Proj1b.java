import java.util.*; 

public class Proj1b {

	public static void main(String args[])
	{
		int age,
			outcome_Age = 0; 
		double amount,
			   percentage,
			   total = 0;
		
		Scanner keyboard; 
		
		keyboard = new Scanner (System.in);
		
		System.out.print("Imagine that you make an investment on "
						+ "your next birthday.\nThis program will "
						+ "compute the value of that investment \nwhen"
						+ "you turn 70.0, and will tell you the amount\n"
						+ "you will lose by waiting just 5.0 years to "
						+ "make the investment.\n");
		
		System.out.print("\nHow many years old will you be on your next birthday?:"); 
		age = keyboard.nextInt();
		
		System.out.print("Enter the amount, in dollars, to be invested:");
		amount = keyboard.nextDouble();
		
		System.out.print("Enter the investment's APY as a percent (ex: 3.5):");
		percentage = keyboard.nextDouble();
		
		System.out.print("\nBe aware: Your investment's APR is just " + percentage + "\n");

		System.out.print("\nAt age " + age + ", an investment of $"
						+ amount + ",\ncompounded 365.0 times per"
						+ " year using an APY of " + percentage + 
						", \nwill be worth " + total + " when you turn "
						+ outcome_Age + " years old." );
		
		
		
		
	}
}
