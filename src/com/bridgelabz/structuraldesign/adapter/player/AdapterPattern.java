package com.bridgelabz.structuraldesign.adapter.player;
/**Title:Program to Show implementation of Music Player by using Adapter design pattern
 * Created By:Ankit Rajput
 * 
 *
 */
public class AdapterPattern {
	   public static void main(String[] args) {
	      AudioPlayer audioPlayer = new AudioPlayer();

	      audioPlayer.play("mp3", "See You Again.mp3");
	      audioPlayer.play("mp4", "Roar.mp4");
	      audioPlayer.play("vlc", "Hello.vlc");
	      audioPlayer.play("avi", "Lean On.avi");
	   }
	}