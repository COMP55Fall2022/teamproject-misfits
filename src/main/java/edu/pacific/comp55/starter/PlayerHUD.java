package edu.pacific.comp55.starter;

import java.awt.Color;
import java.awt.Color.*;
import java.awt.Graphics;

import acm.graphics.GImage;

import java.awt.Graphics;

public class PlayerHUD {//player healthbar
	
	//- Playericon: GImage
	
	//-StatusEffect: GImage
	public static int HEALTH = 100;
	
	public void tick(){
	//test code to make sure my health bar changes in size
		HEALTH --;
		//stops health from declining past its borders
		HEALTH = Game.clamp(HEALTH,0,100);
	}
	
	
	
	public void render(Graphics g) {
		g.setColor(Color.red); 
		g.fillRect(15,15,200,32); // this will show in background when health is --
		g.setColor(Color.green);
		g.fillRect(15,15,HEALTH*2,32); // current health
		g.setColor(Color.black); // border around health for contrast
		g.drawRect(15,15,200,32);
		
		
		
	}

	
}
