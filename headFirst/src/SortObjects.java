import java.util.*;
class Song implements Comparable<Object>
{
	public String title;
	public String artist;
	public int bpm;
	public Song(String title,String artist,int bpm)
	{
		this.title=title;
		this.artist=artist;
		this.bpm=bpm;
	}
	public String toString()
	{
		return title +" "+ artist + 
				" "+bpm; 
	}
 	public int compareTo(Object other)
	{

			return this.artist.compareTo(((Song)other).artist);

	}
}
class MockSongs
{
	public static List<Song> getSongs()
	{
		List<Song> result = new ArrayList<Song>();
		result.add(new Song("Song1","Artist1",1));
		result.add(new Song("Song3","Artist1",2));
		result.add(new Song("Song2","Artist3",1));
		result.add(new Song("Song2.5","Artist2",10));
		result.add(new Song("Song1.5","Artist3",2));
		result.add(new Song("Song6","Artist2",3));
		return result;
	}
}
class SortObjects
{
	public static void main(String[] args)
	{
		List<Song> songList = MockSongs.getSongs();
		System.out.println(songList);
		Collections.sort(songList);
		System.out.println(songList);
		
		
		

	}

}





