package edu.pacific.comp55.starter;

import java.awt.event.KeyEvent;
import java.util.Scanner;

public class Game {
	boolean playing = false;
	boolean pause = false;
	boolean resume = false;
	
	
	Level level;
	String wantPlay;
	Scanner playerInput = new Scanner(System.in);

	
	public void startGame(){
		System.out.println("Would you like to play? Press (Y) for yes, or (N) for no.");
		wantPlay = playerInput.next();
		
		if(wantPlay.equals("Y") || wantPlay.equals("y")) {
			playing = true;
		}
		
	}
	
	public void pauseGame() {
		pause = !pause;
		
		if(pause) {
			System.out.println("Game paused");
		}
	}
	
	public void keyPressed(KeyEvent e) {
		int keycode = e.getKeyCode();
		
		switch(keycode) {
		case KeyEvent.VK_P -> pauseGame();
		
		}
	
	}
	
	
	
}
