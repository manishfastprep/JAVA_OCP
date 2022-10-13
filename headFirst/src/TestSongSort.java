package com.fastprep.collections;
import java.util.*;
public class TestSongSort
{
	public static void main(String[] args)
	{
		List<Song> songList = new ArrayList<>();
		Song song1 = new Song("name2","artist1");
		Song song2 = new Song("name1","artist3");
		Song song3 = new Song("name3","artist2");
		songList.add(song1);
		songList.add(song2);
		songList.add(song3);
		System.out.println(songList);
		Collections.sort(songList);
		System.out.println(songList);
 		Comparator<Song> songNameComparator = new SongNameComparator();
		songList.sort(songNameComparator);
		Collections.sort(songList,songNameComparator);
		System.out.println(songList);
		// Make a new Comparator object using Anonymous inner class 
		// Make a new Comparator object using Lambda expression
		// Use a new Comparator object using Anonymous inner class  inside Collections.sort method
		// Use a new Comparator object using lambda expression  inside Collections.sort method
		// Use a new Comparator object using Anonymous inner class  inside arraylist.sort method
		// Use a new Comparator object using lambda expression  inside arraylist.sort method 
		
 		Comparator<Song> songNameComparator1 = new Comparator<>()
		{
			public int compare(Song s1,Song s2)
			{
				return s1.getName().compareTo(s2.getName());
			}
			
		};
		Collections.sort(songList,songNameComparator1);
		System.out.println(songList);
		songList.sort(songNameComparator1);
		System.out.println(songList);
		Collections.sort(songList,(o1,o2) -> o1.getName().compareTo(o2.getName()));
		System.out.println(songList);

		
	}
	
	

	
      
}