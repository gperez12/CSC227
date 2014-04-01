import java.util.*;

/*+----------------------------------------------------------------------
 ||
 ||  Class Polynomial.java
 ||
 ||         Author:  Gabriel Perez
 ||
 ||        Purpose:  This class creates polynomial object and implements
 ||					 Quality class. This class allows users to access 
 ||					 polynomial objects and perform operations such as 
 ||					 evaluating, adding, holding, tostring and much more. 
 ||
 ||  Inherits From:  None.
 ||
 ||     Interfaces:  Quality.java
 ||
 |+-----------------------------------------------------------------------
 ||
 ||      Constants:  None.
 ||
 |+-----------------------------------------------------------------------
 ||
 ||   Constructors:  Polynomial()
 ||
 ||  Class Methods:  None.
 ||
 ||  Inst. Methods:  Polynomial add(Polynomial p)
 ||					 Polynomial replicate()
 ||					 Polynomial negate()
 ||					 boolean    equals(Polynomial p)
 ||				     boolean    isEmpty()
 ||					 boolean    isFull()
 ||					 double     evaluate(double x)
 ||					 String     toString()
 ||					 void 		addTerm(int c, int e)
 ||					 void       scalarMultiply(int s)
 ||					 int        getCoefficient(int e)
 ||                  int        holding()
 ||
 ++-----------------------------------------------------------------------*/
class Polynomial implements Quantity {
	
	private ArrayList <Integer> list ; //variable for the ArrayList
	 /*---------------------------------------------------------------------------
    |  Method Polynomial ()
    |
    |  Purpose:  This constructor will create a Polynomial object. In the object 
    |			 it creates an empty ArrayList.
    |
    |  Pre-condition:  None.
    |
    |  Post-condition: A reference to a Polynomial object will be created with an
    |				   empty ArrayList.
    |
    |  Parameters: None.
    |
    |  Returns:  A reference to the new Polynomial object. 
    *----------------------------------------------------------------------------*/
	public Polynomial()
	{
		list = new ArrayList <Integer> (); //creating an empty ArrayList
		
	}
	 /*---------------------------------------------------------------------------
    |  Method add(Polynomial p)
    |
    |  Purpose:  This method will add the Polynomial object p to the current
    |			 Polynomial object. Once this addition is completed the method 
    |			 will return a new Polynomial object with the corrected value. 
    |
    |  Pre-condition: None.
    |
    |  Post-condition: A reference to a Polynomial object will be created with an
    |				   containing the addition between the two other Polynomial objects
    |
    |  Parameters: Polynomial p -- a Polynomial object containing terms. 
    |
    |  Returns:  A reference to the new Polynomial object. 
    *----------------------------------------------------------------------------*/
	public Polynomial add (Polynomial p)
	{
		int value =0;  //variable to hold the sum
		
		for(int i =0; i<list.size(); i++)	//for loop to go through all the elements
		{
			value = list.get(i) + list.get(i); //adding the values within the list
		}
		return p; //return the polynomial
		
	}
	 /*---------------------------------------------------------------------------
    |  Method addTerm (int c, int e)
    |
    |  Purpose:  This method will take two int inputs (c) coefficient and (e) exponent.
    |			 With this information the method will add this term to the current 
    |			 Polynomial object.  
    |
    |  Pre-condition:  A reference to a Polynomial object currently exists.
    |
    |  Post-condition: A term will be added to the current Polynomial object. 
    |
    |  Parameters: int c -- The coefficient of the term 
    |			   int e -- The exponent of the term 
    |
    |  Returns:  None.  
    *----------------------------------------------------------------------------*/
	public void addTerm (int c, int e)
	{
		int [] termArray = new int [2]; //create an array to retrieve data from term 
		
		Term temp = new Term(c,e);	//create term object
		termArray = temp.getArray(); //store term object information into array
		
		list.add(termArray[0]);	//add coefficient from term to list
		list.add(termArray[1]); //add exponent from term to list
		
	}
	 /*---------------------------------------------------------------------------
    |  Method replicate ()
    |
    |  Purpose:  This method will create a new polynomial object with a current of 
    |			 the current Polynomial object. 
    |
    |  Pre-condition:  A reference to a Polynomial object currently exists.
    |
    |  Post-condition: Creates a new reference to a Polynomial object containing the 
	|				   same polynomial as the current
    |
    |  Parameters: None.
    |
    |  Returns:  A reference to the new Polynomial object. 
    *----------------------------------------------------------------------------*/
	public Polynomial replicate ()
	{
		Polynomial temp = new Polynomial();	//create a Polynomial object
		return temp;	//return Polynomial object
		
	}
	 /*---------------------------------------------------------------------------
    |  Method equals (Polynomial p)
    |
    |  Purpose:  This method will check to see if the current Polynomial object and 
    |			 Polynomial p has the same content. If they contain the same content 
    |            this method will produce a true. 
    |
    |  Pre-condition:  A reference to a Polynomial object currently exists.
    |
    |  Post-condition: Returns true or false based on the content of the two Polynomial
    |				   objects.
    |
    |  Parameters: Polynomial p -- A reference to a Polynomial object that a user would
    |							   like to compare to the current Polynomial object. 
    |
    |  Returns:  True or False based on if the contents of both objects are equal.
    *----------------------------------------------------------------------------*/
	public boolean equals (Polynomial p)
	{
		if(p.holding() == this.holding())	//check to see if the number of terms are equal
		{
			return true;
		}
		else 
			return false; 
	}
	 /*---------------------------------------------------------------------------
    |  Method evaluate (double x)
    |
    |  Purpose:  This method will evaluate the current Polynomial object with value
    |            of double x.  
    |
    |  Pre-condition:  A reference to a Polynomial object currently exists.
    |
    |  Post-condition: Returns the result of the evaluation. 
    |
    |  Parameters: double x -- The value the user would like to evaluate the Polynomial
    |						   by. 
    |
    |  Returns:  Returns the result of the evaluation. 
    *----------------------------------------------------------------------------*/
	public double evaluate(double x)
	{
		double total =0, sum =0;	//variable for addition
		for (int i =0; i<list.size(); i++)	//for loop to go through list
		{
			if(i%2 == 0)	//if number is even (Coefficient)
			{
				total = (list.get(i)* (Math.pow(x, (double)list.get(i+1)))); //calculate (3*((3)^2))
				sum = sum + total; //sum up total 
			}
		}
		return sum; //return sum 
	}
	 /*---------------------------------------------------------------------------
    |  Method getCoefficient (int e)
    |
    |  Purpose:  This method will return the Coefficient based on the given exponent. 
    |
    |  Pre-condition:  A reference to a Polynomial object currently exists.
    |
    |  Post-condition: Returns the Coefficient that goes along with the given exponent.
    |
    |  Parameters: int e -- Exponent value.
    |
    |  Returns:  Returns the Coefficient that goes along with the given exponent.
    *----------------------------------------------------------------------------*/
	public int getCoefficient (int e) 
	{
		int coefficient = 0; //variable to store Coefficient
		for(int i =0; i<list.size(); i++) //for loop to iterate through list
		{
			if(i%2 != 0) //if odd (exponent)
			{
				if (list.get(i) == e) //check if value is equal to give exponent
				{
					coefficient = list.get(i-1); //retrieve matching coefficient
					i = list.size() + 1; //adjust condition to exit loop
				}
			}
		}
		return coefficient; //return Coefficient
	}
	 /*---------------------------------------------------------------------------
    |  Method isEmpty ()
    |
    |  Purpose:  This method will check to see if the Polynomial object is termless.
    |			 If the object is termless then the method will return true. If the 
    |			 object contains terms than it will return false.  
    |
    |  Pre-condition:  A reference to a Polynomial object currently exists.
    |
    |  Post-condition: Returns true or false based on whether the object is termless 
    |				   or not. 
    |
    |  Parameters: None.
    |
    |  Returns:  Returns true or false based on whether the object is termless or not. 
    *----------------------------------------------------------------------------*/
	public boolean isEmpty ()
	{
		if(list.isEmpty() == true) //if list is empty return true
		{
			return true;
		}
		else //if not empty return false
			return false; 
	}
	 /*---------------------------------------------------------------------------
    |  Method isFull ()
    |
    |  Purpose:  This method will check to see if the Polynomial object is full of terms.
    |			 If the object is full then the method will return true. If the 
    |			 object contain space than it will return false.  
    |
    |  Pre-condition:  A reference to a Polynomial object currently exists.
    |
    |  Post-condition: Returns true or false based on whether the object is full 
    |				   or not. 
    |
    |  Parameters: None.
    |
    |  Returns:  Returns true or false based on whether the object is full or not. 
    *----------------------------------------------------------------------------*/
	public boolean isFull ()
	{
		return false; //ArrayList will grow it can't be full
	}
	 /*---------------------------------------------------------------------------
    |  Method holding ()
    |
    |  Purpose:  This method will count the number of non-zero terms within the
    |			 Polynomial object. 
    |
    |  Pre-condition:  A reference to a Polynomial object currently exists.
    |
    |  Post-condition: Returns the count of non-zero terms within the Polynomial object. 
    |
    |  Parameters: None.
    |
    |  Returns:  Returns the count of non-zero terms within the Polynomial object.
    *----------------------------------------------------------------------------*/
	public int holding ()
	{
		int count =0; //counting variable
		for(int i =0; i<list.size(); i++) //for loop to go through list
		{
			if(i%2 == 0) //if i is even (Coefficient)
			{
				if(list.get(i) != 0) //if Coefficient is not zero
				{
					count++; //count it as term
				}
			}
		}
		return count; //return term count
		
	}
	 /*---------------------------------------------------------------------------
    |  Method negate ()
    |
    |  Purpose:  This method will create a new reference to a Polynomial object
    |			 containing the same values as the current Polynomial but will flip 
    |			 the signs of the Coefficients.  
    |
    |  Pre-condition:  A reference to a Polynomial object currently exists.
    |
    |  Post-condition: Returns a new reference of a Polynomial object with the same 
    |                  content as the current Polynomial but will flip the Coefficient 
    | 				   signs.  
    |
    |  Parameters: None.
    |
    |  Returns:  Returns a new reference of a Polynomial object with the same 
    |            content as the current Polynomial but will flip the Coefficient 
    | 		     signs.  
    *----------------------------------------------------------------------------*/
	public Polynomial negate ()
	{
		Polynomial newpoly = new Polynomial(); //create Polynomial object
		int value =0; //Variable to hold calculations
		for(int i =0; i<list.size(); i++) //for loop to go through list
		{
			if(list.get(i) < 0)	// if negative get absolute value
			{
				value = list.get(i);
				value = Math.abs(value);
				list.set(i, value); //store new value in list
				value = 0; 
			}
			else //if value is positive times by -1
			{
				value = list.get(i);
				value = value*-1;
				list.set (i, value); //store new value into list
				value = 0;
			}
		}
		return newpoly; //return object
		
		
	}
	 /*---------------------------------------------------------------------------
    |  Method scalarMultiply (int s)
    |
    |  Purpose:  This method will multiply each term's Coefficients in current
    |			 Polynomial object. 
    |
    |  Pre-condition:  A reference to a Polynomial object currently exists.
    |
    |  Post-condition: Updates the Polynomial object with updated Coefficients. 
    |
    |  Parameters: None.
    |
    |  Returns:  None. 
    *----------------------------------------------------------------------------*/
	public void scalarMultiply (int s)
	{
		int value=0; //variable to do calculation
		for(int i =0; i<list.size(); i++) //for loop to go through list
		{
			if(i%2 == 0) //if i is even (Coefficient) 
			{
				value = list.get(i); //retrieve Coefficient
				value = value*s; //multiply by scalar
				list.set(i,value); //store new value back in list
				value =0; 
			}
		}
	}
	 /*---------------------------------------------------------------------------
    |  Method toString ()
    |
    |  Purpose:  This method will create a string representation based on the polynomial
    |			 object.  
    |
    |  Pre-condition:  A reference to a Polynomial object currently exists.
    |
    |  Post-condition: Returns a string showing the polynomial representation.   
    |
    |  Parameters: None.
    |
    |  Returns:  Returns a string showing the polynomial representation.  
    *----------------------------------------------------------------------------*/
	public String toString ()
	{
		String str; //string variable
		StringBuilder temp = new StringBuilder(1); //stringbuilder variable
		
		//for loop to go through list
		for(int i =0; i<list.size(); i++) 
		{
			//if even (Coefficient)
			if (i%2 ==0) 
			{
				//add value plus "x^" to stringbuilder
				temp.append(list.get(i) + "x^"); 
			}
			//if last value do not add "x^"
			else if (i == list.size() -1) 
			{
				temp.append(list.get(i)); 
			}
			// if middle case add "+"
			else
			{
				temp.append(list.get(i) + " + "); 
			}
		}
		//convert stringbuilder to string
		str = temp.toString();
		//return string
		return str; 
		
	}

}
