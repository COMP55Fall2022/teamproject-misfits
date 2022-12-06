package edu.pacific.comp55.starter;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.Arrays;

import javax.swing.*;

import acm.graphics.GObject;

public class Level extends GraphicsPane implements ActionListener{
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
	//private Game pauseMenu;
	private Player player;
	private Game mainScreen;
	private HUD playerHud;
	private HUD healthB;
	//private GObject Environment;
	int health = 200;
	private Environment environment;
	
	public Level(Game program) {
		mainScreen = program;
		player = new Player("media/Turtle/onigiri_color_idle.png", 150, 150, 5, 5, 2, 5);
		player.move(200, 200);
		playerHud = new HUD(20, 50, 200, 25); //creating health bar
		playerHud.setFillColor(Color.RED);
		playerHud.setFilled(true);
		health -= 50;//declines current health(green bar) THIS JUST TESTS THAT IT DECLINES. FUNCTIONALITY STILL NEEDED FOR WHEN BEING HIT.
		healthB = new HUD(20, 50, health, 25);//creating current health bar(green bar)
		healthB.clamp(0, 0, 100); // clamps health bar so it doesn't shift and instead shrinks	
		healthB.setFillColor(Color.green);
		healthB.setFilled(true);
		exitToMenu = new GButton("Exit", 20, 20, 50, 20, Color.white);
		environment = new Environment (program, "media/collection-mountain-scenery-for-game-background-vector-14922765.jpg",0,0);
	}
	
	

//	public void Pause(Game app) {
//		this.pauseMenu = app;
//		exitToMenu = new GButton("Return to Menu", 300, 200, 200, 50);
//		exitToMenu.setFillColor(Color.red);
//		
//	}
	
	@Override 
	public void showContents() { 
		environment.showEnvironment();
		mainScreen.add(player);
		mainScreen.add(exitToMenu); 
		mainScreen.add(playerHud);
		mainScreen.add(healthB);
		//mainScreen.add(Environment);
	}
	  
	@Override 
	public void hideContents() { 
		mainScreen.remove(player);
		mainScreen.remove(exitToMenu); 
		mainScreen.remove(playerHud);
		mainScreen.remove(healthB);
		environment.hideEnvironment();
	}
	
	@Override 
	public void mousePressed(MouseEvent e) {
		  GObject obj = mainScreen.getElementAt(e.getX(), e.getY());
		  if (obj ==  exitToMenu) {
			  mainScreen.switchToMenu(); 
		  }
	}
	
	public void keyPressed(KeyEvent e){
		int key = e.getKeyCode();
		player.dy=0;
		player.dx=0;
		
		switch(key) {
		case (KeyEvent.VK_RIGHT): //Right movement
		
		System.out.println("Right pressed");
		
		player.dx+=player.moveSpeed;
		break;
		
		case(KeyEvent.VK_LEFT): //Left Movement
		//player.move(-player.moveSpeed, 0);
		System.out.println("Left Pressed");
		player.dx-=player.moveSpeed;

		
		break;
		
		case(KeyEvent.VK_Z): //Attack
			player.attack();
		break;
		
		case(KeyEvent.VK_UP):
			player.jump(1);
		break;
		}
		
	}
	
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		player.dy=0;
		player.dx=0;
		
		switch(key) {
		case (KeyEvent.VK_RIGHT): //Right movement
		
		System.out.println("Right Released");
		
		player.dx=0;
		break;
		
		case(KeyEvent.VK_LEFT): //Left Movement
		//player.move(-player.moveSpeed, 0);
		System.out.println("Left Released");
		player.dx=0;

		break;
		}
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
	
	public void run() {
		
	}
}
