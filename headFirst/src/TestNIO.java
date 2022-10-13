import java.io.*;
class TestNIO
{
		public static void main(String... args) throws IOException
		{
			TestNIO obj = new TestNIO();
			//obj.testFileCreation();
			//obj.testReadFileUsingFileReader();
			obj.testReadFileUsingFileInputStream();
			//obj.testReadFileUsingBufferedFileReader();
		}
		public void testFileCreation() throws IOException
		{
			boolean fileIsCreated=false;
			File file = new File("Manish.txt");
			System.out.println(file.exists());
			fileIsCreated = file.createNewFile();
			System.out.println(file.exists());
			System.out.println(fileIsCreated);
 
		}
		public void testReadFileUsingFileInputStream() throws IOException
		{
			byte[] in = new byte[50];
			File file = new File("Manish.txt");
			int size=0;
			FileOutputStream fw = new FileOutputStream(file);
			fw.write("Pratibha is cool \nManish is coolest ".getBytes());
			fw.flush();
			fw.close();

			FileInputStream fr = new FileInputStream(file);
			System.out.println("size is "+size);
			size=fr.read(in);
			for(byte c : in)
			{
				System.out.print((char)c);
			}
			fr.close();
			
		}

		public void testReadFileUsingFileReader() throws IOException
		{
			 char[] in = new char[50];
			File file = new File("Manish.txt");
			int size=0;
			FileWriter fw = new FileWriter(file);
			fw.write("Pratibha is cool \nManish is coolest ");
			fw.flush();
			fw.close();

			FileReader fr = new FileReader(file);
			size = fr.read(in);
			System.out.println("size is "+size);
			for(char c : in)
			{
				System.out.print(c);
			}
			fr.close();
			
		}
		public void testReadFileUsingBufferedFileReader() throws IOException
		{
			 // char[] in = new char[50];
			File file = new File("Manish.txt");
			//int size=0;
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			//bw.write("Pratibha is cool \nManish is coolest ");
			bw.append("Pratibha is cool");
			bw.append("Manish is cool");
			bw.flush();
			bw.close();

			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			//size = fr.read(in);
//			System.out.println("size is "+size);
			String str = br.readLine();
			System.out.println(str);
			
		}
}









