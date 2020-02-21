package com.bridgelabz.structuraldesign.adapter.player;

/**
 * class to play VLC file
 *
 */
public class VlcPlayer implements AdvanceMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		// TODO Auto-generated method stub
		System.out.println("Playing VLC File : " + fileName);
	}

	@Override
	public void playMp4(String fileName) {
		// TODO Auto-generated method stub

	}

}
