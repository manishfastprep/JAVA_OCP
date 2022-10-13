import java.IO.*;
public class LearnIO
{
 public static void main(String[] args)
	{
		TestLearnIo obj = new TestLearnIO();
		obj.ioUsingByte();
	}


public void TestLearnIO throws IOException
{
	boolean fileIsCreated = false();
	File pra = new File("Pratibha.txt");
	System.out.println(file.exists());
	fileIsCreated = pra.createNewFile();
	System.out.println(file.exists());
	System.out.println(fileIsCreated);
}

public void testIoStream() throws IOException
{
	byte[] in = new byte[50];
      File pra = new File("Pratibha.txt");
   	int size = 0;
	FileOutputStream pw = new FileOutputStream(pra);
	pw.write("pratibha is cool".getBytes());
	pw.flush();
	pw.close();
	
	FileInputStream pi = new FileInputStream(pra);
	System.out.println("Size is "+ size); 
      size = pi.read(in);
	for(byte c : in)
	{
		System.out.print((char)c);
	}
	pi.close();
}

public void testIoChar()