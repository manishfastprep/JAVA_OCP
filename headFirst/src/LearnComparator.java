import java.util.*;
class LearnComparator
{
      public List<String> getBookNames()
	{
		List<String> bookList = new ArrayList<>();
		bookList.add("Economics");
      	bookList.add("History");
     	bookList.add("Social Science");
     	bookList.add("Geography");
      	bookList.add("English");
      	bookList.add("Chemistry");
		return bookList;
	}
}
 class TestComparator
{
	public static void main(String[] args)

	{	
		LearnComparator obj = new LearnComparator();
		List<String> bookList = obj.getBookNames();
		List<String> bookList2 = obj.getBookNames();

		System.out.println("Before sorting");
		System.out.println(bookList2);

		// Sorting the bookList in place
		// Since bookList contains strings which have overridden toString method , each book will be printed 
		// as text; 
		Collections.sort(bookList);
		System.out.println("After sorting");
		System.out.println(bookList2);
		// sorting using 

	}
}