import java.io.File;
import java.io.FileWriter;
import java.io.BufferedReader;

public class IOTest
{
	public static void main(String[] args)
	{
		File file = new File("test.txt");
		try
		{
			boolean exists = file.exists();
			if(!exists)
			{
				file.createNewFile();
			}
			FileWriter writer = new FileWriter(file);
			
		}
		catch(Exception e)
		{
			
		}
		
	}
}
