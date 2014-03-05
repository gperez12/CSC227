
public class testFile {
	
	public static void main(String [] args)
	{
		byte [][] testing = {{0,1,2},{7,4,3},{7,5,6}}; 
		Demon hello = new Demon (3,3,8);
		
		hello.setUniverse(testing);
		System.out.println("This is original:");
		//hello.print();
		System.out.println(); 
		
		testing = hello.getUniverse();
		
		for (int count =1; count < 250; count++)
		{
			System.out.println("This is iteration: " + count);
			hello.advance(); 
			//hello.print();
		}
		
		
	}

}
