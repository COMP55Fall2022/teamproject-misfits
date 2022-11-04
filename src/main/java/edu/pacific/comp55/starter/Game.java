package edu.pacific.comp55.starter;

import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Scanner;

import acm.graphics.*;
import acm.program.*;
import java.awt.*;
import acm.util.*;



public class Game {
	boolean playing = false;
	boolean pause = false;
	boolean resume = false;
	boolean running = false;
	private Scanner playerInput;

	Level level;
	String wantPlay;
	
	//public void init() {
		//setSize(500, 500);
		//requestFocus();
	////}

	
	GLabel exitGame = new GLabel("You Quit", 200, 300);
	
	//public void run() {
	//	GLabel exitGame = new GLabel("You Quit", 200, 300);
		
		
		
		
		
	//}



	public void startGame(){
		running = true;
		playerInput = new Scanner(System.in);
		System.out.println("Would you like to play?");
		int playerChoice = 0;
		
		do {
			try {
				System.out.println("Press 1 for yes, or 2 for no)");
				playerChoice = playerInput.nextInt();
			}
			catch (Exception e){
				System.out.println("That is not an option. Please select 1 to play or 2 to exit.");
				playerInput = new Scanner(System.in);
				
			}
		} while(playerChoice <1 || playerChoice >2 );{
			if(playerChoice ==1)
				System.out.println("play game");
			//need to add the level background and characters here
			
				else if(playerChoice ==2) {
			System.out.println("you quit");
			
			//need to add the exit game image here
		}
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
	
	
	public static void main(String[] args) throws IOException {
		new Game().startGame();
		
		
	}


}
