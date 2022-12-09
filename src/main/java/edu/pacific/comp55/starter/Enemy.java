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
	boolean onCooldown = false;
	boolean dead = false;
	int attackCD = 400; //(ms)
	public Timer enemyLoop = new Timer(10,this);
	Timer attackTimer = new Timer(400,this);
	Timer CD = new Timer(attackCD,this);
	Timer attemptAttack = new Timer(300,this);
	Player target;
	double height;
	double width;
	double targetPos;
	double enemyPos;
	double magnitude;
	
	AudioPlayer audio = AudioPlayer.getInstance(); 

	
	public Level level;
	
	private Level didWin;
	public boolean win = true;
	
	

	//You're gonna need to include all these values when creating an enemy, that way it
	//stays customizable, I don't want to hard code any of this inn case we want to switch things around
	
	public Enemy(String playerModel, double width, double height,int health,int attackDamage, int moveSpeed, int jumpPower,Player target,Level level) {
		super(playerModel, width, height);
		this.health = health;
		this.attackDamage = attackDamage;
		this.jumpPower = jumpPower;
		this.moveSpeed = moveSpeed;
		this.setBounds(this.getX(), this.getHeight(), width, height);
		this.height = height;
		this.width = width;
		System.out.println("Enemy created");
		this.target = target;
		this.level=level;
		this.dead = false;
		this.didWin = level;
		//enemyLoop.start();
	}
	
	public void startGame() {
		enemyLoop.start();
		this.dead = false;
		this.health = 200;
	}
	
	public int takeDamage(int dmg) {
		health -=dmg;
		System.out.println(health);
		this.move(-15, 0);
		if(this.health<=0) {
			this.dead = true;
			level.removeEnemy(this);
			didWin.didNotWin(dead);
		}
		return dmg;
	}
	
	public void attack() {
		if (!isAttacking && !onCooldown) {
			isAttacking = true;
			onCooldown = true;
			this.setImage("media/Ogre/Ogre_Attack2.png");
			this.setBounds(this.getX(), this.getY(), width, height);
			attemptAttack.start();
			attackTimer.start();
		}
			
	}
	
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		
		if (source==enemyLoop) {
			 targetPos = target.getX();
			 enemyPos = this.getX();
			 magnitude = targetPos - enemyPos;
			if (magnitude >120 || magnitude<70) {
				if (magnitude<70) {
					this.move(-1,0);
				}else {
					this.move(1,0);
				}
			}else {
				attack();
			}
		}
		
		if (source ==attackTimer) {
			this.setImage("media/Ogre/Ogre_Idle.png");
			this.setBounds(this.getX(), this.getY(), width, height);
			attackTimer.stop();
			isAttacking = false;
			CD.start();
		}
		
		if (source ==CD) {
			onCooldown = false;
			
			CD.stop();
		}
		
		if (source ==attemptAttack) {
			 targetPos = target.getX();
			 enemyPos = this.getX();
			 magnitude = targetPos - enemyPos;
			if (Math.abs(magnitude)>=90) {
				if (!target.takeDamageDebounce) {
				target.takeDamageDebounce = true;
				target.takeDamage(35);
				audio.playSound("sounds", "OgreImpact.mp3");
				
				attemptAttack.stop();
				}
			}
		}
		
	}


}
