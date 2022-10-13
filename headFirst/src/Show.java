import java.util.*;
enum ShowEnum
{
	INSTANCE;
	private Set<String> availableSeats ;
	private ShowEnum()
	{
		availableSeats = new HashSet<>();
		availableSeats.add("1A");
		availableSeats.add("1B");
	}
	public boolean bookSeat(String seat)
	{
		return  availableSeats.remove(seat);
	}
	public static void main(String... args)
	{
		ticketAgentBooks("1A");
		ticketAgentBooks("1A");

	}	
	private static void ticketAgentBooks(String seat)
	{
		ShowEnum show = ShowEnum.INSTANCE;
		System.out.println(show.bookSeat(seat));
	}
}

class Show
{
	private static final Show INSTANCE = new Show();
	private Set<String> availableSeats ;
	private Show()
	{
		availableSeats = new HashSet<>();
		availableSeats.add("1A");
		availableSeats.add("1B");
	}
	public boolean bookSeat(String seat)
	{
		return  availableSeats.remove(seat);
	}
	public static void main(String... args)
	{
		ticketAgentBooks("1A");
		ticketAgentBooks("1A");

	}	
	static Show getInstance()
	{
		return INSTANCE;
	};
	private static void ticketAgentBooks(String seat)
	{
		Show show = Show.getInstance();
		System.out.println(show.bookSeat(seat));
	}
}

enum CofeeSize
{
	BIG,
	MEDIUM,
	SHORT
}