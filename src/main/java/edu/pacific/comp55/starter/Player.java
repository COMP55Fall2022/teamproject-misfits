package edu.pacific.comp55.starter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import acm.graphics.*;

import java.util.TimerTask;
import java.util.concurrent.*;
import javax.swing.Timer;

public class Player extends GImage implements ActionListener {
	
	int health;
	int moveSpeed;
	int jumpPower;
	int attackDamage;
	boolean isParrying = false;
	boolean isAttacking = false;
	boolean isJumping = false;
	boolean onGround = true;
	int attackCD = 1; //(seconds)
	double height;
	double width;
	
	public  int dx;
	public  int dy;
	public  int x;
	public  int y;
	
	public Timer movementTimer;
	public Timer attackReset;
	public Timer jumpTimer = new Timer(10,this);
	int jumpCount = 0;
	int gravityEffect = 4;

	//You're gonna need to include all these values when creating the player, that way it
	//stays customizable, I don't want to hard code any of this inn case we want to switch things around
	
	public Player(String playerModel, double width, double height,int health,int attackDamage, int moveSpeed, int jumpPower) {
		super(playerModel, width, height);
		this.health = health;
		this.attackDamage = attackDamage;
		this.jumpPower = jumpPower;
		this.moveSpeed = moveSpeed;
		this.height = height;
		this.width = width;
		movementTimer = new Timer(10,this);
		attackReset = new Timer(300,this);
		this.setBounds(this.getX(), this.getY(), width, height);
		System.out.println("Player created");
		movementTimer.start();
	}
	
	
	public void takeDamage(int dmg) {
		health -=dmg;
		System.out.println(health);
	}
	
	public void attack() {
		if (!isAttacking) {
		this.isAttacking = true;
		this.setImage("media/Turtle/onigiri_action2.png");
		this.setBounds(this.getX(), this.getY(), this.width, this.height);
		attackReset.start();
		}
	}
	
	public void parry() {
		
	}
	
		
	public void jump() {
		if(!isJumping && onGround) {
		this.isJumping = true;
		jumpTimer.start();
		}
	}
	
	public void updatePos() {
		x+=dx;
		y+=dy;
	}
	
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if (source ==movementTimer) {
			if (this.getX()<800) {
				this.updatePos();
				this.move(dx,dy);
			}else {
				this.move(dx-4,0);
			}
			if(this.getX()>-20) {
				this.updatePos();
				this.move(dx,dy);

			}else {
				this.move(dx+4,0);
			}
			
			//gravity, keep this man on the ground!
			
			if(this.getY()<350) {
				this.move(0,this.gravityEffect);
				this.onGround = false;
			}else {
				this.onGround = true;
			}
		}
			//System.out.println(dx);
			//System.out.println(dy);
		if (source ==attackReset) {
			this.setImage("media/Turtle/onigiri_color_idle.png");
			this.setBounds(this.getX(),this.getY(),this.width,this.height);
			this.isAttacking = false;
			attackReset.stop();
		}
		
		if (source==jumpTimer) {
			if (jumpCount <20) {
			this.move(0, this.jumpPower*-1);
			jumpCount++;
			return;
			}
			jumpCount = 0;
			this.isJumping = false;
			jumpTimer.stop();
			
		}
		
	}
}



