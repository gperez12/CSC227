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
	
	int polynomial [];
	int polynomial2[];
	 /*---------------------------------------------------------------------------
    |  Method Polynomial ()
    |
    |  Purpose:  This constructor will create a Polynomial object. In the object 
    |			 it creates two arrays and fills the array with 0s.
    |
    |  Pre-condition:  None.
    |
    |  Post-condition: A reference to a Polynomial object will be created with an
    |				   array filled with 0s. 
    |
    |  Parameters: None.
    |
    |  Returns:  A reference to the new Polynomial object. 
    *----------------------------------------------------------------------------*/
	public Polynomial()
	{
		this.polynomial = new int [6];
		this.polynomial2 = new int [6];
		
		for (int i =0; i<polynomial.length; i++)
		{
			polynomial[i] =0; 
			polynomial2[1] =0;
		}
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
		return p;
		
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
		int [] termArray = new int [2];
		int count =0; 
		
		Term temp = new Term(c,e);
		termArray = temp.getArray();
		
		for (int i =0; i<polynomial.length; i++)
		{
			if (polynomial[i] == 0 && i > 0)
			{
				count = i; 
				i= polynomial.length + 1; 
			}
			else if (polynomial[i]==0 && i==0)
			{
				count = 0; 
				i= polynomial.length + 1; 
			}
		}
		
		for (int i =0; i<polynomial.length; i++)
		{
			if (i == count)
			{
				polynomial[i] = termArray[0];
				polynomial[i+1] = termArray[1];
				i = polynomial.length + 1; 
			}
		}
		
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
		Polynomial temp = new Polynomial(); 
		
		for (int i =0; i<polynomial.length; i++)
		{
			polynomial2[i] = polynomial[i];
		}
		
		return temp;
		
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
		return true;
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
		double total =0, sum =0; 
		for(int i =0; i<polynomial.length; i++)
		{
			if (i%2 == 0){
				total = (polynomial[i] * (Math.pow(x,(double)polynomial[i+1])));
				sum = sum + total;
			}
		}
		
		return sum;
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
		int coefficient = 0; 
		for(int i =0; i<polynomial.length; i++)
		{
			if(i%2 != 0)
			{
				if (polynomial[i] == e)
				{
					coefficient = polynomial[i-1];
					i = polynomial.length + 1; 
				}
			}
		}
		
		return coefficient;
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
		int flag =0; 
		for (int i =0; i<polynomial.length; i++)
		{
			if (polynomial[i] == 0){
				flag =0; 
			}
			else {
				flag =1;
				i = polynomial.length + 1; 
			}
		}
		
		if (flag == 0)
			return true; 
		else 
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
		int flag =0; 
		for (int i =0; i<polynomial.length; i++)
		{
			if (polynomial[i] != 0)
			{
				flag =0; 
			}
			else {
				flag =1; 
				i = polynomial.length + 1;
			}
		}
		
		if (flag == 1)
			return false; 
		else 
			return true; 
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
		int count =0; 
		for(int i =0; i < polynomial.length; i++)
		{
			if (i%2 == 0){
				if(polynomial[i] !=0){
					count ++;
				}
			}
		}
		
		return count;
		
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
		return null;
		
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
		for (int i =0; i<polynomial.length; i++)
		{
			if(i%2 == 0)
			{
				polynomial[i] = polynomial[i] * s;
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
		String str; 
		StringBuilder temp = new StringBuilder(1);
		for(int i =0; i<polynomial.length; i++)
		{
			if (i%2 ==0)
			{
				temp.append(polynomial[i] + "x^");
			}
			else if (i == polynomial.length -1){
				temp.append(polynomial[i]); 
			}
			else{
				temp.append(polynomial[i] + " + "); 
			}
		}
		str = temp.toString();
		
		return str;
		
	}
}
