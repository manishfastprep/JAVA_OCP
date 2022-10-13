// import java.io.FileNotFoundException;
public class TestP5
{
	public static void main(String... args)
	{
		int size= 27,x;
		String name = "Fido";
		Dog myDog = new Dog(name,size);
		x= size-5;
		if(x<15) myDog.bark(8);
		int count =0;
		while(x-->3)
		{
			myDog.play();
			++count;
		}
		System.out.println(String.format("The while looo ran %,d times",count));
		int[] numList ={2,4,6,8};
		System.out.print("Hello");
		System.out.print("Dog: "+ name);
		String num="8";
		int value = Integer.parseInt(num);
	
		try
		{
			readTheFile("myFile.txt");
		}
		catch(FileNotFoundException ex)
		{
			System.out.print("File Not Found");
		}				
	}
	static void readTheFile(String fileName) throws FileNotFoundException
	{
		System.out.println("Reading the file");
	}
}
class FileNotFoundException extends Exception
{}
class Dog
{
	int size;
	String name;
	public Dog(String name,int size)
	{
		this.name=name;
		this.size=size;
	}
	
	public void bark(int numOfBarks)
	{
		for (int i=1;i<=numOfBarks;i++)
		{
		 	System.out.println("woof woof");
		}
	}
	public void play()
	{
		System.out.println("I am playing ");
	}
	
}













