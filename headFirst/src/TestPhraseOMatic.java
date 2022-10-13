import java.util.*;
public class TestPhraseOMatic
{
	public static void main(String... args)
	{
		PhraseOMatic obj = new PhraseOMatic();
		System.out.println("worldList1 length is "+obj.wordList1.length);
		System.out.println("worldList2 length is "+obj.wordList2.length);
		
		// Method 1 : How to generate random number  
		int i = (int) (Math.random() * 5) ;

		System.out.println("The random value generated is "+i); 

		// Method 2 : How to generate random number 
		Random rand = new Random();
		
		double randomNum = rand.nextDouble();

		System.out.println("The random value generated is "+randomNum); 
			
	}
}
class PhraseOMatic
{
	String[] wordList1 = 
	{
		"good",
		"simple",
		"talented",
		"sharp",
		"beautiful",
		"caring",
		"independent"
	} ;
	String[] wordList2 = 
	{
		"innocent",
		"fun loving",
		"intelligent",
		"gullible",
		"beguiling",
		"resourceful"
	} ;

}
