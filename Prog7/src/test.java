
	/*=============================================================================
	 |   Assignment:  Program #7:  Polynomials
	 |       Author:  Ryan Province (ryprov4@email.arizona.edu)
	 | Sect. Leader:  Daniel Belcher
	 |
	 |       Course:  CSc 227
	 |   Instructor:  L. McCann
	 |     Due Date:  Tuesday, March 25th, 2014, at 9:00pm MST
	 |
	 |  Description:  This program is a testing class of the Polynomial class.
	 |                It goes though a series of possible bugs that the code might
	 |                have and ensures that is doesn't mess up. It uses toString
	 |                to verify output, except for some special cases that skips
	 |                toString to check some other issues.
	 |                
	 | Deficiencies:  No known deficiencies, this program meets requirements.
	 *===========================================================================*/

	public class test {

		public static void main(String args[])
		{
			// creating Poly1
			System.out.println("Creating a Polynomial, Poly1.");
			Polynomial Poly1 = new Polynomial();
			
			// adding a term to Poly1
			System.out.println("Adding term 10x^2 to the Polynomial");
			Poly1.addTerm(10, 2);
			System.out.println(Poly1.toString());
			
			// adding another term to Poly1
			System.out.println("Adding term 3x^4 to the Polynomial");
			Poly1.addTerm(3, 4);
			System.out.println(Poly1.toString());
			
			// adding a negative term to Poly1
			System.out.println("Adding term -x^-3 to the Polynomial");
			Poly1.addTerm(-1, -3);
			System.out.println(Poly1.toString());
			
			// adding a term of power 0 to Poly1
			System.out.println("Adding term 2x^0 to the Polynomial");
			Poly1.addTerm(2, 0);
			System.out.println(Poly1.toString());
			
			// using holding() to achieve a value of 4.
			System.out.println("Using holding().");
			System.out.println("This Polynomial is currently holding " 
						+Poly1.holding()+" terms and should be holding 4.");
			
			//using scalarMultiply(5) and should achieve 5*Poly1 
			System.out.println("Using scalarMultiply() with the scalar of '5'.");
			Poly1.scalarMultiply(5);
			System.out.println(Poly1.toString());
			
			// adding a term of the same power to Poly1
			System.out.println("Adding term 3x^0 to the Polynomial");
			Poly1.addTerm(3, 0);
			System.out.println(Poly1.toString());
			
			// adding a term that will result in a 0 term to Poly1
			System.out.println("Adding term -13x^0 to the Polynomial");
			Poly1.addTerm(-13, 0);
			System.out.println(Poly1.toString());
			
			// multiplying Poly1 by 0, should result in empty Poly1
			System.out.println("Using scalarMultiply() with the scalar of '0'.");
			Poly1.scalarMultiply(0);
			System.out.println(Poly1.toString());
			
			// using holding() on empty Poly1, should be 0
			System.out.println("Using holding()");
			System.out.println("This Polynomial is currently holding " 
						+Poly1.holding()+" terms and should be 0.");
			
			// adding a 0 term to an empty Poly1
			System.out.println("Adding term 0x^0 to the Polynomial");
			Poly1.addTerm(0, 0);
			System.out.println(Poly1.toString());		
			
			// using holding() on empty Poly1, should be 0
			System.out.println("Using holding()");
			System.out.println("This Polynomial is currently holding " 
						+Poly1.holding()+" terms and should be 0.");
			
			// adding a term to Poly1
			System.out.println("Adding term 4x^23 to the Polynomial");
			Poly1.addTerm(4, 23);
			System.out.println(Poly1.toString());	
		
			// creating Poly2
			System.out.println("Creating a  new Polynomial.");
			Polynomial Poly2 = new Polynomial();	
			
			// using holding() on Poly2, a brand new object, should be 0
			System.out.println("Using holding()");
			System.out.println("This Polynomial is currently holding " 
						+Poly2.holding()+" terms and should be 0.");
			
			// using isEmpty() on the empty Poly2 without ever using toString()
			System.out.println("Poly2 should be declared empty with isEmpty().");
			System.out.println(Poly2.isEmpty());
			
			// replicate() Poly2 and setting it to Poly1
						System.out.println("Using replicate() from Poly2 and setting it "
								+"to Poly1. Poly1 is now:");
						Poly1 = Poly2.replicate();
						System.out.println(Poly1.toString());
			
			// adding a term to Poly1
			System.out.println("Adding term x^-3 to the Poly1.");
			Poly1.addTerm(1, -3);
			System.out.println(Poly1.toString());	
			
			// setting Poly2 to the negate() of Poly1
			System.out.println("Using negate() from Poly1 and setting it "
					+"to Poly2. Poly2 is now:");
			Poly2 = Poly1.negate();
			System.out.println(Poly2.toString());
			
			// adding a term to Poly2
			System.out.println("Adding term 6x^-7 to the Polynomial2.");
			Poly2.addTerm(6, -7);
			System.out.println(Poly2.toString());	
			
			// replicate() Poly2 and setting it to Poly1
			System.out.println("Using replicate() from Poly2 and setting it "
					+"to Poly1. Poly1 is now:");
			Poly1 = Poly2.replicate();
			System.out.println(Poly1.toString());
			
			// using equals between Poly1 and Poly2, should be true
			System.out.println("Checking to see if replicated Poly1"
								+" equals creator Poly2.");
			System.out.println(Poly2.equals(Poly1));
			
			// using getCoefficient() on viable term
			System.out.println("Using getCoefficient() to see what coefficient"
					+" has the power of -7, should be 6.");
			System.out.println(Poly2.getCoefficient(-7));
			
			// using getCoefficient() on non-existing term
			System.out.println("Using getCoefficient() to see what coefficient"
					+" has the power of 3, which is none, should return 0.");
			System.out.println(Poly2.getCoefficient(3));
			
			// checking whether brand new Poly3 equals Poly2
			System.out.println("Creating a  new Polynomial Poly3. Does it equal"
					+" Poly2?");
			Polynomial Poly3 = new Polynomial();
			System.out.println(Poly3.equals(Poly1));
			
			// using getCoefficient() on empty Poly3
			System.out.println("Using getCoefficient() to see what coefficient"
					+" has the power of -7 of Poly3, which is empty.");
			System.out.println(Poly3.getCoefficient(-7));
			
			// adding term to Poly2
			System.out.println("Adding term 3x^-2 to the Polynomial2.");
			Poly2.addTerm(3, -2);
			System.out.println(Poly2.toString());	
			
			// adding Poly1 and Poly2 and giving it to Poly3
			// One term should remain the same, and the rest should double
			System.out.println("Adding Poly1 and Poly2 and setting it to Poly3.");
			Poly3 = Poly2.add(Poly1);
			System.out.println(Poly3.toString());
			
			// adding Poly3 and Poly1 and giving it to Poly2
			// one term should still remain the same, rest should change
			System.out.println("Adding Poly3 and Poly1 and setting it to Poly2.");
			Poly2 = Poly3.add(Poly1);
			System.out.println(Poly2.toString());
			
			// negate() from Poly2 and giving it to Poly1
			System.out.println("Using negate() from Poly2 and setting it "
					+"to Poly1. Poly1 is now:");
			Poly1 = Poly2.negate();
			System.out.println(Poly1.toString());
			
			// adding inverse Polys, should create a zero Poly3
			System.out.println("Adding Poly1 and Poly2 and setting it to Poly3.");
			Poly3 = Poly2.add(Poly1);
			System.out.println(Poly3.toString());
			
			// adding a term to Poly3
			System.out.println("Adding term x^2 to the Polynomial3.");
			Poly3.addTerm(1, 2);
			System.out.println(Poly3.toString());	
			
			// making that term a 0 term and performing a multiple of tests
			// on it without calling toString()
			System.out.println("Adding term -x^2 to the Polynomial3 resulting"
					+" in a zero term.");
			Poly3.addTerm(-1, 2);
			System.out.println("Poly3 is holding "+Poly3.holding()+" terms" +
					" and should be holding 0.");
			System.out.println("Multiplying the zero Poly3 by 1");
			Poly3.scalarMultiply(1);
			System.out.println("Using getCoefficient(1) on the zero Poly3.");
			System.out.println(Poly3.getCoefficient(1));
			System.out.println(Poly3.toString());
			System.out.println("Poly3 still should be empty throughout this.");
			System.out.println(Poly3.isEmpty());
			
			// creating Poly4 and Poly5
			Polynomial Poly4 = new Polynomial();
			Polynomial Poly5 = new Polynomial();
			
			// adding the same terms in different orders to both Polys
			Poly4.addTerm(1,2);
			Poly4.addTerm(2, 1);
			Poly5.addTerm(2,1);
			Poly5.addTerm(1, 2);
			System.out.println("New Poly4 and Poly5 should be equal after " +
					"adding the same terms but in a different order.");
			System.out.println(Poly4.equals(Poly5));
			
		}	// end of main
	} //end of Prog7


