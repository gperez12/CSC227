/*+----------------------------------------------------------------------
 ||
 ||  Class Demon.java
 ||
 ||         Author:  Gabriel Perez
 ||
 ||        Purpose:  This class was created to help create an object that
 ||				     will mathematically help display the Demons of Cyclic
 ||					 Space. The rules that are used within this class come 
 ||					 from A.K. Dewdney and represent a two-dimensional 
 ||                  cellular automation (2D CA).
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
 ||   Constructors:  Demon (int height, int width, int stage)
 ||
 ||  Class Methods:  None.
 ||
 ||  Inst. Methods:  void      populate ()
 ||					 byte [][] getUniverse ()
 ||					 void      setUniverse (byte [][])
 ||					 void      advance ()
 ||
 ++-----------------------------------------------------------------------*/
import java.util.*;

public class Demon {
	//byte array that contains the currentVersion/universe
	private byte [][] currentVersion; 
	//byte array that contains the nextVersion/universe
	private byte [][] nextVersion; 
	int width,	//width of the array as integer
		height, //height of the array as an integer
		state;  //number of state 
	 /*---------------------------------------------------------------------------
    |  Method Demon (int,int,int)
    |
    |  Purpose:  This constructor will create a Demon object. In the object 
    |			 it creates two arrays and fills one byte array (currentVersion)
    |			 with random numbers.
    |
    |  Pre-condition:  None.
    |
    |  Post-condition: A reference to a Demon object will be created with an
    |				   array filled with random byte values. 
    |
    |  Parameters: int width -- The integer value of the width of the byte array
    |	           int height-- The integer value of the height of the byte array
    |	           int state -- The domain [0 - n-1], the values placed within
    |							the byte array
    |
    |  Returns:  A reference to the new Demon object. 
    *----------------------------------------------------------------------------*/
	public Demon (int height, int width, int state)
	{
		//storing the values from parameters into instance variables
		this.width = width; 
		this.height = height;
		this.state = state; 
		//creating two byte array
		this.currentVersion = new byte[this.height][this.width];
		this.nextVersion = new byte[this.height][this.width];
		//calls populate to fill values within the array
		populate(); 
	}
	/*---------------------------------------------------------------------
    |  Method populate()
    |
    |  Purpose: This method will assign random values from [0 to state-1]
    |			in the currentVersion array.
    |
    |  Pre-condition: A reference to a Demon object must be set.
    |
    |  Post-condition: This will assign random values from [0 to state-1]
    |			       in the currentVersion array.
    |
    |  Parameters: None.
    |
    |  Returns:  None.
    *-------------------------------------------------------------------*/
	private void populate ()
	{
		//create a random object
		Random rand = new Random(); 
		//for loop for row
		for (int row =0; row < currentVersion.length; row++)
		{	//for loop for column
			for(int column = 0; column < currentVersion[row].length; column++)
			{
				//assign byte values from [0 to state-1] into array
				currentVersion[row][column] = (byte) rand.nextInt((this.state-1));
			}
		}
	}
	/*---------------------------------------------------------------------
    |  Method 	getUniverse()
    |			setUniverse(byte[][] input)	
    |
    |  Purpose: The set methods will allow the user to change the instance
    |			variables (i.e., array values). The get method will allow 
    |   		the user to see the values within the instance variable. 
    |
    |  Pre-condition: A reference to a Demon object must be established.
    |
    |  Post-condition: The getters will not change any of the instance variables. 
    |		       	   However, for the setters the user will be able to change 
    |		           the values of the instance variables. 
    |
    |  Parameters:
    |     byte [][] input -- An byte array that has values pre-assigned by the
    |						 user.
    |
    |  Returns:  The byte array will be returned by the getters.
    |		 	 The setter will not return anything.
    *-------------------------------------------------------------------*/
	public byte [][] getUniverse()
	{
		//creates a byte array that is used for returning the array
		byte [][] currentUniverseCopy = new byte [this.height][this.width];
		//for loop for the row
		for (int row =0; row < this.currentVersion.length; row++)
		{	//for loop for the column
			for(int column = 0; column < this.currentVersion[row].length; column++)
			{
				//assigning the value from currentVersion to copy array
				currentUniverseCopy[row][column] = this.currentVersion[row][column];
			}
		}
		//return a copy of the array
		return currentUniverseCopy; 
	}
	
	public void setUniverse(byte[][] input)
	{	//for loop for row
		for(int row =0; row<input.length; row++)
		{	//for loop for column
			for(int column =0; column<input[row].length; column++)
			{
				//assign value from input array to currentversion
				this.currentVersion[row][column] = input[row][column];
			}
		}
	}
	/*---------------------------------------------------------------------
    |  Method advance()
    |
    |  Purpose:  This method will create a string with the month spelling,
    |	         the day and the year (i.e., August 10, 2014).
    |
    |  Pre-condition: A reference to a CalendarDate object must be set.
    |
    |  Post-condition: This will return a string with month spelling, day, 
    |		       and year.
    |
    |  Parameters: None.
    |
    |  Returns:  This method will return a string containing a date
    |	         (i.e., August 10, 2014).
    *-------------------------------------------------------------------*/
	public void advance()
	{
		//calling copy function
		copy(); 
		//for loop for row 
		for(int row =0; row<this.currentVersion.length; row++)
		{	//for loop for column
			for(int column =0; column<this.currentVersion[row].length; column++)
			{
				//if statements to implement 2D CA rules
				if (column == 0 && row == 0)
				{
					if(currentVersion[row+1][column] == currentVersion[row][column] + 1)
						nextVersion[row][column] = currentVersion[row+1][column];
					else if(currentVersion[row][column+1] == currentVersion[row][column] +1)
						nextVersion[row][column] = currentVersion[row][column +1];
					else if (currentVersion[row][column] == 0)
						nextVersion[row][column] = 1; 
					else if (currentVersion[row][column] == state-1)
						nextVersion[row][column] = 0; 
					else if(currentVersion[row][column] == state-2)
						nextVersion[row][column] = (byte) (state-1);
				}
				if (row == 0 && column == currentVersion.length-1)
				{
					if(currentVersion[row][column - 1] == currentVersion[row][column] +1)
						nextVersion[row][column] = currentVersion[row][column - 1];
					else if (currentVersion[row+1][column] == currentVersion [row][column] +1)
						nextVersion[row][column] = currentVersion[row+1][column];
					else if (currentVersion[row][column] == 0)
						nextVersion[row][column] = 1; 
					else if (currentVersion[row][column] == state-1)
						nextVersion[row][column] = 0; 
					else if(currentVersion[row][column] == state-2)
						nextVersion[row][column] = (byte) (state-1);
				}
				if (row == 0 && column > 0 && column < currentVersion.length-1)
				{
					if(currentVersion[row][column-1] == currentVersion[row][column] + 1)
						nextVersion[row][column] = currentVersion[row][column-1];
					else if(currentVersion[row+1][column] == currentVersion[row][column] + 1)
						nextVersion[row][column] = currentVersion[row+1][column];
					else if(currentVersion[row][column+1] == currentVersion[row][column] +1)
						nextVersion[row][column] = currentVersion[row][column+1];
					else if (currentVersion[row][column] == 0)
						nextVersion[row][column] = 1; 
					else if (currentVersion[row][column] == state-1)
						nextVersion[row][column] = 0; 
					else if(currentVersion[row][column] == state-2)
						nextVersion[row][column] = (byte) (state-1);
				}
				if (row == currentVersion.length-1 && column == 0)
				{
					if(currentVersion[row-1][column] == currentVersion[row][column] + 1)
						nextVersion[row][column] = currentVersion[row -1][column]; 
					else if(currentVersion[row][column+1] == currentVersion[row][column] + 1)
						nextVersion[row][column] = currentVersion[row][column+1];
					else if (currentVersion[row][column] == 0)
						nextVersion[row][column] = 1; 
					else if (currentVersion[row][column] == state-1)
						nextVersion[row][column] = 0; 
					else if(currentVersion[row][column] == state-2)
						nextVersion[row][column] = (byte) (state-1);
				}
				if (row > 0 && column ==0 && row < currentVersion.length-1)
				{
					if(currentVersion[row+1][column] == currentVersion[row][column]+1)
						nextVersion[row][column] = currentVersion[row+1][column];
					if(currentVersion[row][column+1] == currentVersion[row][column]+1)
						nextVersion[row][column] = currentVersion[row][column+1];
					else if (currentVersion[row][column] == 0)
						nextVersion[row][column] = 1; 
					else if (currentVersion[row][column] == state-1)
						nextVersion[row][column] = 0; 
					else if(currentVersion[row][column] == state-2)
						nextVersion[row][column] = (byte) (state-1);
				}
				if(row == currentVersion.length-1 && column == currentVersion.length-1)
				{
					if(currentVersion[row-1][column] == currentVersion[row][column] +1)
						nextVersion[row][column] = currentVersion[row-1][column];
					else if(currentVersion[row][column-1] == currentVersion[row][column]+1)
						nextVersion[row][column] = currentVersion[row][column-1];
					else if (currentVersion[row][column] == 0)
						nextVersion[row][column] = 1; 
					else if (currentVersion[row][column] == state-1)
						nextVersion[row][column] = 0; 
					else if(currentVersion[row][column] == state-2)
						nextVersion[row][column] = (byte) (state-1);
					
				}
				if(row == currentVersion.length-1 && column > 0 && column < currentVersion.length-1)
				{
					if(currentVersion[row-1][column] == currentVersion[row][column]+1)
						nextVersion[row][column] = currentVersion[row-1][column];
					else if(currentVersion[row][column-1] == currentVersion[row][column]+1)
						nextVersion[row][column] = currentVersion[row][column-1]; 
					else if(currentVersion[row][column+1] == currentVersion[row][column] +1)
						nextVersion[row][column] = currentVersion[row][column+1];
					else if (currentVersion[row][column] == 0)
						nextVersion[row][column] = 1; 
					else if (currentVersion[row][column] == state-1)
						nextVersion[row][column] = 0; 
					else if(currentVersion[row][column] == state-2)
						nextVersion[row][column] = (byte) (state-1);
				}	
				if(row>0 && row < currentVersion.length-1 && column == currentVersion.length-1)
				{
					if (currentVersion[row-1][column] == currentVersion[row][column]+1)
						nextVersion[row][column] = currentVersion[row-1][column];
					else if(currentVersion[row+1][column] == currentVersion[row][column]+1)
						nextVersion[row][column] = currentVersion[row+1][column]; 
					else if(currentVersion[row][column-1] == currentVersion[row][column]+1)
						nextVersion[row][column] = currentVersion[row][column-1];
					else if (currentVersion[row][column] == 0)
						nextVersion[row][column] = 1; 
					else if (currentVersion[row][column] == state-1)
						nextVersion[row][column] = 0; 
					else if(currentVersion[row][column] == state-2)
						nextVersion[row][column] = (byte) (state-1);
				}
				if(row>0 && row < currentVersion.length-1 && column > 0 && column < currentVersion.length-1)
				{
					if (currentVersion[row-1][column] == currentVersion[row][column]+1)
						nextVersion[row][column] = currentVersion[row-1][column];
					else if(currentVersion[row+1][column] == currentVersion[row][column]+1)
						nextVersion[row][column] = currentVersion[row+1][column]; 
					else if(currentVersion[row][column-1] == currentVersion[row][column]+1)
						nextVersion[row][column] = currentVersion[row][column-1];
					else if(currentVersion[row][column+1] == currentVersion[row][column]+1)
						nextVersion[row][column] = currentVersion[row][column+1];
					else if (currentVersion[row][column] == 0)
						nextVersion[row][column] = 1; 
					else if (currentVersion[row][column] == state-1)
						nextVersion[row][column] = 0;
					else if(currentVersion[row][column] == state-2)
						nextVersion[row][column] = (byte) (state-1);
				}
					
			}
		}
	//passing new nextVersion array to currentVersion array
	setUniverse(nextVersion);
	}
	/*---------------------------------------------------------------------
    |  Method copy()
    |
    |  Purpose: This method will take the values from the currentVersion
    |			array and store them into the nextVersion array.
    |
    |  Pre-condition: A reference to a Demon object must be set.
    |
    |  Post-condition: Store values from the currentVersion array and 
    |				   place them into the nextVersion array.
    |
    |  Parameters: None.
    |
    |  Returns:  None.
    *-------------------------------------------------------------------*/
	private void copy()
	{
		//for loop for row
		for (int row =0; row<nextVersion.length; row++)
		{	//for loop for column
			for (int column =0; column<nextVersion[row].length; column++)
			{
				//assigning values for currentVersion to nextVersion array
				nextVersion[row][column] = currentVersion[row][column];
			}
		}
	
	}
}
