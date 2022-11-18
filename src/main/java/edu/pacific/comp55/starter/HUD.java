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
	  public static int HEALTH = 200;


	  public HUD(Game app) {
		  super();
		  hudProgram = app;
		  HEALTH -=10;//TEST TO SHOW 2 DIFFERENT BARS
		  
		  HEALTH = HUD.clamp(HEALTH, 0, 200);
		  
		  rect = new GRect(200,25);
		  rect.setLocation(10, 50);
		  rect.setColor(Color.red);
		  rect.setFilled(true);
		  
		  
		  healthB = new GRect(190,25);
		  healthB.setLocation(10, 50);
		  healthB.setColor(Color.green);
		  healthB.setFilled(true);

	  }

	  public static int clamp(int val, int min, int max ) {
			return Math.max(min, Math.min(max,val));
		}
	  
	  @Override
	  public void showContents() {
		  hudProgram.add(rect);
		  
		  hudProgram.add(healthB);
		  
		  
	  }

	  @Override
	  public void hideContents() {
		  
	  }



	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	  
	}
		
	
	 }
