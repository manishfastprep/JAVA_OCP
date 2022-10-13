public class ForLoopSyntaxTest
{
	public static void main(String... args)
	{
		loop: for(; ; )
		{
			System.out.println("sample");
			continue loop;
		}
	}
}