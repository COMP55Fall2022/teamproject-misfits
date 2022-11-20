package edu.pacific.comp55.starter;
import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GImage;
import acm.graphics.GObject;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class HUD extends GRect {

	  private GImage img; 
	  private GParagraph para;
	  private GRect rect;
	  private GRect healthB;
	  public static int HEALTH = 200;
	
	  public HUD(double x, double y, double width, double height) {
		super(x, y, width, height);
		  
		  
		  healthB = new GRect(190,25);
		  healthB.setLocation(10, 50);
		  healthB.setColor(Color.green);
		  healthB.setFilled(true);

		// TODO Auto-generated constructor stub
	}

}
	//all of the GraphicsProgram calls
	  


	 

	
