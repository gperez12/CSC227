import java.util.*;

public class Proj2a {
	
	public static void main(String [] args)
	{
		int startingValue,
			count = 0,
			temp,
			max = 0,
			total = 1; 
		
		Scanner keyboard; 
		
		keyboard = new Scanner (System.in);
		
		System.out.print("Enter the starting value for the hailstone sequence:");
		startingValue = keyboard.nextInt();
		
		System.out.println("\nThe sequence of hailstones formed from " + startingValue 
						  + " is :\n");
		
		System.out.print(startingValue + "\t");
		
		while (startingValue >1)
		{	
			temp = startingValue;
			if (startingValue % 2 == 0){
				startingValue = startingValue/2;
			}
			else{
				startingValue = (startingValue*3)+1;
			}
			count ++;
			total ++;
			
			if(count == 8){
				System.out.print("\n");
				count = 0; 
			}
			
			if(temp > max){
				max = temp;
			}
			System.out.print(startingValue + "\t");
		}
		System.out.print("\n");
		
		System.out.println("\nThe hailstone sequence contains " + total +
				" hailstones, and the largest\nvalue in the" +
				" sequence is " + max + ".");
			
		}
	
		
}
		
		

