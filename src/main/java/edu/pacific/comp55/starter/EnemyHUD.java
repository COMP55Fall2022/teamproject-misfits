package edu.pacific.comp55.starter;
import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GImage;
import acm.graphics.GObject;
import acm.graphics.GRect;

public class EnemyHUD extends Display {
	
	private Game ehudProgram; // you will use program to get access to 
	  //all of the GraphicsProgram calls
	  
	  private GImage img; 
	  private GParagraph para;
	  private GRect rect;
	  private GRect healthB;
	  public static int HEALTH = 200;


	  public EnemyHUD(Game app) {
		  super();
		  ehudProgram = app;
		  //TEST TO SHOW 2 DIFFERENT BARS
		  
		  HEALTH = EnemyHUD.clamp(HEALTH, 0, 200);
		  HEALTH -= 70;
	
		  
		  rect = new GRect(200,25);
		  rect.setLocation(570, 50);
		  rect.setColor(Color.orange);
		  rect.setFilled(true);
		  
		  
		  healthB = new GRect(HEALTH,25);
		  healthB.setLocation(570, 50);
		  healthB.setColor(Color.blue);
		  healthB.setFilled(true);
		  
	  }

	  public static int clamp(int val, int min, int max ) {
			return Math.max(min, Math.min(max,val));
		}
	  
	  
	  
	  @Override
	  public void showContents() {
		  ehudProgram.add(rect);
		  
		  ehudProgram.add(healthB);
		  
		  
	  }

	  @Override
	  public void hideContents() {
		  
	  }



	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	  
	}
		
	
	 }
