package edu.pacific.comp55.starter;

import java.awt.Color;
import acm.graphics.GCanvas;
import acm.graphics.GRect;

public class Game extends GraphicsApplication implements Runnable {

	public static final int WINDOW_WIDTH = 900;
	public static final int WINDOW_HEIGHT = 650;
	public static final String MUSIC_FOLDER = "sounds";
	private static final String[] SOUND_FILES = { "Dreaming-of-Fuji.mp3" };

	private Help gameHelp;
	private StartMenu menu;
	private int count;
	private Level level;
	private LevelSelector levelMenu;
	private Popups popUps;

	boolean running = true;
	boolean win;

	public void run() {

	}

	public void init() {
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		menu = new StartMenu(this);
		gameHelp = new Help(this);
		level = new Level(this);
		levelMenu = new LevelSelector(this);
		
		setupInteractions();
		switchToMenu();
	}

	public void switchToMenu() {
		playMusic();
		count++;
		switchToScreen(menu);
	}

	public void switchToLevel() {
		playMusic();
		switchToScreen(levelMenu);
	}

	public void switchToMainScreen() {
		switchToScreen(level);
	}

	public void switchToPopups(boolean win) {
		popUps = new Popups(this, win);
		switchToScreen(popUps);
	}

	public void switchToHelp() {
		switchToScreen(gameHelp);
	}

	private void playMusic() {
		AudioPlayer audio = AudioPlayer.getInstance();
		audio.playSound(MUSIC_FOLDER, SOUND_FILES[count % SOUND_FILES.length]);
	}

	public static void main(String[] args) {
		new Game().start();
	}
}
