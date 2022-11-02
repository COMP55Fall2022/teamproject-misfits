package edu.pacific.comp55.starter;

import acm.graphics.*;
import acm.program.*;
import java.awt.*;
import acm.util.*;


//Base values for the entity class
public class Entity extends GraphicsProgram{
	int health;
	int attackDamage;
	int moveSpeed;
	int jumpPower;
	boolean isParrying=false;
	boolean isAttacking=false;
	boolean attackDebounce=false;
	
	GImage playerModel = new GImage("media/idle_Onigiri.png",250,250);

	public void init() {
		setSize(1920,1080);
		requestFocus();
	}
	
	
	
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

	
	


	public static void main(String[] args) {
		new Entity(5,5,5,5).start();
	}

}


