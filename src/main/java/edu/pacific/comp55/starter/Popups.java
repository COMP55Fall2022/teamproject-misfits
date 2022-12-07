package edu.pacific.comp55.starter;
import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Popups extends GraphicsPane{
	
	private Game popups;
	private GImage endLevel;
	private GRect background;
	private boolean win;
	
	public Popups(Game program, boolean didWin) {
		
		popups = program;
		win = didWin;
		
		background = new GRect(Game.WINDOW_WIDTH, Game.WINDOW_HEIGHT); 
		background.setFillColor(Color.black);
		background.setFilled(true);
		
		endLevel = new GImage("media/LevelCleared.png");
		endLevel.setLocation(0, 0);
	}
	

	


	public void showContents() {
		// TODO Auto-generated method stub
		
		drawWinScreen();
	}


	public void hideContents() {
		// TODO Auto-generated method stub
		if (win ==  true) {
			removeWinScreen();
		}
	}
	
	public void drawLossScreen() {
		//GImage lossScreen = new GImage();
		//add(LossScreen);
	}
	
	public void drawWinScreen() {
		
		//add(winScreen);
		//private Popups winScreen;
		//winScreen = new Popups(this);
		if(win ==  true) {
			popups.add(background);
			popups.add(endLevel);
		}
		
	}
	
	public void removeWinScreen() {
		popups.remove(background);
		popups.remove(endLevel);
	}
	
	public void drawBeginningTitle() {
		//GImage beginningTitle = new GImage();
		//add(beginningTitle);
	}
	
	public void drawSummaryScreen() {
		//GImage summaryScreen = new GImage();
		//add(summaryScreen);
	}

	
	public void run() {
		// TODO Auto-generated method stub
		
	}


	
}
