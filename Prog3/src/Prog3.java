
public class Prog3 {

	/*===========================================================================================
	 |	  Assignment:		Program #3: The WordHelper Class
	 |	      Author:		Gabriel Perez
	 |  Sect. Leader:	    Patrick Hickey
	 |
	 |	      Course:	    CSc 227
	 |	  Instructor:	    L. McCann
	 |	    Due Date:	    February 11, 2014, by 9:00 p.m. MST
	 |
	 |	 Description:	    This main will use the WordHelper class to create 
	 |						different displays such as syllables, the number of 
	 |						vowels, and the phonetic convention for each string.
	 |						This test template is based off of WordHelperClientCode.java
	 |                      which was created by Alexander "Apollon" Jerabek.
	 |
	 |  Deficiencies:	    Missing two conventions in the WordHelper class. Otherwise,
	 |                      this program meets specifications. 
	*=============================================================================================*/

	        public static void main(String [] args)
	        {
	                        /* instantiating new WordHelper object with the
	                         * String "car"
	                         * This will test for a string with one syllable.
	                         */

	                //Testing constructor
	                System.out.println("Creating new WordHelper with String " +
	                                   "Car");
	                WordHelper x = new WordHelper("Car");


	                        /*testing syllable/pronouncation methods*/

	                //Testing getWord()
	                System.out.println("getWord() should return: car" +
	                                   "\ngot: " + x.getWord());
	                
	              //Testing numberOfSyllables()
	                System.out.println("numberOfSyllables() should return 1" +
	                                   "\ngot: " + x.numberOfSyllables());

	              //Testing syllablize()
	               System.out.println("syllablize() should return: kar" +
	                                   "\ngot: " + x.syllablize());
	               
	             //Testing pronounce()
	               System.out.println("pronounce() should return:  car" +
	                                   "\ngot: " + x.pronounce());
	               
	               System.out.println();
	             
	               //Testing setWord()
	               System.out.println("Setting word to together");
	                x.setWord("together");
	                System.out.println("getWord() should return: together" +
	                                   "\ngot: " + x.getWord());

	                
	              //Testing numberOfSyllables()
	                System.out.println("numberOfSyllables() should return 3" +
	                                   "\ngot: " + x.numberOfSyllables());

	              //Testing syllablize()
	               System.out.println("syllablize() should return: to/get/her" +
	                                   "\ngot: " + x.syllablize());
	               
	             //Testing pronounce()
	               System.out.println("pronounce() should return:  toh-get-her" +
	                                   "\ngot: " + x.pronounce());
	               
	               System.out.println();
	               
 				  //Testing setWord()
	               System.out.println("Setting word to passed");
	                x.setWord("passed");
	                System.out.println("getWord() should return: passed" +
	                                   "\ngot: " + x.getWord());

	                
	              //Testing numberOfSyllables()
	                System.out.println("numberOfSyllables() should return 2" +
	                                   "\ngot: " + x.numberOfSyllables());

	              //Testing syllablize()
	               System.out.println("syllablize() should return: pas/sed" +
	                                   "\ngot: " + x.syllablize());
	               
	             //Testing pronounce()
	               System.out.println("pronounce() should return:  pas-sed" +
	                                   "\ngot: " + x.pronounce());
	               
	             
	        } //end main

	} //end WordHelperClientCode
