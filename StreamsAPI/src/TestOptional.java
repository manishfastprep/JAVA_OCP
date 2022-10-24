import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class TestOptional
{

	public static void main(String[] args)
	{
		TestOptional obj = new TestOptional();
		//obj.testOptional();
		//obj.testStreamOfDouble();
		//obj.testFilterUsingStream();
		//obj.testMapPrimitives();
		//obj.testCollectionFromStream();
		obj.testGroupingPartitionStream();
		
	}
	private void testGroupingPartitionStream()
	{
		List<Person> persons = new ArrayList<>();
		Person p1 = 	new Person("beth",30);
		Person p2 = 	new Person("eric",31);
		Person p3 = 	new Person("deb",31);
		Person p4 = 	new Person("liz",30);
		Person p5 = 	new Person("wendy",34);
		Person p6 = 	new Person("kethy",35);
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		persons.add(p4);
		persons.add(p5);
		persons.add(p6);
		Map<Integer,List<Person>> map = persons.stream().collect(Collectors.groupingBy(r -> r.age));
		System.out.println(map.entrySet());
		
	}
	private void testCollectionFromStream()
	{
		List<Person> persons = new ArrayList<>();
		Person p1 = 	new Person("beth",30);
		Person p2 = 	new Person("eric",31);
		Person p3 = 	new Person("deb",31);
		Person p4 = 	new Person("liz",30);
		Person p5 = 	new Person("wendy",34);
		Person p6 = 	new Person("kethy",35);
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		persons.add(p4);
		persons.add(p5);
		persons.add(p6);
		persons.stream()
		.filter(p -> p.getAge()==34)
		.collect(Collectors.toList()).forEach(System.out::println);
		persons.stream()
		.filter(p -> p.getAge()==34)
		.collect(Collectors.toCollection(ArrayList::new)).forEach(System.out::println);
		persons.stream()
		.filter(p -> p.getAge()==34)
		.collect(Collectors.toCollection(()-> new ArrayList<Person>())).forEach(System.out::println);
		
	}
	class Person 
	{
		String name;
		int age;
		Person(String name, int age )
		{
			this.name=name; this.age=age ;
		}
		public String getName()
		{
			return name;
		}
		public int getAge()
		{
			return age;
		}
		@Override
		public String toString()
		{
			return "Person [name=" + name + ", age=" + age + "]";
		}
		
	}

	class Reading 
	{
		int year;
		int month;
		int day;
		double value;
		Reading(int year, int month , int day, double value)
		{
			this.year=year; this.month=month ;
			this.day=day;this.value=value;
		}
		@Override
		public String toString()
		{
			return "Reading [year=" + year + ", month=" + month + ", day=" + day + ", value=" + value + "]";
		}
		
	}
	private void testMapPrimitives()
	{
		List<Integer> intList = Arrays.asList(1,2,3,4);
		List<Reading> readings = Arrays.asList
				(	
						new Reading(2017,1,2,405.91),
						new Reading(2011,2,4,402.12),
						new Reading(2020,1,2,410.23)
				); 
//		readings.stream().mapToInt(val -> val.year).forEach(System.out::println);
//		readings.stream().mapToInt(val-> val.month).forEach(System.out::println);
//		readings.stream().filter(val->val.month>1).forEach(System.out::println);
//		readings.stream().sorted().forEach(System.out::println);
//		readings.stream().sorted((r1,r2)-> r1.month-r2.month).forEach(System.out::println);
		
		
		//		OptionalDouble avg = readings.stream().mapToDouble(reading -> reading.value).average();
//		System.out.println(avg.isPresent() ? avg.getAsDouble() : "There is no element");
//		OptionalDouble avgWrong = readings.stream().mapToDouble(reading -> reading.value).reduce((r1,r2)-> (r1+r2)/2 );
//		System.out.println(avgWrong.isPresent() ? avgWrong.getAsDouble() : "There is no element");
	}
	private void testFilterUsingStream()
	{
		Map<String,Integer>  myMap = new HashMap<>();
		myMap.put("Boi", 6);
		myMap.put("Zooey", 3);
		myMap.put("Charis", 8);
		System.out.println("The number of items in myMap with value >4 " + myMap.entrySet()
																			.stream()
																			.filter(entry -> entry.getValue()>4).count());
	}
	private void testStreamOfDouble()
	{
		Stream<Double> ppm = Stream.of(1.0,2.0,1.3);
		Stream<Double> ppm2 = ppm.sorted();
		ppm2.forEach(System.out::println);
//		ppm2.filter(i -> i>1).forEach(System.out::println);
		
	}
	public void testOptional()
	{
		DoubleStream stream = DoubleStream.of(405.01,406.0,407.2,408.1,406.5,407.8);
		OptionalDouble optionalValue = stream.filter(val -> val >405).min();
		if(optionalValue.isPresent())
		{
			System.out.println(optionalValue.getAsDouble());
		}
		else
		{
			System.out.println("No element present in the optionalValue");			
		}
		Stream<Double> stream2 = Stream.of(405.01,406.0,407.2,408.1,406.5,407.8);
		Optional<Double> optionalValue2 = stream2.filter(val -> val >405).findAny();
//		if(optionalValue2.isPresent())
//		{
//			System.out.println(optionalValue2.get());
//		}
//		else
//		{
//			System.out.println("No element present in the optionalValue");			
//		}
		optionalValue2.ifPresent(val -> System.out.println(val));
		optionalValue2.ifPresent(System.out::println); // Method reference
	}
}
