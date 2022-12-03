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
  
  
  boolean running = true;
  
  public void run() {
  
  init(); 
  
  int fps = 60; //number of frames per second. 
  double tickPerSecond = 1000000000/fps; 
  double delta = 0; 
  long now;
  long lastTime = System.nanoTime();
  
  while(running){
  
  now = System.nanoTime(); delta += (now - lastTime)/tickPerSecond; 
  lastTime =  now;
  
  if(delta >= 1){
  
  tick(); 
  render();
  delta--;
  }} }
  
  private void tick() { // TODO Auto-generated method stub
  
  }
  
  private void render() { // TODO Auto-generated method stub
  
  }
  
  public void init(){ 
  setSize(WINDOW_WIDTH,WINDOW_HEIGHT); 
  menu = new StartMenu(this); 
  gameHelp = new Help(this); 
  level = new Level(this); 
  setupInteractions(); 
  switchToMenu();
  }
  
  
  public void switchToMenu() { 
  playRandomSound(); count++;
  switchToScreen(menu); }
  
  public void switchToLevel() { 
  playRandomSound(); 
  switchToScreen(level);
  }
  
  public void switchToHelp() { 
	  switchToScreen(gameHelp); }
  
  private void playRandomSound() { 
  AudioPlayer audio = AudioPlayer.getInstance(); 
  audio.playSound(MUSIC_FOLDER, SOUND_FILES[count % SOUND_FILES.length]); 
  }
  
   
  public static void main(String[] args) {
		new Game().start();
	}
}
