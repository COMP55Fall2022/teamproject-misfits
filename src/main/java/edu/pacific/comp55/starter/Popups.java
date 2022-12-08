package edu.pacific.comp55.starter;
import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Popups extends GraphicsPane{
	
	private Game popups;
	private GImage endLevel;
	private GRect background;
	private boolean win;
	private GButton exitToLevel;
	private GButton exitToMenu;
	private GButton exitGame;
	
	public Popups(Game program, boolean didWin) {
		super();
		
		popups = program;
		win = didWin;
		
		background = new GRect(Game.WINDOW_WIDTH, Game.WINDOW_HEIGHT); 
		background.setFillColor(Color.BLACK);
		background.setFilled(true);
		
		endLevel = new GImage("media/LevelCleared (1).png");
		endLevel.setLocation(0, 0);
		
		exitToLevel = new GButton("Change level", 350,235,200,50);
		exitToLevel.setFillColor(Color.decode("#40a832"));
		
		exitToMenu = new GButton("Exit to Main Menu", 350,490,200,50);
		exitToMenu.setFillColor(Color.decode("#2825e8"));
		
		exitGame = new GButton("Exit the Game", 350,363,200,50);
		exitGame.setFillColor(Color.decode("#cf2121"));
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
			popups.add(exitToLevel);
			popups.add(exitToMenu);
			popups.add(exitGame);
		}
		
	}
	
	public void removeWinScreen() {
		popups.remove(background);
		popups.remove(endLevel);
		popups.remove(exitToLevel);
		popups.remove(exitToMenu);
		popups.remove(exitGame);
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		GObject obj = popups.getElementAt(e.getX(), e.getY());
		if (obj == exitToLevel) {
			popups.switchToLevel();
		}
		if(obj == exitToMenu) {
			popups.switchToMenu();
		}
		if(obj == exitGame) {
			System.exit(0);
		}
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
