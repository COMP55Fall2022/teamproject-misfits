package edu.pacific.comp55.starter;

import java.awt.event.KeyEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferStrategy;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Handler;

import acm.graphics.*;
import acm.program.*;
import java.awt.*;
import acm.util.*;
import java.awt.Canvas;


public class Game extends Canvas implements Runnable{
	private static final long serialVersionUID = 1L;
	
	public static final int Width = 640, Height = Width/12*9;

	String title = "Turtle Samurai";
	private Thread thread;
	private boolean running = false;
	
	private Hander handler;
	
	private PlayerHUD playerHud;
	private StartMenu menu;
	
	public enum state{
		Menu,
		Game
	};
	
	public state gameState = state.Menu;
	
	public Game() {
		handler = new Hander();
		menu = new StartMenu(this, handler);
		
		this.addMouseListener(menu);
		
		new Window(Width, Height, title, this); 
				
		//testing for now to add a player object to screen to i can test my menu screen
		playerHud = new PlayerHUD();
		
		if(gameState == state.Game) {
			
		handler.addObject(new PlayerObject(200, 200,ID.playerID,handler));
		}}
	
	
	public synchronized void start() {
		thread  = new Thread(this);
		thread.start();
		running = true;
	}
	
	public static int clamp(int val, int min, int max ) {
		return Math.max(min, Math.min(max,val));
	}
	
	public synchronized void stop() {
		try {
			thread.join();
			running = false;
		}catch(Exception e){
			e.printStackTrace();
			
		}
		
	}
	
	
	public void run() {
		long lastTime = System.nanoTime();
	double amountOfTicks = 60.0;
	double ns = 1000000000 / amountOfTicks;
	double delta = 0;
	long timer = System.currentTimeMillis();
	int frames = 0;
	while(running) {
		long now = System.nanoTime();
		delta += (now-lastTime)/ns;
		lastTime = now;
		while(delta >= 1) {
			tick();
			delta--;
		}
		if(running) {
			render();
		frames++;
		}
		if(System.currentTimeMillis() - timer > 1000) {
			timer += 1000;
			System.out.println("FPS: " + frames);
			frames = 0;
			}
		
		}
	stop();
	}
	
	private void tick(){
		handler.tick();
		
		if(gameState == state.Game) {
			playerHud.tick();
		}else if(gameState == state.Menu)
			menu.tick();
		}
		
		
		
	
	
	private void render() {
		
	BufferStrategy bs = this.getBufferStrategy();
	if(bs == null) {
		this.createBufferStrategy(3);
	return;}
	
	Graphics g = bs.getDrawGraphics();
	g.setColor(Color.blue);
	g.fillRect(0, 0, Width, Height);
	
	
	handler.render(g);
	
	if(gameState == state.Game) 
	{
		playerHud.render(g);
	}else if(gameState == state.Menu)
		menu.render(g);
	

	g.dispose();
	bs.show();
	}
	
	public void startGame(){
		
		playerHud = new PlayerHUD();
	}
	
	public static void main(String[] args) {
		new Game();
		
		
	}


}
