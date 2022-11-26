package edu.pacific.comp55.starter;

import java.awt.Color;

import acm.graphics.GCanvas;
import acm.graphics.GRect;

public class Game extends GraphicsApplication {
	public static final int WINDOW_WIDTH = 800;
	public static final int WINDOW_HEIGHT = 600;
	public static final String MUSIC_FOLDER = "sounds";
	private static final String[] SOUND_FILES = { "Dreaming-of-Fuji.mp3" };

	private HUD somePane;
	private EnemyHUD enemyH;
	private Help gameHelp;
	private StartMenu menu;
	private int count;
	private GRect backG;
	private Level level;
	//private Player player;
	
	

	public void init() {
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		
	}

	public void run() {
		
		//backG = new GRect(WINDOW_WIDTH, WINDOW_HEIGHT);
		//backG.setColor(Color.black);
		//backG.setFilled(true);
		//add(backG);
		//player = new Player("media/idle_Onigiri.png", 250, 250, 5, 5, 5, 5);
		//add(player);
		//somePane = new HUD(this);
		//enemyH = new EnemyHUD(this);
		menu = new StartMenu(this);
		gameHelp = new Help(this);
		level = new Level(this);
		setupInteractions();
		switchToMenu();
	}

	public void switchToMenu() {
		playRandomSound();
		count++;
		switchToScreen(menu);
	}

	public void switchToLevel() {
		playRandomSound();
		switchToScreen(level);
		
	}
	
	public void switchToHelp() {
		switchToScreen(gameHelp);
	}

	private void playRandomSound() {
		AudioPlayer audio = AudioPlayer.getInstance();
		audio.playSound(MUSIC_FOLDER, SOUND_FILES[count % SOUND_FILES.length]);
	}
	
	public static void main(String[] args) {
		//test
		new Game().start();
	}
}
