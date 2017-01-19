package com.gameframe.code;

import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Sound {
	
	public static final int CLICK=1;
	public static final int SELECT=2;
	public Clip clip;
	
	public void click(){
		try{
			URL url = this.getClass().getClassLoader().getResource("click.wav");
	         AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
	         // Get a sound clip resource.
	         clip = AudioSystem.getClip();
	         // Open audio clip and load samples from the audio input stream.
	         clip.open(audioIn);
	         clip.start();;
			}
	       catch(Exception e) {
	         e.printStackTrace();
	      }
		
	}
	
	public void select(){
		try{
			URL url = this.getClass().getClassLoader().getResource("select.wav");
	         AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
	         // Get a sound clip resource.
	         clip = AudioSystem.getClip();
	         // Open audio clip and load samples from the audio input stream.
	         clip.open(audioIn);
	         clip.start();;
			}
	       catch(Exception e) {
	         e.printStackTrace();
	      }
	}

	public static void main(String[] args,int type) {
		// TODO Auto-generated method stub
		Sound o =new Sound();
		if(type==Sound.SELECT)
			o.select();
		if(type==Sound.CLICK)
			o.click();
		

	}

}
