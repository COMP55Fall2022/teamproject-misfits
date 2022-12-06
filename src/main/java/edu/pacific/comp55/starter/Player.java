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
	
	public  int dx;
	public  int dy;
	public  int x;
	public  int y;
	
	public Timer movementTimer;
	public Timer attackReset;
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
		attackReset = new Timer(100,this);
		System.out.println("Player created");
		movementTimer.start();
	}
	
	public void takeDamage(int dmg) {
		health -=dmg;
		System.out.println(health);
	}
	
	public void attack() {
		this.isAttacking = true;
		this.setImage("media/Turtle/onigiri_action.png");
		attackReset.start();
	}
	
	public void parry() {
		
	}
	
	public void jump(int jumpPower) {
		
	}
	
	public void updatePos() {
		x+=dx;
		y+=dy;
	}
	
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if (source ==movementTimer) {
			count++;
			this.updatePos();
			this.move(dx,dy);
			System.out.println(dx);
			System.out.println(dy);
		}
		if (source ==attackReset) {
			this.setImage("media/Turtle/onigiri_color_idle.png");
			attackReset.stop();
		}
	}

}


