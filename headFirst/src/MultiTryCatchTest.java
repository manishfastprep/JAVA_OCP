import java.io.*;
import java.sql.*;
class MultiTryCatchTest
{
	String name="manish";
	public static void main(String[] args) throws MyException
	{
		MultiTryCatchTest obj = new MultiTryCatchTest();
		String text = args[0];
		try
		{
			if(text.equals("sql"))
			throw new SQLException();
	
			throw new IOException();
		}
/* 		catch(SQLException e)
		{
			System.out.println("SQL Exception catched");
		}
		catch(IOException e)
		{
			System.out.println("IO Exception catched");
		}
 */	
/*  		catch(SQLException | IOException e)
		{
			System.out.println("SQL Exception catched");
		}
 */ 		
		// an exception can not pass is a test for more than one exception in multi catch
/*		catch(FileNotFoundException | IOException e)
		{
			System.out.println("SQL Exception catched");
		}

		catch(IOException | Exception e)
		{
			System.out.println("SQL Exception catched");
		}
*/
		catch(SQLException | IOException e)
		{
			// throw new Exception();	 this may be used to throw a new created exception with some additional details 
			// throw new MyException(new Exception(e),obj.name);
			//e = new MyException(new Exception(e),obj.name);// this is not allowed as e parameter in multitrycatch is final and can not be reassigned 
			//throw e;	
		}	
		catch(Exception e)
		{
			// throw new Exception();	 this may be used to throw a new created exception with some additional details 
			// throw new MyException(new Exception(e),obj.name);
			e = new MyException(new Exception(e),obj.name);// this is not allowed as e parameter in multitrycatch is final and can not be reassigned 
			//throw e;	
		}	
		
 }
}

class MyException extends Exception
{
	String nameFound;
	Exception e;
	MyException(Exception e , String name)
	{
		this.nameFound = name;
		this.e= e;
	}
}