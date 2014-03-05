/*====================================================================================
 |	Assignment:	Program #5: Demons of Cyclic Space
 |	    Author:	Gabriel Perez
 |Sect. Leader:	Patrick Hickey
 |
 |	    Course:	CSc 227
 |	Instructor:	L. McCann
 |	  Due Date:	March 4, 2014, by 9:00 p.m. MST
 |
 | Description:	This program will use the Demon class to create a Demon object
 |				and present the Demons of Cyclic Space in a graphic interface.
 |				The program uses the multiple rules that were constructed by A.K.
 |				Dewdney to mathematically generate this sequence. 
 |					
 |Deficiencies:	None known; this program meets specifications.
*==========================================================================================*/
import java.awt.Color;
import java.util.concurrent.TimeUnit;

public class Prog5 {

	final static int PIXEL_SIZE = 20; 
	final static int COLS = 15; 
	final static int ROWS = 15;
	
	public static void main(String [] args)
	{
		//creates Demon object
		Demon universe = new Demon (15*PIXEL_SIZE, 15*PIXEL_SIZE, 13);
		//array to hold the current universe
		byte [][] universeArray = new byte [15*PIXEL_SIZE][15*PIXEL_SIZE];
		//fill the universeArray with the universe object information
		universeArray = universe.getUniverse();
		//count variable for the while loop below
		int count = 0;
				
		Picture  pic;       // drawing window object reference
		Color [] palette =  // array of available color objects
		           		{ Color.BLACK,  Color.BLUE, Color.RED,    Color.GREEN,
		                  Color.ORANGE, Color.PINK, Color.YELLOW, Color.WHITE, Color.CYAN, 
		                  Color.DARK_GRAY, Color.MAGENTA, Color.LIGHT_GRAY, Color.GRAY};

		                // Create the drawing window, with enough actual pixels to
		                // accommodate the size of our 'virtual' pixels
		pic = new Picture (COLS*PIXEL_SIZE , ROWS*PIXEL_SIZE);
		
		//while loop to create the 250 iterations for the presentation
		while (count != 250)
		{
			//advance the universe 
			universe.advance();
			//returns advanced array to local array
		    universeArray = universe.getUniverse(); 
		    //for loop for row	
		    for (int row =0; row < universeArray.length; row++)
		    {
		    	//for loop for column
		    	for (int column = 0; column < universeArray[row].length; column++)
		        {
		    		if (universeArray[row][column] == 0)
		    			//set the color for value
		        		pic.set(column,row,palette[0]);
		        	else if (universeArray[row][column] == 1)
		        		pic.set(column, row, palette[1]);
		        	else if (universeArray[row][column] == 2)
		        		pic.set(column, row, palette[2]);
		        	else if (universeArray[row][column] == 3)
		        		pic.set(column,row,palette[3]);
		        	else if (universeArray[row][column] == 4)
		        		pic.set(column, row, palette[4]);
		        	else if (universeArray[row][column] == 5)
		        		pic.set(column, row, palette[5]);
		        	else if (universeArray[row][column] == 6)
		        		pic.set (column, row, palette[6]);
		        	else if (universeArray [row][column] == 7)
		        		pic.set (column, row, palette [7]);
		        	else if (universeArray [row][column] == 8)
		        		pic.set (column, row, palette [8]);
		        	else if (universeArray [row][column] == 9)
		        		pic.set (column, row, palette [9]);
		        	else if (universeArray [row][column] == 10)
		        		pic.set (column, row, palette [10]);
		        	else if (universeArray [row][column] == 11)
		        		pic.set (column, row, palette [11]);
		        	else if (universeArray [row][column] == 12)
		        		pic.set(column, row,  palette[12]);
		        } 
		    }
		    //show pic to the user
		    pic.show();
		    //try-catch block for exception that TimeUnit may throw
		    try {
					TimeUnit.MILLISECONDS.sleep(200);
				}catch (InterruptedException e) {
						//if exception print the stacktrace for more information
						e.printStackTrace();
				}
		    //display iteration number
		    System.out.println("This is iteration: " + count);
		    //increase the count by one
		    count++; 
		}
		//display the user on how to exit
		System.out.println("\nStop the program by closing the picture window.");

	}  // main

}  // Prog5


