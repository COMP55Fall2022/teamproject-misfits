package edu.pacific.comp55.starter;
import acm.graphics.GImage;
import acm.program.GraphicsProgram;

import acm.graphics.*;


	public class Environment extends GraphicsProgram{
		
		
		int x = 800;
		int y = 0;
		int velocity = 75;
		int BREAK_MS = 30;
		
		//placeholder for background
		//sets location x,y where the image should be "drawn"
		
		GImage background = new GImage("media/collection-mountain-scenery-for-game-background-vector-14922765.jpg",0,0);
		
		
		
		//placeholder for cloud image, trying to make clouds move across.
		//sets location of x,y where the image should be "drawn"
		GImage cloud = new GImage("media/cumulus-cloud-3.jpg", x, y);
		
		
		
		
		public void run() {
			background.setSize(1000,1000);
			add(background);
			cloud.setSize(100,100);
			add(cloud);
			moveClouds();
		}
		
	
	
//	public void setClouds( ) {
//		
//		
//	}
	
		
	//okay its moving now, but its moving fast, and it seems to be stuck at two portions of the window for some reason.
		
	public void moveClouds() {
		
		while (true){
			
			cloud.move(velocity, 0);
			if(x>0) {
				x = x - velocity; 
				velocity *= -1;
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		new Environment().start();
	}

}

