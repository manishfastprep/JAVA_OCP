package com.fastprep.collections;

import java.util.*;
public class Song implements Comparable<Song>
{
	private String name;
	private String artist;
	public Song(String name,String artist)
	{
		this.name=name;
		this.artist= artist;
	}
	public String toString()
	{
		return name + " "+ artist +"\n";
	}
	// getter 
	public String getName()
	{
		return name;
	}
	public String getArtist()
	{
		return artist;
	}	
	public int compareTo(Song song)
	{
		// compare according to the artist name natural order
		return artist.compareTo(song.getArtist());
	}
}


