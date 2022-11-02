package edu.pacific.comp55.starter;

import acm.graphics.*;

//Base values for the entity class
public class Entity {
	int health;
	int attackDamage;
	int moveSpeed;
	int jumpPower;
	boolean isParrying=false;
	boolean isAttacking=false;
	boolean attackDebounce=false;
	
	GImage playerModel = new GImage("55GroupProjectUML.jpg");
	
	
	
	
	//ENTITY CLASS CONSTRUCTOR

	public Entity(int HP,int AD,int MS,int JP) {
		//setting up the entity's attributes
		health = HP;
		attackDamage = AD;
		moveSpeed = MS;
		jumpPower = JP;
	}
	
	public void drawPlayermodel() {
		
	}

	
	
}


