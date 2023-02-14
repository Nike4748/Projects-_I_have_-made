package com.jspiders.main;

import java.util.Scanner;
import com.jspiders.musicPlayer.*;

public class MusicPlayerMain {
	Scanner sc1=new Scanner(System.in);
	SongOperation song=new SongOperation();
    boolean loop;
	public static void main(String[] args) 
	{
		MusicPlayerMain music=new MusicPlayerMain();
		boolean loop=true;
		while (loop)
		{
			music.multiPlayer();
		}
	}
	    public void multiPlayer()
		{
         System.out.println("choose the following Operation:\n"
			                                      +"1.Add/Remove songs:\n"
												  +"2.Play the Song:            \n"
												  +"3.Edit the Song:            \n"
												   +"4.Exit.");
		int number=sc1.nextInt();
			switch (number)
			  {
			  case 1:System.out.println("1.Add the song:\n"+"2.Remove the song:\n"+"3.Back.");
			             int num =sc1.nextInt();
						 switch (num)
						 {
						 case 1:song.addSong();
						        break;
						 case 2:song.removeSong();
						        break;
						 case 3:multiPlayer();
						        break;
						 default :System.out.println("Invalid choice");
						        break;
						 }
						 break;
			case 2:System.out.println("1.Select song to play:\n"+"2.Play all Songs:\n"+"3.Play random songs:\n"+"4.Back");
			              switch (sc1.nextInt())
			              {
			              case 1:song.playSpecificSong();
						  break;
						  case 2:song.playAllSongs();
						  break;
						  case 3:song.playRandomSong();
			              break;
						  case 4:multiPlayer();
						  break;
						  default:System.out.println("Invalid choice");
						  break;
			              }
						  break;
			case 3:System.out.println("1.Edit PlayList.\n"+"2.Back");
			              switch (sc1.nextInt())
			              {
			              case 1:song.editPlaylist();
						  break;
						  case 2:multiPlayer();
						  break;
						  default:System.out.println("Invalid choice");
						   break;
			              }
			case 4: loop = false;
			              System.out.println("Thank -You");
						  break;
						  
		    default:System.out.println("Invalid choice");
				    break;
			  }
				}
			
	}

