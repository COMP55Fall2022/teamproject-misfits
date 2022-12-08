package edu.pacific.comp55.starter;

import java.awt.Color;
import java.awt.event.MouseEvent;



import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.graphics.GObject;
import acm.graphics.GRect;
import javafx.scene.text.Font;

public class Help extends GraphicsPane {

	 private Game helpProgram; 	  
	 private GLabel para; 
	 private GButton goBack;
	 private GLabel help;
	 private GLabel leftMove;
	 private GLabel rightMove;
	 private GImage helpBack;
	 private GLabel jump;
	 private GLabel attack;
	 private GParagraph play;
	  
	  
	 public Help(Game app) { 
		 this.helpProgram = app; 
		 helpBack = new GImage("media/LevelCleared.png",-60, -900);
		 helpBack.setSize(1000, 2000);
		 
		 para = new GLabel("Welcome To The Help Menu", 160, 100);
		 para.setFont("Arial-45");
		 para.setColor(Color.black);
		 
		 play = new GParagraph( "Lets fight! In each level you will encounter a varrying number of enemies which will enter the level. \nYour objective is to"
		 		+ " attack and kill the enemies"
		 		+ " before they attack and kill you. If you succeed, you \nwill be able to upgrade your attack method and move on to the next level.", 10, 200);
		 play.setFont("Arial-20");
		 play.setColor(Color.black);
		 
		 
		 
		 help = new GLabel("Making the player move and attacking the enemy", 10,300);
		 help.setFont("Arial-bold-20");
		 help.setColor(Color.black);
		 
		 leftMove = new GLabel("Move player left: press left arrow key", 10,330);
		 leftMove.setFont("Arial-15");		 
		 leftMove.setColor(Color.black);
		 rightMove = new GLabel ("Move player right: press right arrow key", 10, 350);
		 rightMove.setFont("Arial-15");		 
		 rightMove.setColor(Color.black);
		 jump = new GLabel("Make player jump: press up arrow key", 10,370);
		 jump.setFont("Arial-15");		 
		 jump.setColor(Color.black);
		 attack = new GLabel ("Attack Enemy: press z key", 10, 390);
		 attack.setFont("Arial-15");		 
		 attack.setColor(Color.black);
		 

		 goBack = new GButton("Return to Menu", 0, 0, 100, 25);
		 goBack.setFillColor(Color.green);
		 }
	 
	
	  @Override public void showContents() { 
		  helpProgram.add(helpBack);
		  helpProgram.add(para); 
		  helpProgram.add(play);
		  helpProgram.add(goBack); 
		  helpProgram.add(help);
		  helpProgram.add(leftMove);
		  helpProgram.add(rightMove);
		  helpProgram.add(jump);
		  helpProgram.add(attack);
		  
	  }
	  
	  @Override public void hideContents() { 
		  helpProgram.remove(para);
		  helpProgram.remove(play);
		  helpProgram.remove(goBack);
		  helpProgram.remove(helpBack);
		  helpProgram.remove(help);
		  helpProgram.remove(leftMove);
		  helpProgram.remove(rightMove);
		  helpProgram.remove(jump);
		  helpProgram.remove(attack);
		  }
	  
	  @Override public void mousePressed(MouseEvent e) {
	  GObject obj = helpProgram.getElementAt(e.getX(), e.getY());
	  if (obj == goBack) {
	  helpProgram.switchToMenu(); } }

	 }


