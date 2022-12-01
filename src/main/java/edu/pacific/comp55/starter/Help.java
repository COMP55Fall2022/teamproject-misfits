package edu.pacific.comp55.starter;

import java.awt.Color;
import java.awt.event.MouseEvent;



import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.graphics.GObject;
import javafx.scene.text.Font;

public class Help extends GraphicsPane {

	 private Game helpProgram; 	  
	 private GParagraph para; 
	 private GButton goBack;
	 private GParagraph help;
	 
	  
	  
	 public Help(Game app) { 
		 this.helpProgram = app; 
		 para = new GParagraph("Welcome to the help Menu", 160, 100);
		 para.setFont("Arial-45");
		 para.setColor(Color.black);
		 
		 help = new GParagraph("Making the player move", 10,200);
		 help.setFont("Arial-20");
		 help.setColor(Color.black);
		 
		 
		 

		 goBack = new GButton("Return to Menu", 0, 0, 100, 25);
		 goBack.setFillColor(Color.green);
		 }
	 
	
	  @Override public void showContents() { 
		  helpProgram.add(para); 
		  helpProgram.add(goBack); 
		  helpProgram.add(help);
		  
		  
	  }
	  
	  @Override public void hideContents() { 
		  helpProgram.remove(para);
		  helpProgram.remove(goBack); }
	  
	  @Override public void mousePressed(MouseEvent e) {
	  GObject obj = helpProgram.getElementAt(e.getX(), e.getY());
	  if (obj == goBack) {
	  helpProgram.switchToMenu(); } }

	 }


