package edu.pacific.comp55.starter;

import java.awt.
Color;
import java.awt.event.MouseEvent;

import acm.graphics.GImage;
import acm.graphics.GObject;

public class StartMenu extends GraphicsPane {
	private Game program; 
	private GButton start;
	private GButton exit;
	private GButton help;
	private GImage backG;
	
	
	public StartMenu(Game app) {
		super();
		program = app;
		
		backG = new GImage("media/title.png",0,-10);
		backG.setSize(Game.WINDOW_WIDTH, Game.WINDOW_HEIGHT);
		start = new GButton("Start Game", 350, 250, 200, 50);
		start.setFillColor(Color.GREEN);
		exit = new GButton("Exit Game", 350,350,200,50);
		exit.setFillColor(Color.GREEN);
		help = new GButton("Help",350,450,200,50);
		help.setFillColor(Color.red);
				
	}

	@Override
	public void showContents() {
		program.add(backG);
		program.add(start);
		program.add(exit);
		program.add(help);
	}

	@Override
	public void hideContents() {
		program.remove(start);
		program.remove(exit);
		program.remove(help);
		program.remove(backG);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		GObject obj = program.getElementAt(e.getX(), e.getY());
		if (obj == start) {
			program.switchToLevel();
		}else if(obj == exit) {
			System.exit(0);
		}else if(obj == help) {
			program.switchToHelp();
		}
	}
}
