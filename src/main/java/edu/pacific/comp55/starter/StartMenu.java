package edu.pacific.comp55.starter;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import edu.pacific.comp55.starter.Game.state;

public class StartMenu extends MouseAdapter{

	Game game;
	Hander handler;
	
	public StartMenu(Game game, Hander handler) {//creates start menu
		this.game = game;
		this.handler = handler;
	}
	
	public void mousePressed(MouseEvent e) {
		int xX = e.getX();
		int yY = e.getY();
		
		if(game.gameState == state.Menu) {
			if(mouseHover(xX, yY, 235, 150,175,64)) { //play box
				game.gameState = state.Game;
				handler.addObject(new PlayerObject(200, 200,ID.playerID,handler));
			}			
						
			if(mouseHover(xX, yY, 235, 250,175,64)) { //quit box
				System.exit(1);
			}
			
			if(mouseHover(xX, yY, 235, 350,175,64)) { //help box
				game.gameState = state.Help;
			}}
			
		else if(game.gameState == state.Help)	{
				if(mouseHover(xX, yY, 235, 350,175,64)) { 
					game.gameState = state.Menu;
				}
			}}
			

		
		
	
	
	public void mouseReleased(MouseEvent e) {
		
	}
	
	//this checks if our mouse is hovering over a selected box
	private boolean mouseHover(int xX, int yY, int x, int y, int width, int height) {
		if(xX > x && xX < x+width ) {
			if(yY > y && yY < y+height) {
			return true;	
			}else return false;
			}else return false;
		}
	
	public void tick() {//updates variables
		
	}
	
	public void render(Graphics g) { //creating menu selection boxes
		if(game.gameState == state.Menu) {
			
			Font menufont = new Font("Arial",1,50);
			g.setFont(menufont);
			g.setColor(Color.black);
			g.drawString("Turtle Samurai", 150, 50);
		
			Font optionFont = new Font("Arial",1,50);
			g.setFont(optionFont);
			g.setColor(Color.black);
			g.drawString("PLAY", 250, 200);
		
		
			g.setFont(optionFont);
			g.setColor(Color.black);
			g.drawString("QUIT", 250, 300);
		
			g.setFont(optionFont);
			g.setColor(Color.black);
			g.drawString("HELP", 250, 400);
		
			g.setColor(Color.black);
			g.drawRect(235, 150, 175, 64);
		
			g.setColor(Color.black);
			g.drawRect(235, 250, 175, 64);
		
			g.setColor(Color.black);
			g.drawRect(235, 350, 175, 64);
	}else if(game.gameState == state.Help) {
		Font hFont = new Font("arial", 2, 30);
		Font BFont = new Font("arial", 2, 30);
		g.setFont(hFont);
		g.setColor(Color.white);
		g.drawString("How to move: ", 50, 100);
		
		g.setFont(hFont);
		g.drawString("How to play the game." ,150, 50);
		
		g.setFont(BFont);
		g.drawRect(235, 350, 175, 64);
		g.drawString("Go Back", 250, 400);
		
	}
	}
}
