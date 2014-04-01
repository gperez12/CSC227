
public class Prog7 {
	
	public static void main (String [] args)
	{
					// creating Poly1
					System.out.println("Creating a Polynomial, Poly1.\n");
					Polynomial Poly1 = new Polynomial();
					
					// adding a term to Poly1
					System.out.println("Adding term 2x^2 to the Polynomial");
					Poly1.addTerm(2, 2);
					System.out.println(Poly1.toString());
					
					// adding another term to Poly1
					System.out.println("\nAdding term 3x^2 to the Polynomial");
					Poly1.addTerm(3, 2);
					System.out.println(Poly1.toString());
					
					// adding a negative term to Poly1
					System.out.println("\nAdding term 4x^2 to the Polynomial");
					Poly1.addTerm(4, 2);
					System.out.println(Poly1.toString());
					
					// is empty?
					System.out.println("\nTesting isEmpty, Should return False");
					System.out.println(Poly1.isEmpty());
					
					System.out.println("\nTesting isFull, Should return True");
					System.out.println(Poly1.isFull());
					
					System.out.println("\nTesting evaluate, Should return 36.0:");
					System.out.println(Poly1.evaluate(2));
					
					System.out.println("\nTesting scalarmultiply, Should Print 4x^2 + 6x^2 + 8x^2");
					Poly1.scalarMultiply(2);
					System.out.println(Poly1.toString());
		
		
	}

}
