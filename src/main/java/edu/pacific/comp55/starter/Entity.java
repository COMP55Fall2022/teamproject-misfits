package edu.pacific.comp55.starter;

//Base values for the entity class
public class Entity {
	int health;
	int attackDamage;
	int moveSpeed;
	int jumpPower=10;
	boolean isParrying=false;
	boolean isAttacking=false;
	boolean attackDebounce=false;
	
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


