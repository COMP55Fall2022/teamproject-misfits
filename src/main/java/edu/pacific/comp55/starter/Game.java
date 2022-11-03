package edu.pacific.comp55.starter;

import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Scanner;

public class Game {
	boolean playing = false;
	boolean pause = false;
	boolean resume = false;
	boolean running = false;
	
	Level level;
	String wantPlay;
	Scanner playerInput = new Scanner(System.in);

	
	public void startGame(){
		
		running = true;
		
		System.out.println("Would you like to play?");
		
		int playerChoice = 0;
		
		do {
			try {
				System.out.println("Press (1) for yes, or (2) for no)");
				playerChoice = playerInput.nextInt();
			}
			catch (Exception e){
				System.out.println("That is not an option. Please select (1) to play or (2) to exit.");
				playerInput = new Scanner(System.in);
				
			}
		} while(playerChoice ==1 ); {
			playing = true;
		}
		while(playerChoice ==2 );{
			playing = false;
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
		Game game = new Game();
		game.startGame();
	}
}
