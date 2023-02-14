package com.jspiders.musicPlayer;

import java.util.ArrayList;
import java.util.Scanner;

public class SongOperation {

	Scanner sc=new Scanner(System.in);
	ArrayList <Song>arraylist=new ArrayList<Song>();
	public void addSong()
	{
		System.out.println("How Many Songs Do You Want");
		int addCount=sc.nextInt();
		for (int i=0;i<addCount;i++)
		{
			Song song =new Song();
			System.out.println("Enter an ID for Song");
			song.setId(sc.nextInt());
			System.out.println("Enter the name for song");
			song.setName(sc.next());
			System.out.println("Enter the Duration of song");
			song.setLength(sc.nextDouble());
			System.out.println("Enter the Singer's name ");
			song.setSinger(sc.next());
			System.out.println("Enter the Lyricist of the song");
			song.setLyricist(sc.next());
			arraylist.add(song);
			System.out.println(song.getName()+"songs added successfully");
		}
	}
	public void displayAllSongs()
	{
		if (arraylist.isEmpty())
		{
			System.out.println("Add Songs and  then Play Songs ");
			addSong();
		}
		
		for (Song song : arraylist )
		{
			System.out.println(song.getName());
			System.out.println("Playing all Songs");
		}
	}
	public void removeSong()
	{
		if (arraylist.isEmpty())
		{
		System.out.println("Add Songs and then Remove");
		addSong();
		}
		System.out.println("Select Song to Remove ");
		displayAllSongs();
		int removeId=sc.nextInt();
		System.out.println(arraylist.get(removeId-1).getName()+"song removed successfully.....");
		arraylist.remove(removeId-1);
		displayAllSongs();
     }
     public void playAllSongs()
    {
	    if (arraylist.isEmpty())
	   	{
		System.out.println("Add Songs and then Play");
		addSong();
		}
        System.out.println("Playing All songs ");
		for (Song song : arraylist)
		{
            System.out.println(song.getName());
		}
    }
    public void playRandomSong()
	{ 
		if (arraylist.isEmpty())
		{
		System.out.println("Add Songs and then Play");
		addSong();
		}
		System.out.println("Palying random song");
		double number=Math.random();
		int random=(int)(number*10)+1;
		if (random>arraylist.size())
		{
			random=1;
		}
		
	}
	public void playSpecificSong()
	{
		if (arraylist.isEmpty())
		{
		System.out.println("Add Songs and then Remove");
		addSong();
		}
		System.out.println("select Song to play");
		displayAllSongs();
		int play=sc.nextInt();
		System.out.println("Playing Song"+arraylist.get(play-1).getName());
	}
	public void editPlaylist()
	{
		if (arraylist.isEmpty())
		{
		System.out.println("Add Songs and then Remove");
		addSong();
		}
		System.out.println("Select song to edit");
		displayAllSongs();
		int edit=sc.nextInt();
		arraylist.remove(edit-1);
		Song song1=new Song ();
		System.out.println("Enter the new Id for song ");
		song1.setId(sc.nextInt());
		System.out.println("Enter the Name of  the  song ");
		song1.setName(sc.next());
	   System.out.println("Enter the duration of song ");
		song1.setLength(sc.nextDouble());
	    System.out.println("Enter the Singer of the song ");
		song1.setSinger(sc.next());
	    System.out.println("Enter the Lyricist of the song ");
		song1.setLyricist(sc.next());
	  arraylist.add(edit-1,song1);
	  System.out.println(arraylist.get(edit-1).getName()+"Song details get updated ");
	}
}

