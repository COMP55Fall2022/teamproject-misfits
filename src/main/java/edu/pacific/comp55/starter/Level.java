package edu.pacific.comp55.starter;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.Arrays;

import javax.swing.*;

import acm.graphics.GObject;

public class Level extends Display{
	public int currentLevel;
	public int enemiesKilled;
	public int enemiesRemaining;
	public int damageDealt;
	public int attackDamage;
	//private Level addPlayer;
	//int windowHeight;
	//int windowWidth;
	Timer addEnemy = new Timer(1000, this);
	Timer attack = new Timer(1000, this);
	private GButton exitToMenu;
	private Game pauseMenu;
	private Player player;
	
	public void Pause(Game app) {
		this.pauseMenu = app;
		exitToMenu = new GButton("Return to Menu", 300, 200, 200, 50);
		exitToMenu.setFillColor(Color.red);
		
	}
	@Override 
	public void showContents() { 
		pauseMenu.add(exitToMenu); 
	}
	  
	@Override 
	public void hideContents() { 
		pauseMenu.remove(exitToMenu); 
	}
	
	@Override 
	public void mousePressed(MouseEvent e) {
		  GObject obj = pauseMenu.getElementAt(e.getX(), e.getY());
		  if (obj ==  exitToMenu) {
			  pauseMenu.switchToMenu(); 
		  }
	}
	
	public void keyPressed(KeyEvent e) {
		
	}
	
	public void keyReleased(KeyEvent e) {
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	
	
	public void setNumberOfEnemies(int N, int R) {
		this.enemiesKilled = N;
		this.enemiesRemaining = R;
	}
	
	public int getNumberOfEnemies() {
		return enemiesKilled;
	}
	
	public int getNumberOfEnemiesRem() {
		return enemiesRemaining;
	}
	
	public void attack() {
		attack.setInitialDelay(0);
		attack.start();
		
		
		String attackType = "";
		switch(attackType) {
		case "sword":
			this.attackDamage = 10;
			break;
		}
	}
	
	public void addAnEnemy() {
		addEnemy.setInitialDelay(2000);
		addEnemy.start();
		
		//Needs loop below
		setNumberOfEnemies(enemiesRemaining,enemiesKilled);
		enemiesRemaining--;
		enemiesKilled++;
		
	}

	public void moveAllEnemies() {
		
	}
	
	public void resetLevelStats() {
		
	}
	
	public void populateEnemyArray(String[] enemy) {
		String[] enemyArray = enemy;
		//System.out.println(enemyArray[1]);
		//System.out.println(enemyArray[0]);
		clearEnemyArray(enemyArray);
	}
	
	public static void clearEnemyArray(String[] E) {
		String[] enemyArray = E;
		Arrays.fill(enemyArray, null); //Clears enemy array/sets all elements in the array to null
		//System.out.println(enemyArray[0]);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		player = new Player("media/idle_Onigiri.png", 250, 250, 5, 5, 5, 5);
		add(player);
		
	}
	
	
	
}
