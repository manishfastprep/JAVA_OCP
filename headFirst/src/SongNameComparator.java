package com.fastprep.collections;
import com.fastprep.collections.*;
import java.util.*;
public class SongNameComparator implements Comparator<Song>
{
	public int compare(Song song1,Song song2)
	{
		return song1.getName().compareTo(song2.getName());
	}
}