/*+----------------------------------------------------------------------
 ||  Class WordHelper
 ||
 ||         Author:  Gabriel Perez
 ||
 ||        Purpose:  This is the WordHelper class from Prog3.java.The
 ||					 WordHelper class contains getters and setters while 
 ||					 also providing a lot more functions. The WordHelper 
 ||					 count the number of syllables, re-structure a string 
 ||                  to display the different syllables using the "VCV" and 
 ||					 "VCCV" methods. This class also will display the phonetic
 ||					 syllables.
 ||
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
 ||   Constructors:  WordHelper(String)
 ||
 ||  Class Methods:  None.
 ||
 ||  Inst. Methods: String word
 ||					String str
 || 				int    vowelCount
 ||					int    vowelFlag
 ||					int	   lastLetterPosition
 ||
 ++-----------------------------------------------------------------------*/

import java.util.*;

class WordHelper {
	
				/* Instance Variables, a.k.a. Data Members */
	String word, 					// String passed from main
		   str;						// String copy from word
	
	int    vowelCount =0, 			// Counts the number of vowels within string
		   vowelFlag =0, 			// Code for how many syllables are within string
		   lastLetterPosition =0;	// The index for the last character within string 
	
	/*---------------------------------------------------------------------
    |  Method WordHelper (constructor)
    |
    |  Purpose:        This constructor takes the given string and makes a copy 
    | 			       in the string word. After this is completed it will remove
    |			       all non-character values and put all lowercase characters 
    |			       into one string. 
    |
    |  Pre-condition:  None.
    |
    |  Post-condition: String is created with only characters and all 
    |				   character will be lowercase.
    |
    |  Parameters:     WordHelper(String) takes a string as argument.
    |
    |  Returns:  	   A new WordHelper object.
    *-------------------------------------------------------------------*/
	
	public WordHelper(String str) {
		word = str;
		word = word.replace("-", "");
		word = word.toLowerCase();
	}
	
	 /*---------------------------------------------------------------------
    |  Methods:        getWord(), setWord(String)
    |
    |  Purpose:        Permits the user to change the string to allow for evaluation
    |      	           by the program
    |
    |  Pre-condition:  None.
    |
    |  Post-condition: Getter will return a string which will be unchanged. 
    |				   The Setter will allow the string to be changed by 
    |                  the user for different evaluations.
    |
    |  Parameters:     None for getters; Need to pass in a string to use 
    |				   setWord. 
    |
    |  Returns:        getWord will return the given string, setWord will 
    |				   not return anything. 
    |
    *-------------------------------------------------------------------*/
	public String getWord() {
		
		return word;
	}
	
	public void setWord (String str)
	{
		word = str; 
	}
	 /*---------------------------------------------------------------------
    |  Method numberOfSyllables()
    |
    |  Purpose:  	   Returns the number of vowels found within the string.
    |		           The number of vowel will then go under different types
    |			       of conditions such as if there are two vowels together 
    |                  the program will subtract one from the total amount. 
    |                  Another rule is, if 'e' is at the end of the string 
    |                  the program will subtract one again from the total.
    |
    |  Pre-condition:  none.
    |
    |  Post-condition: Based on the different situations described above
    |				   this method will return the number of vowels within 
    | 				   the given string. 
    |
    |  Parameters:     None.
    |
    |  Returns:        The number of syllables contain within the string.
    *-------------------------------------------------------------------*/
	public int numberOfSyllables(){
		vowelCount = 0; 
		for (int i =0; i<word.length()-1; i++)
		{
			if (word.charAt(i) == 'a')
					vowelCount++;
			else if (word.charAt(i) == 'e')
					vowelCount++;
			else if (word.charAt(i) == 'i')
					vowelCount++;
			else if (word.charAt(i) == 'o')
					vowelCount++; 
			else if (word.charAt(i) == 'u')
					vowelCount++; 
			else if (word.charAt(i) == 'y')
					vowelCount++; 
		}
			if (word.charAt(word.length()-1) == 'e')
					vowelCount--;
		
		if (vowelCount == 1 || vowelCount < 1)
			return 1; 
		else 
		return vowelCount;
	}
	 /*---------------------------------------------------------------------
    |  Method Syllablize()
    |
    |  Purpose:  	   This method will display the syllables within a string
    |			       by placing a '/'. This method is able to create this by 
    | 			       using both the "VCV" and "VCCV" rules. 
    |
    |  Pre-condition:  None.
    |
    |  Post-condition: A string is returned with a '/' within the string
    |    			   for each syllables.
    |
    |  Parameters: 	   None.
    |
    |  Returns:  	   A string containing '/' for each syllable.
    *-------------------------------------------------------------------*/
	public String syllablize()
		{
			for(int i=0; i<word.length()-2; i++)
			{
				vowelFlag =0; 
				if (word.charAt(i)=='a'|| word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o' || word.charAt(i)=='u'|| word.charAt(i)=='y')
				{
					
					if (word.charAt(i+1) !='a'|| word.charAt(i+1) !='e' || word.charAt(i+1) !='i' || word.charAt(i+1) !='o' || word.charAt(i+1) !='u' || word.charAt(i+1) !='y')
					{
						if(word.length() > 3)
						{
							if (word.charAt(i+2) =='a'|| word.charAt(i+2) =='e' || word.charAt(i+2) =='i' || word.charAt(i+2) =='o' || word.charAt(i+2) =='u' || word.charAt(i+2) =='y')
							vowelFlag = 1; 
							if (word.charAt(i+2) !='a'|| word.charAt(i+2) !='e' || word.charAt(i+2) !='i' || word.charAt(i+2) !='o' || word.charAt(i+2) !='u' || word.charAt(i+2) !='y')
							if (word.charAt(i+3) =='a'|| word.charAt(i+3) =='e' || word.charAt(i+3) =='i' || word.charAt(i+3) =='o' || word.charAt(i+3) =='u' || word.charAt(i+3) =='y')
								vowelFlag =2;
						}
						else 
							vowelFlag =3; 
					}
				}
				
				if (vowelFlag == 1)
					word = word.substring(0, i+1) + "/" + word.substring(i+1,word.length());
				if(vowelFlag ==2)
					word = word.substring(0, i+2) +"/" + word.substring(i+2, word.length());
				

		
			}
			return word;
		}
	 /*---------------------------------------------------------------------
    |  Method pronounce()
    |
    |  Purpose:        Calls the translateSyllable(String) method and returns 
    |                  a string containing the phonetic pronunciation. The
    |                  string which is containing '-' to help with pronouncing 
    |                  the word. 
    |
    |  Pre-condition:  None.
    |
    |  Post-condition: Returns string with the phonetic spelling. 
    |
    |  Parameters: 	   None.
    |
    |  Returns:  	   Strings with the phonetic spelling. 
    *-------------------------------------------------------------------*/
	public String pronounce()
	{
		StringBuilder newWord = new StringBuilder(word);
		
		for (int i =0; i<word.length(); i++)
		{
			if (word.charAt(i) == '/')
				newWord.setCharAt(i, '-');
		}
		word = newWord.toString();
		
		translateSyllable(word);
		return word;
	}
	 /*---------------------------------------------------------------------
    |  Method translateSyllable(String)
    |
    |  Purpose:        Using the rules provided by Dr. McCann, this method 
    |				   will modify the string to display the phonetic spelling
    |				   of the given string. This method is called from the 
    |				   pronounce() method. 
    |
    |  Pre-condition:  None.
    |
    |  Post-condition: Returns string with the phonetic spelling. 
    |
    |  Parameters: 	   None.
    |
    |  Returns:  	   Strings with the phonetic spelling. 
    *-------------------------------------------------------------------*/
	private String translateSyllable (String str)
	{ 	
		StringBuilder newWord = new StringBuilder(word);
		
		for(int i =0; i<word.length(); i++)
		{
			if(word.charAt(i) == '-')
			{
				if (word.charAt(i-1) == 'o')
				{
					newWord.replace(i-1, i, "oh");
					word = newWord.toString();
				}
				if(word.charAt(i-1) == 'i')
				{
					newWord.replace(i-1, i, "ee");
					word = newWord.toString(); 
				}
				if(word.charAt(i-1) == 'a')
				{
					newWord.replace(i-1, i, "ay");
					word = newWord.toString();
				}
				if(word.charAt(i-1) == 'e' && word.charAt(i-2) == 'c')
				{
					newWord.replace(i-2, i-1, "ss");
					word = newWord.toString();
				}
				if(word.charAt(i-1) == 's' && word.charAt(i-2) == 'e')
				{
					newWord.replace(i-2, i-1, "ez");
					word = newWord.toString();
				}
				if(word.charAt(i-1) == 'y' && word.charAt(i-2) == 'v')
				{
					newWord.replace(i-2, i-1, "vee");
					word = newWord.toString();
				}
						
			}
			
			if(word.charAt(i) == 'c')
			{
				if(word.charAt(i+1) == 'c')
				{
					newWord.replace(i, i+2, "k");
					word = newWord.toString();
				}
				
			}
			if(word.charAt(i) == 'c')
			{
				if(word.charAt(i+1) == 'a')
				{
					newWord.replace(i, i+2, "ka");
					word = newWord.toString();
				}
			}
			if(word.charAt(i) == 'c')
			{
				if(word.charAt(i+1) == 'o')
				{
					newWord.replace(i,  i+1, "ko"); 
					word = newWord.toString();
				}
			}
			if(word.charAt(i) == 'a')
			{
				if(word.charAt(i+1) == 'u')
				{
					newWord.replace(i, i+1, "aw");
					word = newWord.toString();
				}
			}
			/*if(word.charAt(i) == 'e')
			{
				if(word.charAt(i+1) == 'a')
				{
					newWord.replace(i, i+1,  "ee");
					word = newWord.toString();
				}
			}
			if(word.charAt(i) == 'q')
			{
				if(word.charAt(i+1) == 'u')
				{
					newWord.replace(i, i+1, "kw");
					word = newWord.toString();
				}
			}*/
		}
		word = newWord.toString();
		return word;
	}
		
}


