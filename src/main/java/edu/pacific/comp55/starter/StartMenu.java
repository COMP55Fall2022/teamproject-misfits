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
	private GButton help;
	
	
	public StartMenu(Game app) {
		super();
		program = app;
		
		start = new GButton("Start Game", 300, 200, 200, 50);
		start.setFillColor(Color.GREEN);
		exit = new GButton("Exit Game", 300,300,200,50);
		exit.setFillColor(Color.GREEN);
		help = new GButton("Help",300,400,200,50);
		help.setFillColor(Color.red);
				
	}

	@Override
	public void showContents() {
		
		program.add(start);
		program.add(exit);
		program.add(help);
	}

	@Override
	public void hideContents() {
		program.remove(start);
		program.remove(exit);
		program.remove(help);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		GObject obj = program.getElementAt(e.getX(), e.getY());
		if (obj == start) {
			program.switchToSome();
		}else if(obj == exit) {
			System.exit(0);
		}else if(obj == help) {
			program.switchToHelp();
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
