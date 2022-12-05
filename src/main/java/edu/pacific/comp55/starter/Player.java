package edu.pacific.comp55.starter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import acm.graphics.*;
import java.util.concurrent.*;

public class Player extends GImage {
	
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
	

	//You're gonna need to include all these values when creating the player, that way it
	//stays customizable, I don't want to hard code any of this inn case we want to switch things around
	
	public Player(String playerModel, double width, double height,int health,int attackDamage, int moveSpeed, int jumpPower) {
		super(playerModel, width, height);
		this.health = health;
		this.attackDamage = attackDamage;
		this.jumpPower = jumpPower;
		this.moveSpeed = moveSpeed;
		System.out.println("Player created");
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
	
	public void tick() {
		x+=dx;
		y+=dy;
	}

}
