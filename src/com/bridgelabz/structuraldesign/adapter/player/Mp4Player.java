package com.bridgelabz.structuraldesign.adapter.player;

/**
 * class to play Mp4 File
 *
 */
public class Mp4Player implements AdvanceMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		// TODO Auto-generated method stub

	}

	@Override
	public void playMp4(String fileName) {
		// TODO Auto-generated method stub
		System.out.println("Playing Mp4 File : " + fileName);
	}

}
