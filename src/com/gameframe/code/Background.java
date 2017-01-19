package com.gameframe.code;

import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Background {
	Clip clip;


	public void stop() {
		// TODO Auto-generated method stub
		try{
			 if (clip.isRunning())
				 	clip.stop();
		}
		catch(Exception e){
			System.out.println("Clip not playing!");
		}
	}

	public void play() {
		// TODO Auto-generated method stub
		try{
			URL url = this.getClass().getClassLoader().getResource("background.wav");
	         AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
	         // Get a sound clip resource.
	         clip = AudioSystem.getClip();
	         // Open audio clip and load samples from the audio input stream.
	         clip.open(audioIn);
	         clip.loop(Clip.LOOP_CONTINUOUSLY);
			}
	       catch(Exception e) {
	         e.printStackTrace();
	      }
		
	}

}
