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
	
	public void init() {
		setSize(1920,1080);
		requestFocus();
	}
	GImage playerModel = new GImage("",500,500);
	
	
	
	//ENTITY CLASS CONSTRUCTOR

	public Entity(int HP,int AD,int MS,int JP) {
		//setting up the entity's attributes
		health = HP;
		attackDamage = AD;
		moveSpeed = MS;
		jumpPower = JP;
	}
	
	public void run() {
		add(playerModel);
	}

	
	


	public static void main(String[] args) {
		new Entity(5,5,5,5).start();
	}

}


