import java.io.*;
import java.sql.*;

public class TryWithResources
{
	public static void main(String... args) throws  Exception

	{
		TryWithResources obj = new TryWithResources();
		obj.normalTryCatch();
		obj.normalTryManyCatch();
		obj.multiCatch();
		obj.trickyQuestion1();
		obj.tryWithResources();
	}
		public void normalTryCatch()
		{
			try
			{
					//
			}
			catch(Exception e )
			{
				// Here Exception can have nothing or something having is a Exception 
			}
		}
		public void normalTryManyCatch()
		{
			int x =5;
			try
			{
					if(x>5)
					{
						throw new SQLException();
					}
					else
					{
						throw new IOException();
					}
			}
			catch(SQLException e )
			{
				
			}
			catch(IOException e )
			{
				
			}
		}
		public void multiCatch() throws IOException
		{
			int x =5;
			try
			{
					if(x>5)
					{
						throw new FileNotFoundException();
					}
					else
					{
						throw new IOException();
					}
			}
			catch( IOException e  ) 
			{
				e = new FileNotFoundException();

			}
			catch (Exception e)
			{
				
			}
			
		}
		public void trickyQuestion1() throws SQLException,IOException
		{
			int x=5;
			try
			{
					if(x>5)
					{
						throw new FileNotFoundException();
					}
					else
					{
						throw new IOException();
					}
			}
			catch( Exception e  ) 
			{
				 // throw e;
			}
		}
		//  Task 1 - try with resource single resource run 
		// Task 2 . Make try with resource with  two resource run 
		// Task 3 - Make two AutoCloseable classes 
		// Task 4 use them in try with resources 
		// Show suppressed warnings
		// show main and suppressed warnings both 
		public void tryWithResources () throws FileNotFoundException
		{
			File file = new File("MyFile.txt");
			try(Reader fileReader = new BufferedReader(new FileReader(file)))
			{
				// nothing
			}
			catch(Exception e )
			{
				for(Throwable t : e.getSuppressed())
				{
					System.out.println("Suppressed " +t);
				}
			}
		}
}
