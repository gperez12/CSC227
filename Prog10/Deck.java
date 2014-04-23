import java.io.*;
import java.util.*;
/*====================================================================================
|	Assignment:	Program #9 : Deck.java
|	    Author:	Gabriel Perez
|Sect. Leader:	Patrick Hickey
|
|	    Course:	CSc 227
|	Instructor:	L. McCann
|	  Due Date:	April 22, 2014, by 9:00 p.m. MST
|
| Description:	This class is the main class that is being supported by the Node 
|				and Card class. This class creates Deck objects in a structure known 
|				as a linked list. The data of the nodes are created within the Card
|				class and the nodes are constructed by the Nodes class. 
|					
|Deficiencies:	None known; this program meets specifications.
*==========================================================================================*/
public class Deck {
	 
	Scanner stream;				//Scanner Object
	private String face; 		//face value
	private int value; 			//Rank value
	private Card temp; 			//Card object
	private Node head = null;	//head pointer
	private int occupancy = 0; 	//occupancy variable
	private String fileName;	//filename as string
	 /*---------------------------------------------------------------------------
    |  Method Deck (String)
    |
    |  Purpose:  This constructor will open and read the input of the given file
    |			 and create node and card objects and place them into a linked 
    |			 list structure (Deck Object). If the file is unreadable or the 
    |			 the program does not have access to the file it will quit the 
    |			 program with an exception and error code.  
    |
    |  Pre-condition:  Must pass a String containing file name. 
    |
    |  Post-condition: A reference to a Deck object will be created.
    |
    |  Parameters: String fileName -- Name of file to read from. 
    |
    |  Returns: None.
    *----------------------------------------------------------------------------*/
	public Deck(String fileName){
		try {
			//open file
			stream = new Scanner(new File(fileName));
		} catch (FileNotFoundException e) {
			//can't open file
			System.err.println("The file was not found!");
			e.printStackTrace();
			//exit with error code
			System.exit(1);
		}
		//while strings in file
		while(stream.hasNextLine()){
		//set value for Card
		value = stream.nextInt();
		//set face or suit for Card
		face = stream.nextLine();
		//set face toLowerCase
		face = face.toLowerCase();
		//create new card
		temp = new Card(value, face);
		//checking for valid data
		if(temp.getRank() >0 && temp.getRank() <14){
			if(temp.getSuit().equals("diamonds") || temp.getSuit().equals("clubs") || temp.getSuit().equals("hearts") || temp.getSuit().equals("spades")){
				//add to list
				add(temp);
			}
		}
	}
}
	 /*---------------------------------------------------------------------------
    |  Method add(Card obj)
    |
    |  Purpose:  This method will take a Card object and will generate a Node object
    |			 from the Card data and will add it to the linked list(Deck Object).   
    |
    |  Pre-condition:  Must pass a Card object.
    |
    |  Post-condition: Node is created with Card data and added to linked list
    |				   (Deck Object). 
    |
    |  Parameters: Card obj -- Card object reference.
    |
    |  Returns: None.
    *----------------------------------------------------------------------------*/
	private void add(Card obj){
		//create newNode
		Node newNode = new Node(obj);
		//set next to null
		newNode.setNext(null);
		//if list is empty
		if(this.head == null){
			head = newNode; 
		}
		else {
			//node to head
			Node temp = head; 
			//while not end of list
			while(temp.getNext() != null){
				//get next
				temp = temp.getNext(); 
			}
			//set newNode at end
			temp.setNext(newNode);
		}
		//add occupancy
		occupancy++; 
	}
	 /*---------------------------------------------------------------------------
    |  Method Deck (StringBuilder)
    |
    |  Purpose:  This constructor will open and read the input of the given file
    |			 and create node and card objects and place them into a linked 
    |			 list structure (Deck Object). If the file is unreadable or the 
    |			 the program does not have access to the file it will quit the 
    |			 program with an exception and error code.  
    |
    |  Pre-condition:  Must pass a StringBuilder containing file name. 
    |
    |  Post-condition: A reference to a Deck object will be created.
    |
    |  Parameters: StringBuilder fileName -- Name of file to read from. 
    |
    |  Returns: None.
    *----------------------------------------------------------------------------*/
	public Deck(StringBuilder fileName){
		//convert StringBuilder to String
		this.fileName = fileName.toString();
		try {
			//open file
			stream = new Scanner(new File(this.fileName));
		} catch (FileNotFoundException e) {
			//Can't open file
			System.err.println("The file was not found!");
			e.printStackTrace();
			//exit with error code
			System.exit(1);
		}
		//while next line read
		while(stream.hasNextLine()){
			//set value
			value = stream.nextInt();
			//set face or suit
			face = stream.nextLine();
			//set characters toLowerCase
			face = face.toLowerCase();
			//create Card object
			temp = new Card(value, face);
			//check if data is valid
			if(temp.getRank() >0 && temp.getRank() <14){
				if(temp.getSuit().equals("diamonds") || temp.getSuit().equals("clubs") || temp.getSuit().equals("hearts") || temp.getSuit().equals("spades")){
					//add to list
					add(temp);
				}
			}
		
		}
	}
	
	 /*---------------------------------------------------------------------------
    |  Method OutShuffle()
    |
    |  Purpose:  This method will create a new Deck object to split cards in half 
    |	         and with the use of helpshuffle will shuffle the cards.  
    |
    |  Pre-condition:  None. 
    |
    |  Post-condition: OutShuffle Cards within linked list. 
    |
    |  Parameters: None.
    |
    |  Returns: None.
    *----------------------------------------------------------------------------*/
	public void outShuffle(){
		//occupancy divided by 2
		int value = occupancy/2; 
		//copy of Deck object
		Deck deckTemp2 = new Deck(this.fileName);
		//call helpshuffle
		helpShuffle(deckTemp2, value);
		//set string to output
		String str = deckTemp2.toString();
		//print string to screen
		System.out.println(str);
		
	}
	 /*---------------------------------------------------------------------------
    |  Method helpShuffle(Deck, int)
    |
    |  Purpose:  This method supports both inShuffle and outShuffle by spliting the
    |			 deck in half. 
    |
    |  Pre-condition:  Deck object must be passed and value must be calculated. 
    |
    |  Post-condition: Splits linked list in half. 
    |
    |  Parameters: Deck input -- Deck object that contains entire list. 
    |			   int value -- occupancy / 2.
    |
    |  Returns: None.
    *----------------------------------------------------------------------------*/
	private void helpShuffle(Deck input, int value){
		//node with data from card
		Node newNode = new Node (this.temp);
		//set next to null
		newNode.setNext(null);
		//counting variable
		int i =0;
		//if empty 
		if(head == null){
			head = newNode;
		}else {
			//temp is equal to null
			Node temp = head; 
			//while value is not occupancy/2 and not at the end of list
			while(i!= value && temp.getNext() != null){
				//get next value
				temp = temp.getNext();
			}
			//set temp to newNode
			temp.setNext(newNode);
		}
		
	}
	 /*---------------------------------------------------------------------------
    |  Method inShuffle()
    |
    |  Purpose:  This method will create a new Deck object to split cards in half 
    |	         and with the use of helpshuffle will shuffle the cards.  
    |
    |  Pre-condition:  None. 
    |
    |  Post-condition: OutShuffle Cards within linked list. 
    |
    |  Parameters: None.
    |
    |  Returns: None.
    *----------------------------------------------------------------------------*/
	public void inShuffle(){
		//occupancy divided by 2
		int value = occupancy/2; 
		//copy of Deck object
		Deck deckTemp2 = new Deck(this.fileName);
		//call helpshuffle
		helpShuffle(deckTemp2, value);
		//set string to output
		String str = deckTemp2.toString();
		//print string to screen
		System.out.println(str);
	}
	 /*---------------------------------------------------------------------------
    |  Method isEmpty()
    |
    |  Purpose:  This method checks to see if the current Deck object is empty.
    |
    |  Pre-condition:  None. 
    |
    |  Post-condition: None. 
    |
    |  Parameters: None.
    |
    |  Returns: Return boolean value based on if the Deck object is empty or not. 
    *----------------------------------------------------------------------------*/
	private boolean isEmpty(){
		//if head is holding null, Deck is empty
		return (head == null);
	}
	 /*---------------------------------------------------------------------------
    |  Method toString()
    |
    |  Purpose:  This method will assign letters to the values within the linked list
    |			 (Deck object), such as 3 Hearts becomes 3H.
    |
    |  Pre-condition:  None. 
    |
    |  Post-condition: Returns string containing value of cards. 
    |
    |  Parameters: None.
    |
    |  Returns: Returns string containing value of cards. 
    *----------------------------------------------------------------------------*/
	public String toString(){
		//if Deck is empty return empty string
		if(this.isEmpty())return "()";
		//set node to head
		Node temp = head; 
		//create string
		String str = "(";
		//create card object
		Card cardTemp; 
		//create rank to hold card's rank value
		int rank; 
		//create suit to hold card's suit value
		String suit; 
		//while not at end of list
		while(temp!=null){
			//get Card data
			cardTemp = temp.getData();
			//get rank from Card
			rank = cardTemp.getRank();
			//get suit from Card
			suit = cardTemp.getSuit();
			//call StringMaker
			str = stringMaker(rank, suit, str);
			//go to next Card
			temp = temp.getNext();
		}
		//close string
		str+=")";
		//return string
		return str; 
	}
	 /*---------------------------------------------------------------------------
    |  Method stringMaker(int, String, String)
    |
    |  Purpose:  This method supports toString and will check to make sure
    |		     values are correct and not invalid. 
    |
    |  Pre-condition:  Card object must be created. 
    |
    |  Post-condition: Returns String with valid data.
    |
    |  Parameters: int rank -- rank value from card.
    |			   String suit -- suit value from card. 
    |			   String output -- String returned with valid values.
    |
    |  Returns: Returns String with valid data.
    *----------------------------------------------------------------------------*/
	private String stringMaker(int rank, String suit, String output){
		//if rank is valid add to string
		if(rank >= 2 && rank <=10){
				output+= rank;
			}
		//if rank is 1 add "A"
		else if(rank == 1){
				output+="A";
			}
		//if rank is 11 add "J"
		else if(rank == 11){
				output+="J";
			}
		//if rank is 12 add "Q"
		else if(rank == 12){
				output+="Q";
			}
		//if rank is 13 add "K"
		else if(rank == 13){
				output+="K";
			}
		//if suit is "hearts" add "H"
		if(suit.equals("hearts")){
			output+="H";
		}
		//if suit is "spades" add "S"
		else if(suit.equals("spades")){
			output+="S";
		}
		//if suit is "clubs" add "C"
		else if(suit.equals("clubs")){
			output+="C";
		}
		//if suit is diamonds add "D"
		else if(suit.equals("diamonds")){
			output+="D";
		}
		//add space
		output+=" ";
		//return string
		return output;
	}
}
