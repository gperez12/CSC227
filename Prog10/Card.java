/*+----------------------------------------------------------------------
 ||
 ||  Class Card.java
 ||
 ||         Author:  Gabriel Perez
 ||
 ||        Purpose:  This class has been created to support the Node and
 ||				     Deck Class. This class will  
 ||
 ||  Inherits From:  None.
 ||
 ||     Interfaces:  Comparable
 ||
 |+-----------------------------------------------------------------------
 ||
 ||      Constants:  None.
 ||
 |+-----------------------------------------------------------------------
 ||
 ||   Constructors:  Card (int, String)
 ||
 ||  Class Methods:  None.
 ||
 ||  Inst. Methods:  int getRank()
 ||					 String getSuit()
 ||					 String toString()
 ||					 int compareTo()
 ||
 ++-----------------------------------------------------------------------*/
public class Card implements Comparable {
	private int rank; 
	private String suit;
	 /*---------------------------------------------------------------------------
    |  Method Card (int, String)
    |
    |  Purpose:  This Constructor will initize the rank and suit values from the 
    |			 parameters. 
    |
    |  Pre-condition:  Must pass rank and suit.
    |
    |  Post-condition: A reference to a Card object will be created with the 
    |				   data field contain the rank and suit values.
    |
    |  Parameters: int value -- Rank value of the card. 
    |			   String face -- Suit of card.
    |
    |  Returns:  A reference to the new Card object. 
    *----------------------------------------------------------------------------*/
	public Card(int value, String face){
		//set rank equal to value
		this.rank = value; 
		//remove spaces before string
		face = face.trim();
		//set suit equal to face
		this.suit = face; 
	}
	 /*---------------------------------------------------------------------------
    |  Method int getRank()
    |		  String getSuit()
    |
    |  Purpose:  These getters will allow the user to retrieve the values stored
    |			 within rank and suit. 
    |
    |  Pre-condition:  Must create a Card object.
    |
    |  Post-condition: Returns rank or suit.
    |
    |  Parameters: None.
    |
    |  Returns:  Returns rank or suit. 
    *----------------------------------------------------------------------------*/
	public int getRank(){
		//return rank
		return rank;
	}
	
	public String getSuit(){
		//return suit
		return suit;
	}
	 /*---------------------------------------------------------------------------
    |  Method int compareTo(Object temp)
    |
    |  Purpose:  This method is from the Comparable interface and is used to compare
    |			 two Card objects. If the two Cards are the same the user will see
    |			 a one returned. If the two Cards objects are not the same the user 
    |			 will see zero returned.  
    |
    |  Pre-condition:  Must create a Card object.
    |
    |  Post-condition: Returns one if objects are equal and zero if they are not equal.
    |
    |  Parameters: Object temp -- Card object the user is comparing.
    |
    |  Returns:  Returns one if objects are equal and zero if they are not equal. 
    *----------------------------------------------------------------------------*/
	public int compareTo(Object temp) {
		//set value to zero
		int value = 0; 
		//if Ranks match, check suits
		if(this.getRank() == ((Card) temp).getRank()){
			//if suits match, Cards equal each other value = 1
			if(this.getSuit() == ((Card) temp).getSuit()){
				value =  1;
			}
		}
		//Cards do not match value = 0 
		else value = 0;
		//return value
		return value;
	}
	/*---------------------------------------------------------------------------
    |  Method String toString()
    |
    |  Purpose:  This method will check both rank and suit of the card object and
    |			 will create a string with value such as (AH) for 1 of hearts. 
    |
    |  Pre-condition:  Must create a Card object.
    |
    |  Post-condition: Returns string based on suit and rank.
    |
    |  Parameters: None.
    |
    |  Returns:  Returns string based on suit and rank. 
    *----------------------------------------------------------------------------*/
	public String toString(){
		//create string
		String output = "(";
		//if rank is between values 2-10 add value
		if(rank >= 2 && rank <=10){
			output+= rank;
		}
		//if rank equals one add "A"
	else if(rank == 1){
			output+="A";
		}
		//if rank equals 11 add "J"
	else if(rank == 11){
			output+="J";
		}
		//if rank equals 12 add "Q"
	else if(rank == 12){
			output+="Q";
		}
		//if rank equals 13 add "K"
	else if(rank == 13){
			output+="K";
		}
	//if suit equals hearts add "H"
	if(suit.equals("hearts")){
		output+="H";
	}
	//if suit equals spades add "S"
	else if(suit.equals("spades")){
		output+="S";
	}
	//if suit equals clubs add "C"
	else if(suit.equals("clubs")){
		output+="C";
	}
	//if suit equals diamonds add "D"
	else if(suit.equals("diamonds")){
		output+="D";
	}
	//close string with ")"
	output+=")";
	//return String
	return output;	
	}
	
	
}
