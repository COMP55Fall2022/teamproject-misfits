
 package edu.pacific.comp55.starter;
  
  import java.awt.event.MouseEvent; 
  import java.awt.Color; 
  import java.awt.event.ActionEvent; 
  import java.awt.event.ActionListener; 
  import java.awt.event.KeyEvent; 
  import java.awt.event.MouseEvent; 
  import java.util.Arrays;
  
  import javax.swing.*;

import acm.graphics.GLabel;
import acm.graphics.GObject;
import acm.graphics.GRect;
  
  public class LevelSelector extends GraphicsPane { 
	  private Game levelSelector;
	  private GButton levelSelector1;
	  private GButton levelSelector2; 
	  private GButton levelSelector3; 
	  private GButton levelSelector4;
	  private GButton exitToMenu;
	  private GRect background;
	  private GLabel title;

 
  
	  public LevelSelector(Game program) {
  
		  levelSelector = program; 
		  
		  background = new GRect(Game.WINDOW_WIDTH, Game.WINDOW_HEIGHT); 
		  background.setFillColor(Color.decode("#cf2121"));
		  background.setFilled(true);
		  
		  title = new GLabel("Please select a level", 240, 100);
		  title.setFont("Arial-45");
		  title.setColor(Color.black);
		  
		  int locX = 100; 
		  int locY = 150; 
		  levelSelector1 = new GButton("Level 1", locX, locY, 100, 50); 
		  locX+= 200; 
		  levelSelector2 = new GButton("Level 2", locX, locY, 100, 50); 
		  locX+= 200;
		  levelSelector3 = new GButton("Level 3", locX, locY, 100, 50); 
		  locX+= 200; 
		  levelSelector4 = new GButton("Level 4", locX, locY, 100, 50); 
	  
		  exitToMenu = new GButton("Exit to Menu", 10, 10, 100, 25, Color.white);
		  
		  
		 
	  }
  
	  public void levels(GButton app) { 
		this.levelSelector1 = app;
	  	this.levelSelector2 = app; 
	  } 
	  public void showContents() {
		levelSelector.add(background);
	  	levelSelector.add(levelSelector1); 
	  	levelSelector.add(levelSelector2);
	  	levelSelector.add(levelSelector3); 
	  	levelSelector.add(levelSelector4); 
	  	levelSelector.add(exitToMenu);
	  	levelSelector.add(title);
	  	
	  }
  
	  public void hideContents() { 
		levelSelector.remove(background);
		levelSelector.remove(levelSelector1);
	  	levelSelector.remove(levelSelector2); 
	  	levelSelector.remove(levelSelector3);
	  	levelSelector.remove(levelSelector4); 
	  	levelSelector.remove(exitToMenu);
	  	levelSelector.remove(title);
	  	
	  }
  
	  public void mousePressed(MouseEvent e) { 
  		GObject obj = levelSelector.getElementAt(e.getX(), e.getY()); 
  		if (obj ==  levelSelector1) {
			levelSelector.switchToMainScreen(); 
			} 
  		if (obj ==  levelSelector2) {
			levelSelector.switchToMainScreen(); 
			} 
  		if (obj ==  levelSelector3) {
			levelSelector.switchToMainScreen(); 
			} 
  		if (obj ==  levelSelector4) {
  			levelSelector.switchToMainScreen(); 
  			} 
  		if (obj ==  exitToMenu) {
  			levelSelector.switchToMenu();
  			}
	  }
  		
  	
  
  public void run() { // TODO Auto-generated method stub
  
  } 
  
}
 