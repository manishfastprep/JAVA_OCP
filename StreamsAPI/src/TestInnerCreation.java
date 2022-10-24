
public class TestInnerCreation
{
	class Bar
	{
		 void go()
		{
			System.out.println("inner class "); ;
		}
	}
	public static void main(String[] args)
	{
		new TestInnerCreation().makeBar();
	}
	void makeBar()
	{
		(new Bar() {}).go();
	}

}
