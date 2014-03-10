/*====================================================================================
 |	Assignment:	Program #6: Word Count
 |	    Author:	Gabriel Perez
 |Sect. Leader:	Patrick Hickey
 |
 |	    Course:	CSc 227
 |	Instructor:	L. McCann
 |	  Due Date:	March 11, 2014, by 9:00 p.m. MST
 |
 | Description:	This program will calculate the lines, bytes, and words from an input file. 
 |              The user will be able to place the input file name with two options: in
 |				the command line and within the program through the keyboard. 
 |				Command Line example: java Prog6 <filename> <filename> ...
 |				Program example: <filename,filename>
 | 
 |Deficiencies:	None known; this program meets specifications.
*==========================================================================================*/
import java.io.*;		//import Java I/O library 
import java.util.*;		//import Java Scanner Class

public class Prog6 {

	public static void main(String[] args) {
		
		String userInput,	//string variable for user inputs			
			   aLine,		//string variable to store lines from files
			   fileName[] = null;	//string array to hold filename/s
		
		Scanner keyboard = new Scanner (System.in),	//scanner object for user input
				inFile = null; 						//scanner object to read from file
		
		File aFile;		//file variable to create a file object
		
		int lineCount =0,	//variable to keep line count
			letterCount =0,	//variable to keep byte count
			wordCount =0,	//variable to keep word count
			totalLineCount =0,	//variable to keep total line count
			totalLetterCount =0,//variable to keep total byte count
			totalWordCount =0,	//variable to keep total word count
			catchFlag = 1;		//flag to make sure header is only printed once
		
		//print summary of program
		System.out.println("\nThis program determines the quantity of "+
				   		   "lines, words, and bytes\nin a file or files "+
				           "that you specify\n");
		//checking for command line arguments
		if(args.length > 0)
		{
			//if command line arguments have spaces between file names
			if (args.length >= 2)
			{
				//creating file name array with length of argument array
				fileName = new String [args.length];
				//for loop to transfer data from args array to filename array
				for(int i =0; i<args.length; i++)
				{
					fileName[i] = args[i];
					//remove whitespace before and after string
					fileName[i].trim();
				}
			}
			//if command line arguments have commas between filenames
			else 
			{
				//store arguments within a string
				String temp = args[0];
				//split based on commas
				fileName = temp.split(",");
				//remove whitespace from before and after string
				for(int i =0; i<fileName.length;i++)
				{
					fileName[i].trim();
				}
			}
		}
		//if no command arguments ask for user input for file names
		else 
		{
			//display instructions for user input
		   System.out.print("Please enter one or more files names, "+
				   			  "comma-separated: ");
		   //scan for user input from keyboard
		   userInput = keyboard.nextLine(); 
		   //split string based on commas
		   fileName = userInput.split(",");
		   for(int i =0; i<fileName.length;i++)
			{
				fileName[i].trim();
				System.out.println(fileName[i]);
			}
		   System.out.println(); 
		}
		
		//for loop to calculate count for every file inputed
		for(int i =0; i<fileName.length; i++)
		{
			//Initialized counters to zero for every file 
			letterCount =0; 
			wordCount =0; 
			lineCount =0; 
			
			//creating a file object with filename
			aFile = new File(fileName[i]);
			
			//try and catch block for opening and reading file
			try {
				inFile = new Scanner(aFile);
			} catch (IOException e) {
				
				//flag set so if there is an error the header will not print
				catchFlag =0; 
				System.out.println(); 
				//Explaining the error message that will follow
				System.out.println("I/O ERROR: The following description "+
							   	   "below will describe what the error is: ");
				//prints the class and method name
				System.out.println("The Error: " + e.getClass().getName());
				//stores java error message
				String mesg = e.getMessage();
				//prints java error message
				System.out.println("The Message: " + mesg);
				//prints stack trace
				System.out.println("The stack trace:");
				e.printStackTrace();
				System.out.println(); 
			}
			
			//if no errors and is first file print header
			if (catchFlag == 1)
			{
				System.out.printf("%7s%10s%9s\n","Lines","Words","Bytes");
				System.out.printf("%7s%10s%9s\n","-------","-------", "-------");
				//set flag so header will not print more than once
				catchFlag = 2; 
			}
			// while there is a next line in the file count the bytes and lines
			while (inFile.hasNextLine()){
				aLine = inFile.nextLine();
				//counts the number of bytes within the file
				letterCount = (int) aFile.length();
				//counts the number of lines within the file
				lineCount++;
			}
			//adds the amount of lines total between all the files 
			totalLineCount = lineCount + totalLineCount; 
			//adds the bytes within all the files 
			totalLetterCount = letterCount + totalLetterCount;
			//closes the file
			inFile.close();
		
			//try and catch block to reopen the file for counting number of words
			try {
				inFile = new Scanner(aFile);
			} catch (IOException e) {
			
				System.out.println(); 
				//Explaining the error message that will follow
				System.out.println("I/O ERROR: The following description "+
							   	   "below will describe what the error is: ");
				//prints the class and method name
				System.out.println("The Error: " + e.getClass().getName());
				//stores java error message
				String mesg = e.getMessage();
				//prints java error message
				System.out.println("The Message: " + mesg);
				//prints stack trace
				System.out.println("The stack trace:");
				e.printStackTrace();
				System.out.println(); 
			}
			
			//while file has data count the number 
			while(inFile.hasNext())
			{
				//store data within a string 
				String data = inFile.next();
				//count words within file
				wordCount++;
			}
			//add the total number of word count within files
			totalWordCount = wordCount + totalWordCount; 
		
		
		
		//format data and print to console
		System.out.printf("%7d",lineCount); 
		System.out.printf("%10d",wordCount);
		System.out.printf("%9d",letterCount);
		System.out.printf("%12s", fileName[i]); 
		System.out.println(); 
		//close file
		inFile.close();
		}
		//if more than one file then print total amount footer
		if (fileName.length > 1)
		{	
			System.out.println("---------------------------------------"); 
			System.out.printf("%7d",totalLineCount);
			System.out.printf("%10d",totalWordCount);
			System.out.printf("%9d", totalLetterCount);
			System.out.printf("%7s\n", "Total");
			System.out.println();
		}
		else 
			System.out.println();
		
		
		

	} //main

}// Prog6
