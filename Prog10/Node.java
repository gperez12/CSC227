/*+----------------------------------------------------------------------
 ||
 ||  Class Node.java
 ||
 ||         Author:  Gabriel Perez
 ||
 ||        Purpose:  This class has been created to support the Card and 
 ||					 Deck class. The Node class creates Node object that 
 ||					 contain information from Card objects and place the 
 ||					 objects within the Deck class (LinkedList).  
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
 ||   Constructors:  Node (Card temp)
 ||
 ||  Class Methods:  String toString(int,String)
 ||
 ||  Inst. Methods:  Card getData()
 ||					 Node getNext()
 ||					 void setData(Card)
 ||					 void setNext(Node)
 ||
 ++-----------------------------------------------------------------------*/
public class Node {

	private int rank, tempValue;
	private String suit; 
	private String data; 
	private Node next;
	private StringBuilder temp; 
	private String [] str; 
	
	 /*---------------------------------------------------------------------------
    |  Method Node(Card)
    |
    |  Purpose:  This constructor will create a Node object. This constructor will 
    |			 assign rank and suit from the Card object and use it to call 
    |			 toString() method to create one string, which will be the value of
    |			 Node's data field.
    |
    |  Pre-condition:  Must create a Card object.
    |
    |  Post-condition: A reference to a Node object will be created with the 
    |				   data field contain the rank and suit values from a Card 
    |				   object. The next field will be set to null. 
    |
    |  Parameters: Card temp -- Card object containing rank and suit value. 
    |
    |  Returns:  A reference to the new Node object. 
    *----------------------------------------------------------------------------*/
	public Node (Card temp){
		//set rank from Card object
		this.rank = temp.getRank();
		//set suit from Card object
		this.suit = temp.getSuit();
		//setting data to String value containing rank and suit
		data = this.toString(rank,suit);
		//set next field to null
		next = null; 
	}
	/*---------------------------------------------------------------------------
    |  Method Card getData()
    |		  Node getNext()
    |		  void setData(Card)
    |		  void setNext(Node)
    |
    |  Purpose:  These methods are the setters and getters for the Node class. The
    |			 getters will return the values of Data and Next. The setters will 
    |			 set the Data and next fields. 
    |
    |  Pre-condition:  Getters -- Must have Node object created. 
    |				   Setters -- Must have Node and Card objects created.
    |
    |  Post-condition: Getters -- None
    |				   Setters -- will set Data based on Card information and 
    |							  set Next based on Node information.  
    |
    |  Parameters: Card temp -- Card object containing rank and suit.
    |			   Node next -- Node next reference. 
    |
    |  Returns:  Getters -- return Data and next values.
    |			 Setters -- None. 
    *----------------------------------------------------------------------------*/
	public Card getData(){
		//split string before and after space
		str = data.split(" ");
		//set rank to integer from split
		rank = Integer.parseInt(str[0]);
		//find space
		tempValue = temp.indexOf(" ");
		//create suit from string value
		suit = temp.substring(tempValue);
		//remove any space
		suit = suit.trim();
		//create Card copy
		Card copy = new Card(rank,suit);
		//return copy
		return copy; 
	}
	
	public Node getNext(){
		//return next 
		 return next; 
	}
	
	public void setData(Card temp){
		//set suit from Card object
		this.suit = temp.getSuit();
		//set rank from Card object
		this.rank = temp.getRank();
		//create string with rank and suit and store in data
		this.data = toString(rank, suit);
	}
	
	public void setNext(Node next){
		//set next to new next
		this.next = next; 
	}
	 /*---------------------------------------------------------------------------
    |  Method String toString(int,String)
    |
    |  Purpose:  This method takes an input of rank and suit and will generate 
    |			 a string with both values to store in the data field of a node. 
    |
    |  Pre-condition:  None. 
    |
    |  Post-condition: Creates a String and assigns it to the data field of the 
    |				   Node object. 
    |
    |  Parameters: int rank -- rank from a Card object.
    |			   String suit -- suit from a Card object. 
    |
    |  Returns:  data containing a string with rank and suit. 
    *----------------------------------------------------------------------------*/
	private String toString(int rank, String suit){
		//StringBuilder object
		temp = new StringBuilder();
		//adding rank to StringBuilder object
		temp.append(rank);
		//adding space to StringBuilder object
		temp.append(" ");
		//adding suit to StringBuilder object
		temp.append(suit); 
		//assign data to String
		this. data = temp.toString();
		//return data
		return data; 
	}
	
	
}
