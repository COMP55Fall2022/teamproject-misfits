package edu.pacific.comp55.starter;

import java.awt.Color;
import java.awt.event.MouseEvent;



import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.graphics.GObject;
import acm.graphics.GRect;
import javafx.scene.text.Font;

public class Help extends GraphicsPane {

	 private Game helpProgram; 	  
	 private GParagraph para; 
	 private GButton goBack;
	 private GParagraph help;
	 private GParagraph helpMoves;
	 private GRect helpBack;
	  
	  
	 public Help(Game app) { 
		 this.helpProgram = app; 
		 helpBack = new GRect(Game.WINDOW_WIDTH, Game.WINDOW_HEIGHT);
		 
		 helpBack.setFillColor(Color.blue);
		 helpBack.setFilled(true);
		 
		 para = new GParagraph("Welcome to the help Menu", 160, 100);
		 para.setFont("Arial-45");
		 para.setColor(Color.black);
		 
		 help = new GParagraph("Making the player move", 10,200);
		 help.setFont("Arial-italic-20");
		 help.setColor(Color.black);
		 
		 helpMoves = new GParagraph("Move player left: left arrow key\nMove player right: right arrow key",10,230);
		 helpMoves.setFont("Arial-15");
		 
		 helpMoves.setColor(Color.black);
		 

		 goBack = new GButton("Return to Menu", 0, 0, 100, 25);
		 goBack.setFillColor(Color.green);
		 }
	 
	
	  @Override public void showContents() { 
		  helpProgram.add(helpBack);
		  helpProgram.add(para); 
		  helpProgram.add(goBack); 
		  helpProgram.add(help);
		  helpProgram.add(helpMoves);
		  
			 
		  
	  }
	  
	  @Override public void hideContents() { 
		  helpProgram.remove(para);
		  helpProgram.remove(goBack); }
	  
	  @Override public void mousePressed(MouseEvent e) {
	  GObject obj = helpProgram.getElementAt(e.getX(), e.getY());
	  if (obj == goBack) {
	  helpProgram.switchToMenu(); } }

	 }


