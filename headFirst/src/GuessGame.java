import java.util.*;
public class GuessGame
{
	Player p1;
	Player p2;
	Player p3;

	boolean gotWinner=false;

	public void startGame()
	{
		p1=new Player("one");
		p2=new Player("two");
		p3=new Player("three");
		int lowerLimit=0;
		int upperLimit = 1000;
		int numToGuess = getRandomNumber(upperLimit);
		System.out.println("The number to be guessed is "+numToGuess);
		int iter = 1;
		Player winner = null;
		while(!gotWinner)
		{
			System.out.println("Iteration:"+iter++);
			int getPlayer1GuessNumber = p1.guessNumber(upperLimit);
			System.out.println("The number guessed by "+p1.getName()+" is "+getPlayer1GuessNumber);
			boolean player1GuessedCorrect = numToGuess == getPlayer1GuessNumber;
				if(player1GuessedCorrect) 
				{
					gotWinner=true;
					winner=p1;
					break;
				} 
			int getPlayer2GuessNumber = p2.guessNumber(upperLimit);
			System.out.println("The number guessed by "+p2.getName()+" is "+getPlayer2GuessNumber);
			boolean player2GuessedCorrect = numToGuess == getPlayer2GuessNumber;
				if(player2GuessedCorrect) 
				{
					gotWinner=true;
					winner=p2;
					break;
				} 
			int getPlayer3GuessNumber = p3.guessNumber(upperLimit);
			System.out.println("The number guessed by "+p3.getName()+" is "+getPlayer3GuessNumber);
			boolean player3GuessedCorrect = numToGuess == getPlayer3GuessNumber;
				if(player3GuessedCorrect)
				{
					gotWinner=true;
					winner=p3;
					break;
				} 
		}		

		System.out.println("We have got a winner . The winner is "+winner.getName());
	}

	private int getRandomNumber(int number)
	{
		return new Random().nextInt(number);
	}
	public static void main(String... args)
	{
		new GuessGame().startGame();
	}
}
class Player
{
	private String name;

	public Player(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	int guessNumber(int number)
	{
		return new Random().nextInt(number);
	}
}