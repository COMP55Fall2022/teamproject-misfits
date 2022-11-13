package edu.pacific.comp55.starter;

import java.awt.Color;
import java.awt.event.MouseEvent;



import acm.graphics.GImage;
import acm.graphics.GObject;

public class Help extends Display {

	 private Game helpProgram; // you will use program to get access to 
	  //all of the GraphicsProgram calls
	  
	   
	  private GParagraph para; 
	  private GButton goBack;
	  
	 public Help(Game app) { 
		 this.helpProgram = app; 
		 para = new GParagraph("Welcome to the help Menu", 250, 100);
		 para.setFont("Arial-24"); 

		 goBack = new GButton("Return to Menu", 300, 200, 200, 50);
		 goBack.setFillColor(Color.yellow);
		 }
	  
	  @Override public void showContents() { 
		  helpProgram.add(goBack); 
		  helpProgram.add(para); }
	  
	  @Override public void hideContents() { 
		  helpProgram.remove(goBack);
		  helpProgram.remove(para); }
	  
	  @Override public void mousePressed(MouseEvent e) {
	  GObject obj = helpProgram.getElementAt(e.getX(), e.getY());
	  if (obj == goBack) {
	  helpProgram.switchToMenu(); } }

	  @Override
		public void run() {
			// TODO Auto-generated method stub
			
		}

	 }


