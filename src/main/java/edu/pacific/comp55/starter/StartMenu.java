package edu.pacific.comp55.starter;

import java.awt.
Color;
import java.awt.event.MouseEvent;

import acm.graphics.GObject;

public class StartMenu extends Display {
	private Game program; // you will use program to get access to
										// all of the GraphicsProgram calls
	private GButton start;
	private GButton exit;
	
	
	public StartMenu(Game app) {
		super();
		program = app;
		
		start = new GButton("Start Game", 200, 400, 200, 100);
		start.setFillColor(Color.GREEN);
		exit = new GButton("Exit Game", 400,400,200,100);
		exit.setFillColor(Color.GREEN);
		
		
	}

	@Override
	public void showContents() {
		
		program.add(start);
		program.add(exit);
	}

	@Override
	public void hideContents() {
		program.remove(start);
		program.remove(exit);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		GObject obj = program.getElementAt(e.getX(), e.getY());
		if (obj == start) {
			program.switchToSome();
		}else if(obj == exit) {
			System.exit(0);
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
