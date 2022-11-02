package edu.pacific.comp55.starter;

import java.util.Scanner;

public class Game {
	Level level;
	String wantPlay;
	Scanner playerInput = new Scanner(System.in);

	
	public void startGame(){
		System.out.println("Would you like to play?");
		wantPlay = playerInput.next();
		
		
	}
	
	public void pauseGame() {
		
	}
	
	public void resumeGame () {
		
	}
	
	
	
}
