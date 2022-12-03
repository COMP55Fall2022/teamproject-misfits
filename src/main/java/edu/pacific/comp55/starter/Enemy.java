package edu.pacific.comp55.starter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import acm.graphics.*;
import java.util.concurrent.*;

public class Enemy extends GImage {
	
	int health;
	int moveSpeed;
	int jumpPower;
	int attackDamage;
	boolean isParrying = false;
	boolean isAttacking = false;
	int attackCD = 1; //(seconds)
	
	

	//You're gonna need to include all these values when creating an enemy, that way it
	//stays customizable, I don't want to hard code any of this inn case we want to switch things around
	
	public Enemy(String playerModel, double width, double height,int health,int attackDamage, int moveSpeed, int jumpPower) {
		super(playerModel, width, height);
		this.health = health;
		this.attackDamage = attackDamage;
		this.jumpPower = jumpPower;
		this.moveSpeed = moveSpeed;
		System.out.println("Enemy created");
	}
	
	public int takeDamage(int dmg) {
		health -=dmg;
		System.out.println(health);
		return dmg;
	}
	
	public void attack() {
		if (!isAttacking) {
			isAttacking = true;
		}
			
	}
	
	public void jump(int jumpPower) {
		
	}

}
