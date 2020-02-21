package com.bridgelabz.structuraldesign.adapter.player;

/**
 * Select media adapter and then play media
 *
 */
public class MediaAdapter implements MediaPlayer{

	AdvanceMediaPlayer musicPlayer;
	public MediaAdapter(String audioType){
		   
	      if(audioType.equalsIgnoreCase("vlc") ){
	         musicPlayer = new VlcPlayer();			
	         
	      }else if (audioType.equalsIgnoreCase("mp4")){
	         musicPlayer = new Mp4Player();
	      }	
	}
	@Override
	public void play(String audioType, String fileName) {
		// TODO Auto-generated method stub
		 if(audioType.equalsIgnoreCase("vlc")){
			 musicPlayer.playVlc(fileName);
	      }
	      else if(audioType.equalsIgnoreCase("mp4")){
	         musicPlayer.playMp4(fileName);
	      }	
	}
	

}
