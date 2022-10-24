import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestRandomCode
{
	public static void main(String[] args)
	{
		TestRandomCode randomCode = new TestRandomCode();
		randomCode.testIntStream();
		randomCode.testMethodReference();
		
		List<Apple> appleList = new ArrayList<>();
		randomCode.testGenerics(appleList);
	}
	public void testGenerics(List<?> list)
	{
//		list.add(new Apple());
	}
	public void testIntStream()
	{
		IntStream.iterate(0, i -> i + 2).filter(j -> j % 10 == 0).limit(6).forEach(System.out::println);

		IntStream.range(0, 5).forEach(System.out::println);
		
		IntStream doubleStream = Stream.of(42,56,58,56,23).mapToInt(i->i);
		
		
	}
	
	
	
	public void testMethodReference()
	{
		List<Reading> readings = new ArrayList<>();
		readings.add(new Reading (2,2000));
		readings.add(new Reading (1,2001));
		readings.add(new Reading (4,2003));
		readings.add(new Reading (5,2007));
		readings.add(new Reading (6,2002));
		readings.sort(Reading::compareTo);
		readings.forEach(System.out::println);
		
		readings.stream().sorted(Reading::compareTo).forEach(System.out::println);
		
	}
}

class Reading
{
	public int year;
	public int extent;

	public Reading(int year, int extent)
	{
		super();
		this.year = year;
		this.extent = extent;
	}

	public static int compareTo(Reading r1, Reading r2)
	{
		return (r1.extent > r2.extent) ? 1 : -1;
	}

	@Override
	public String toString()
	{
		return "Reading [year=" + year + ", extent=" + extent + "]";
	}

}
class Apple{}