package edu.pacific.comp55.starter;
import acm.graphics.GImage;
import acm.program.GraphicsProgram;

import acm.graphics.*;


	public class Environment extends GraphicsProgram{
		
		GImage cloud = new GImage("media/cumulus-cloud-3.jpg",0,0);

		public void init() {
			setSize(1920,1080);
			requestFocus();
		}
		
		public void run() {
			cloud.setSize(1920,1080);
			add(cloud);
		}
		
		
	
	
	public void setBackground( ){
		
	}
	
	
	public void setClouds( ) {
		
		
	}
	
	public void moveClouds( ) {
		
	}
	
	
	public static void main(String[] args) {
		new Environment().start();
	}

}

