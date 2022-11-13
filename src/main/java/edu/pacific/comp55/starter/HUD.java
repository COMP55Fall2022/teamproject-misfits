package edu.pacific.comp55.starter;
import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GImage;
import acm.graphics.GObject;
import acm.graphics.GRect;

public class HUD extends Display {
	
	private Game hudProgram; // you will use program to get access to 
	  //all of the GraphicsProgram calls
	  
	  private GImage img; 
	  private GParagraph para;
	  private GRect rect;
	  private GRect healthB;
	  

	  public HUD(Game app) {
		  super();
		  hudProgram = app;
		  
		  rect = new GRect(200,25);
		  rect.setColor(Color.red);
		  rect.setFilled(true);
		  
		  healthB = new GRect(190,25);
		  healthB.setColor(Color.green);
		  healthB.setFilled(true);
		  
		  


	  }

	  @Override
	  public void showContents() {
		  hudProgram.add(rect);
		  hudProgram.add(healthB);
	  }

	  @Override
	  public void hideContents() {
	  }


		/*
		 * private void healthBar(){ rect = new GRect(10,100); rect.setColor(Color.red);
		 * rect.setFilled(true); add(rect); }
		 */	// TODO Auto-generated method stub

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	  
	}
		
	
	 }
