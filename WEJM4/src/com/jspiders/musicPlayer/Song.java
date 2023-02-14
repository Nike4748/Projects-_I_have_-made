package com.jspiders.musicPlayer;

public class Song {
	int id;
	String name;
	double length;
	String singer;
	String lyricist;
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public String getName()
	{
		return name;
	}
	public void setName (String name)
	{
		this.name=name;
	}
	public double getLength()
	{
		return length;
	}
	public void setLength(double length)
	{
		this.length=length;
	}
	public String getSinger()
	{
		return singer;
	}
	public void setSinger(String singer)
	{
		this.singer=singer;
	}
	public String getLyricist()
	{
		return lyricist;
	}
	public void setLyricist(String lyricist)
	{
		this.lyricist=lyricist;
	}
}
