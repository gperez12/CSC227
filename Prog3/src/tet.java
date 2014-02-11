import java.util.*;
public class tet {
	
	public static void main(String[]args)
	{
		String word = "ca/ves";
		int temp = word.length() -1; 
		System.out.println(temp); 
		StringBuilder newWord = new StringBuilder(word);
		
		for(int i =0; i<word.length(); i++)
		{
			System.out.println (word.charAt(i));
			if(word.charAt(i) == '/' && i != 0)
			{
				if (word.charAt(i-1) == 'o')
				{
					newWord.replace(i-1, i, "oh");
					word = newWord.toString();
					System.out.println(word);
				}
				if(word.charAt(i-1) == 'i')
				{
					newWord.replace(i-1, i, "ee");
					word = newWord.toString(); 
					System.out.println(word);
				}
				if(word.charAt(i-1) == 'a')
				{
					newWord.replace(i-1, i, "ay");
					word = newWord.toString();
					System.out.println(word);
				}
				if(word.charAt(i-1) == 'e' && word.charAt(i-2) == 'c')
				{
					newWord.replace(i-2, i-1, "ss");
					word = newWord.toString();
					System.out.println(word);
				}
				if(word.charAt(i-1) == 's' && word.charAt(i-2) == 'e')
				{
					newWord.replace(i-2, i-1, "ez");
					word = newWord.toString();
					System.out.println(word);
				}
				if(word.charAt(i-1) == 'y' && word.charAt(i-2) == 'v')
				{
					newWord.replace(i-2, i-1, "vee");
					word = newWord.toString();
					System.out.println(word);
				}
						
			}
			
			if(i !=0 && word.charAt(word.length()-1) == 'o' || word.charAt(word.length() -1) == 'i' || word.charAt(word.length()) == 'a' || word.charAt(word.length() -1) == 'e' || word.charAt(word.length() -1) == 's' || word.charAt(word.length()-1) == 'y');
			{
				if (word.charAt(i-1) == 'o')
				{
					newWord.replace(i-1, i, "oh");
					word = newWord.toString();
					System.out.println(word);
				}
				if(word.charAt(i-1) == 'i')
				{
					newWord.replace(i-1, i, "ee");
					word = newWord.toString(); 
					System.out.println(word);
				}
				if(word.charAt(i-1) == 'a')
				{
					newWord.replace(i-1, i, "ay");
					word = newWord.toString();
					System.out.println(word);
				}
				if(word.charAt(i-1) == 'e' && word.charAt(i-2) == 'c')
				{
					newWord.replace(i-2, i-1, "ss");
					word = newWord.toString();
					System.out.println(word);
				}
				if(word.charAt(i-1) == 's' && word.charAt(i-2) == 'e')
				{
					newWord.replace(i-2, i-1, "ez");
					word = newWord.toString();
					System.out.println(word);
				}
				if(word.charAt(i-1) == 'y' && word.charAt(i-2) == 'v')
				{
					newWord.replace(i-2, i-1, "vee");
					word = newWord.toString();
					System.out.println(word);
				}
			}
			if(word.charAt(i) == 'c')
			{
				if(word.charAt(i+1) == 'a')
				{
					newWord.replace(i, i+2, "ka");
					word = newWord.toString();
					System.out.println(word);
				}
				
			}
		}
		word = newWord.toString();
		System.out.println(word);
	}
}