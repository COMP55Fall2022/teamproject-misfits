package edu.pacific.comp55.starter;

import java.awt.event.MouseEvent;



import acm.graphics.GImage;
import acm.graphics.GObject;

public class Help extends Display {

	 private Game program; // you will use program to get access to 
	  //all of the GraphicsProgram calls
	  
	  private GImage img; 
	  private GParagraph para;
	  
	 public Help(Game app) { 
	this.program = app; 
	//img = new GImage("robot head.jpg", 100, 100); 
	para = new GParagraph("Welcome to the Help Menu.", 150, 300);
	  para.setFont("Arial-24"); }
	  
	  @Override public void showContents() {
		//  program.add(img); 
		  program.add(para); }
	  
	  @Override public void hideContents() {
		  //program.remove(img);
	  program.remove(para); }
	  
	  @Override public void mousePressed(MouseEvent e) {
	 //para.setText("you need\nto click\non the eyes\nto go back"); 
	 // GObject obj =	  program.getElementAt(e.getX(), e.getY()); if (obj == img) {
	  //program.switchToMenu(); } 
		  }

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	 }


