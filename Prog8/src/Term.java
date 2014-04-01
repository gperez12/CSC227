/*+----------------------------------------------------------------------
 ||
 ||  Class Term.java
 ||
 ||         Author:  Gabriel Perez
 ||
 ||        Purpose:  This class creates term objects that are used
 ||					 to support the Polynomial class. This class will 
 ||					 take the Coefficients and Exponents and place them
 ||					 into an array to pass off to the Polynomial class.  
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
 ||   Constructors:  Term(int, int)
 ||
 ||  Class Methods:  None.
 ||
 ||  Inst. Methods:  int [] getArray()
 ||
 ++-----------------------------------------------------------------------*/
public class Term {
	
	public int [] values = new int [2]; //Array for the exponent and coefficient
	 /*---------------------------------------------------------------------------
    |  Method Term (int, int)
    |
    |  Purpose:  This constructor will create a term object. In the object 
    |			 it creates an array that will hold the coefficient and exponent
    |			 to support the Polynomial class.
    |
    |  Pre-condition:  None.
    |
    |  Post-condition: A reference to a term object will be created with an
    |				   array containing coefficients and exponents.
    |
    |  Parameters: None.
    |
    |  Returns:  A reference to the new term object. 
    *----------------------------------------------------------------------------*/
	public Term(int c, int e)
	{
		values[0] = c; //assign coefficient to the first element
		values[1] = e; //assign exponent to the second element
	}
	 /*---------------------------------------------------------------------------
    |  Method getArray ()
    |
    |  Purpose:  This method allows the Polynomial class to retrieve the data stored
    |			 in the term object. 
    |
    |  Pre-condition:  None.
    |
    |  Post-condition: None.
    |
    |  Parameters: None.
    |
    |  Returns:  values array with exponent and coefficient
    *----------------------------------------------------------------------------*/
	
	public int [] getArray()
	{
		return values; 
	}

}
