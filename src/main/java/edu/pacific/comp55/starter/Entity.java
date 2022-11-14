package edu.pacific.comp55.starter;

import acm.graphics.*;
import acm.program.*;
import java.awt.*;
import acm.util.*;

import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;



//Base values for the entity class
public class Entity extends GraphicsProgram implements ActionListener{
	int health;
	int attackDamage;
	int moveSpeed;
	int jumpPower;
	boolean isParrying=false;
	boolean isAttacking=false;
	boolean attackDebounce=false;
	
	GImage playerModel = new GImage("media/idle_Onigiri.png",250,250);

	
	
	
	
	//ENTITY CLASS CONSTRUCTOR

	public Entity(int HP,int AD,int MS,int JP) {
		//setting up the entity's attributes
		health = HP;
		attackDamage = AD;
		moveSpeed = MS;
		jumpPower = JP;
	}
	
	public void run() {
		playerModel.setSize(300,300);
		add(playerModel);
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("keyPressed");
		System.out.println(e.getKeyCode());
		int keyCode = e.getKeyCode();
		switch(keyCode) {

		case KeyEvent.VK_LEFT:
			if ((playerModel.getX()>=-100)){
			playerModel.move(-10, 0);
			}
			else {
				playerModel.move(10, 0);
			}
			break;
		
		case KeyEvent.VK_RIGHT:
			if ((playerModel.getX()<=1350)){
				playerModel.move(10, 0);
				}
				else {
					playerModel.move(-10, 0);
				}
			break;
	
		}
	}
	
	/*@Override
	public void keyReleased(KeyEvent e) {
		if(curScreen != null) {
			curScreen.keyReleased(e);
		}
	}
	*/
	

}


