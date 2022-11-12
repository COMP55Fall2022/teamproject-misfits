package edu.pacific.comp55.starter;

import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GObject;

public class StartMenu extends Display {
	private Game program; // you will use program to get access to
										// all of the GraphicsProgram calls
	private GButton rect;
	
	public StartMenu(Game app) {
		super();
		program = app;
		rect = new GButton("Play Game", 200, 200, 200, 200);
		rect.setFillColor(Color.RED);
		
	}

	@Override
	public void showContents() {
		
		program.add(rect);
	}

	@Override
	public void hideContents() {
		program.remove(rect);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		GObject obj = program.getElementAt(e.getX(), e.getY());
		if (obj == rect) {
			program.switchToSome();
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
