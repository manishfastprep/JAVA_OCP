package com.fastprep.collections;
import com.fastprep.collections.*;
import java.util.*;
public class SongArtistComparator implements Comparator<Song>
{
	public int compare(Song song1,Song song2)
	{
		String artist1 = song1.getArtist();
		String artist2 = song2.getArtist();
		return artist1.compareTo(artist1);
	}
}