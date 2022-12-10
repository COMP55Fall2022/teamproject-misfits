package edu.pacific.comp55.starter;
import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GImage;
import acm.graphics.GObject;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class HUD extends GRect {

	  public static int HEALTH = 200;
	  public int clamp;
	
	  public HUD(double x, double y, double width, double height) {
		super(x, y, width, height);
		}
	  public void clamp(int val, int min, int max) { //clamps the healthbar so that it doesnt shift
		  											//but instead declines
		 		  
		  
		  clamp =  Math.max(min, Math.min(max,val));
		  
	  }	  

}	  


	 

	
