package edu.pacific.comp55.starter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class Level implements ActionListener {
	int currentLevel;
	int enemiesKilled;
	int enemiesRemaining;
	int damageDealt;
	//private Level addPlayer;
	int windowHeight;
	int windowWidth;
	Timer addEnemy = new Timer(1000, this);
	Timer attack = new Timer(1000, this);
	
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
	
	public void getNumberOfEnemies() {
		
	}
	
	public void attack() {
		attack.setInitialDelay(0);
		attack.start();
		
		
	}
	
	public void addAnEnemy() {
		addEnemy.setInitialDelay(2000);
		addEnemy.start();
		
		enemiesRemaining--;
		enemiesKilled++;
		
	}
	
	public void moveAllEnemies() {
		
	}
	
	public void resetLevelStats() {
		
	}
	
	public void populateEnemyArray() {
		int[] enemyArray;
	}
	
	public void clearEnemyArray() {
		
	}
	
	public static void run(String[] args) {
		
	}

	
	
}
