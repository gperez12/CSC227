/*====================================================================================
 |	Assignment:	Program #8: Prog8B.java
 |	    Author:	Gabriel Perez
 |Sect. Leader:	Patrick Hickey
 |
 |	    Course:	CSc 227
 |	Instructor:	L. McCann
 |	  Due Date:	April 1, 2014, by 9:00 p.m. MST
 |
 | Description:	This program is used to test PolynomialB.java. This 
 |				program will take all the method created in the PolynomialB
 |				class and test them. 
 |					
 |Deficiencies:	None known; this program meets specifications.
*==========================================================================================*/

	public class Prog8B {

		public static void main(String args[])
		{
			// creating polynomial1
			System.out.println("Creating polynomial1.\n");
			PolynomialB polynomial1 = new PolynomialB();
			
			// adding a term to polynomial1
			System.out.println("Adding term 2x^2");
			polynomial1.addTerm(2, 2);
			System.out.println(polynomial1.toString());
			
			// adding another term to polynomial1
			System.out.println("\nAdding term 3x^2");
			polynomial1.addTerm(3, 2);
			System.out.println(polynomial1.toString());
			
			// adding a negative term to polynomial1
			System.out.println("\nAdding term 4x^2");
			polynomial1.addTerm(4, 2);
			System.out.println(polynomial1.toString());
			
			// checking if Polynomial1 is empty
			System.out.println("\nTesting isEmpty, Should return False");
			System.out.println(polynomial1.isEmpty());
			
			// checking if Polynomial1 isFull
			System.out.println("\nTesting isFull, Should return False");
			System.out.println(polynomial1.isFull());
			
			// evaluating Polynomial1 with the value of 2 
			System.out.println("\nTesting evaluate, Should return 36.0:");
			System.out.println(polynomial1.evaluate(2));
			
			// scalar multiplying Polynomial1 with the value of 2 
			System.out.println("\nTesting scalarmultiply, Should Print 4x^2 + 6x^2 + 8x^2");
			polynomial1.scalarMultiply(2);
			System.out.println(polynomial1.toString());
			
			// count the number of non-zero terms
			System.out.println("\nTesting holding(), should return 3:");
			System.out.println(polynomial1.holding());
			
			// finding the Coefficient that belongs to the exponent 4
			System.out.println("\nTesting getCoefficient(int e), should return 4:");
			System.out.println(polynomial1.getCoefficient(2));
			
			// flipping the side of values in Polynomial1
			System.out.println("\nTesting negate(), should return: -4x^-2 + -6x^-2 + -8x^-2");
			polynomial1.negate(); 
			System.out.println(polynomial1.toString());
			
			// checking if the polynomial1 is equal to itself 
			System.out.println("\nTesting equals(), should return True:");
			System.out.println(polynomial1.equals(polynomial1));
			
			System.out.println("-----------------------------------");
			
			// creating Polynomial2 
			System.out.println("Creating polynomial2.\n");
			PolynomialB polynomial2 = new PolynomialB();
			
			// adding a term to polynomial2
			System.out.println("Adding term 3x^2");
			polynomial2.addTerm(3, 2);
			System.out.println(polynomial2.toString());
			
			// adding another term to polynomial2
			System.out.println("\nAdding term 0x^2");
			polynomial2.addTerm(0, 2);
			System.out.println(polynomial2.toString());
			
			// adding a negative term to polynomial2
			System.out.println("\nAdding term x^2");
			polynomial2.addTerm(1, 2);
			System.out.println(polynomial2.toString());
			
			// checking if Polynomial2 is Empty 
			System.out.println("\nTesting isEmpty, Should return False");
			System.out.println(polynomial2.isEmpty());
			
			// checking if Polynomial2 is Full
			System.out.println("\nTesting isFull, Should return False");
			System.out.println(polynomial2.isFull());
			
			// evaluating Polynomial2 based on the value of 3
			System.out.println("\nTesting evaluate, Should return 36:");
			System.out.println(polynomial2.evaluate(3));
			
			// multiplying the value of 2 against polynomial2 
			System.out.println("\nTesting scalarmultiply, Should Print 6X^2 + 0x^2 + 2x^2");
			polynomial2.scalarMultiply(2);
			System.out.println(polynomial2.toString());
			
			// counting the number of non-zero terms
			System.out.println("\nTesting holding(), should return 2:");
			System.out.println(polynomial2.holding());
			
			// find the Coefficient that belongs to the exponent of 2
			System.out.println("\nTesting getCoefficient(int e), should return 6:");
			System.out.println(polynomial2.getCoefficient(2));
			
			// flipping all the signs in Polynomial2 
			System.out.println("\nTesting negate(), should return: -6x^-2 + 0x^-2 + -2x^-2");
			polynomial2.negate(); 
			System.out.println(polynomial2.toString());
			
			// testing if Polynomial1 and 2 are equal
			System.out.println("\nTesting equals(), should return False:");
			System.out.println(polynomial2.equals(polynomial1));
			
		}	// end of main
	} //end of Prog8B

