package edu.pacific.comp55.starter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import acm.graphics.*;
import java.util.concurrent.*;

import javax.swing.Timer;

public class Enemy extends GImage implements ActionListener {
	
	int health;
	int moveSpeed;
	int jumpPower;
	int attackDamage;
	boolean isParrying = false;
	boolean isAttacking = false;
	int attackCD = 1; //(seconds)
	Timer enemyLoop = new Timer(10,this);
	Timer attackLoop = new Timer(400,this);
	Player target;
	
	

	//You're gonna need to include all these values when creating an enemy, that way it
	//stays customizable, I don't want to hard code any of this inn case we want to switch things around
	
	public Enemy(String playerModel, double width, double height,int health,int attackDamage, int moveSpeed, int jumpPower,Player target) {
		super(playerModel, width, height);
		this.health = health;
		this.attackDamage = attackDamage;
		this.jumpPower = jumpPower;
		this.moveSpeed = moveSpeed;
		this.setBounds(this.getX(), this.getHeight(), width, height);
		System.out.println("Enemy created");
		this.target = target;
		enemyLoop.start();
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
	
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		
		if (source==enemyLoop) {
			double targetPos = target.getX();
			double enemyPos = this.getX();
			double magnitude = targetPos - enemyPos;
			if (magnitude >100) {
				this.move(.5,0);
			}else {
				if (!isAttacking) {
					attack();
				}
			}
		}
		
	}


}
