package edu.pacific.comp55.starter;
import acm.graphics.GImage;
import java.util.Date; 
import acm.program.GraphicsProgram;
import acm.graphics.*;
import java.lang.Thread;


	public class Environment extends GraphicsProgram{
		
		
		int x = 800;
		int y = 0;
		int velocity = -50;
		int BREAK_MS = 30;
		
		
		//placeholder for background
		//sets location x,y where the image should be "drawn"
		GImage background = new GImage("media/collection-mountain-scenery-for-game-background-vector-14922765.jpg",0,0);
		
		
		
		//placeholder for cloud image, trying to make clouds move across.
		//sets location of x,y where the image should be "drawn"
		GImage cloud = new GImage("media/cumulus-cloud-3.jpg", x, y);
		
		
		
		public void init() {

		    setSize(1000, 1000);


		}
		
		
		public void run() {
			background.setSize(1000,1000);
			add(background);
			cloud.setSize(100,100);
			add(cloud);
			moveClouds();
		}
		
	
	
		
		
		
		
		//Moving clouds across background, it just uses the same cloud over and over again, once the letter i hits the borderline window we change that same 
		//clouds x coordinate 1050 on the right side of the screen so it can slowly come back in screen, imitating animation
		
	public void moveClouds() {
		int i = 0;
		while(true){
				
				
				cloud.move(velocity, 0);
				i=i+1;
				if (i==19) {
					cloud.move(1050,0);
					i=0;
				}
				
				try {
					Thread.sleep(600);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				}
			}
	
	
	
		
	
	
	public static void main(String[] args) {
		new Environment().start();
	}

}

