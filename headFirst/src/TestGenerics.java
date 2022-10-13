import java.util.*;

public class TestGenerics
{
	public static void main(String... args)
	{
		TestGenerics obj = new TestGenerics();
		obj.sortSongs();
	}
	public void sortSongs()
	{
		// array should be rarely used 
		List<String> songList = new ArrayList<>();

		songList.add("song2");
		songList.add("song1");
		songList.add("song5");
		songList.add("song3");
		songList.add("song4");
		songList.add("song6");
		
		System.out.println(songList);

		// sort list  Method 1 

		Collections.sort(songList);
		System.out.println(songList);
		// sort list  in reverse order Method 2 
		Collections.sort(songList,Collections.reverseOrder());
		System.out.println("In reverse order "+songList);
	}
}