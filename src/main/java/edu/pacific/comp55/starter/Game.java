package edu.pacific.comp55.starter;
  
  import java.awt.Color;
  import acm.graphics.GCanvas; 
  import acm.graphics.GRect;
  
  
  public class Game extends GraphicsApplication implements Runnable{
  
  public static final int WINDOW_WIDTH = 900; 
  public static final int  WINDOW_HEIGHT = 650; 
  public static final String MUSIC_FOLDER = "sounds";
  private static final String[] SOUND_FILES = { "Dreaming-of-Fuji.mp3" };
  
  private Help gameHelp; 
  private StartMenu menu; 
  private int count; 
  private Level level;
  private LevelSelector levelMenu;
  
  
  boolean running = true;
  
  public void run() {
  
  init(); 
  
  int fps = 60; //number of frames per second. start of GAMELOOP
  double tickPerSecond = 1000000000/fps; 
  double delta = 0; 
  long now;
  long lastTime = System.nanoTime();
  
  while(running){
  
  now = System.nanoTime(); delta += (now - lastTime)/tickPerSecond; 
  lastTime =  now;
  tick();
  if(delta >= 1){
  
  render();
  delta--;
  }} }
  
private void tick() { // updates the movement of sprites
 // System.out.println("Tick");
  }

  
  private void render() { //displays the sprites
  
  }
  
  public void init(){ 
  setSize(WINDOW_WIDTH,WINDOW_HEIGHT); 
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
  switchToScreen(menu); }
  
  public void switchToLevel() { 
  playMusic(); 
  switchToScreen(levelMenu);
  }
  
  public void switchToMainScreen() {
		switchToScreen(level);
	}
  
  public void switchToHelp() { 
	  switchToScreen(gameHelp); }
  
  private void playMusic() { 
  AudioPlayer audio = AudioPlayer.getInstance(); 
  audio.playSound(MUSIC_FOLDER, SOUND_FILES[count % SOUND_FILES.length]); 
  }
  
   
  public static void main(String[] args) {
		new Game().start();
	}
}
