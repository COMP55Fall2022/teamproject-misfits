package edu.pacific.comp55.starter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import acm.graphics.*;
import java.util.concurrent.*;
import javax.swing.Timer;

public class Player extends GImage implements ActionListener {
	
	int health;
	int moveSpeed;
	int jumpPower;
	int attackDamage;
	boolean isParrying = false;
	boolean isAttacking = false;
	int attackCD = 1; //(seconds)
	
	public static int dx;
	public static int dy;
	public static int x;
	public static int y;
	
	public Timer movementTimer;
	int count = 0;


	//You're gonna need to include all these values when creating the player, that way it
	//stays customizable, I don't want to hard code any of this inn case we want to switch things around
	
	public Player(String playerModel, double width, double height,int health,int attackDamage, int moveSpeed, int jumpPower) {
		super(playerModel, width, height);
		this.health = health;
		this.attackDamage = attackDamage;
		this.jumpPower = jumpPower;
		this.moveSpeed = moveSpeed;
		movementTimer = new Timer(10,this);
		System.out.println("Player created");
		movementTimer.start();
	}
	
	public void takeDamage(int dmg) {
		health -=dmg;
		System.out.println(health);
	}
	
	public void attack() {
		if (!isAttacking) {
			isAttacking = true;
			try {
				Thread.sleep(attackCD * 1000);
				isAttacking = false;

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void parry() {
		
	}
	
	public void jump(int jumpPower) {
		
	}
	
	public void updatePos() {
		x+=dx;
		y+=dy;
		this.move(x,y);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if (source ==movementTimer) {
			count++;
			System.out.println(count);
			this.updatePos();
			
		}
	}

}


