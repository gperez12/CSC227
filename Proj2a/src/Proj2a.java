import java.util.*;

public class Proj2a {
	
	public static void main(String [] args)
	{
		int startingValue,
			count = 0; 
		
		Scanner keyboard; 
		
		keyboard = new Scanner (System.in);
		
		System.out.print("Enter the starting value for the hailstone sequence:");
		startingValue = keyboard.nextInt();
		
		System.out.println("\nThe sequence of hailstones formed from " + startingValue 
						  + " is :\n");
		
		System.out.print(startingValue + "\t");
		
		while (startingValue >1)
		{
			if (startingValue % 2 == 0){
				startingValue = startingValue/2;
			}
			else{
				startingValue = (startingValue*3)+1;
			}
			count ++;
			
			if(count == 8){
				System.out.print("\n");
				count = 0; 
			}
			
			System.out.print(startingValue + "\t");
		}
		
		
	}
		
		
}

