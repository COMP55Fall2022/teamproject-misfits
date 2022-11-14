package edu.pacific.comp55.starter;

import java.awt.event.KeyEvent;

public class Player extends Entity {

	public Player(int HP, int AD, int MS, int JP, String playerModel) {
		super(HP, AD, MS, JP,playerModel);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("keyPressed");
		System.out.println(e.getKeyCode());
		int keyCode = e.getKeyCode();
		switch(keyCode) {

		case KeyEvent.VK_LEFT:
			if ((playerModel.getX()>=-100)){
			playerModel.move(-10, 0);
			}
			else {
				playerModel.move(10, 0);
			}
			break;
		
		case KeyEvent.VK_RIGHT:
			if ((playerModel.getX()<=1350)){
				playerModel.move(10, 0);
				}
				else {
					playerModel.move(-10, 0);
				}
			break;
	
		}
	}
	
	public void takeDamage(int dmg) {
		health -=dmg;
		System.out.println(health);
	}
	
	public void attack() {
		
	}
	
	public void parry() {
		
	}
	
	public void jump(int jumpPower) {
		
	}
	

public static void main(String[] args) {
	
}
}
