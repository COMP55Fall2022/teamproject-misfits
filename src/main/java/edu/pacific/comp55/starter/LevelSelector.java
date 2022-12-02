package edu.pacific.comp55.starter;

import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.Arrays;

import javax.swing.*;

import acm.graphics.GObject;

public class LevelSelector extends GraphicsPane  {
	private Game levelSelector;
	private GButton levelSelector1;
	private GButton levelSelector2;
	private GButton levelSelector3;
	private GButton levelSelector4;
	
	
	public LevelSelector(Game program) {
		
		levelSelector = program;
		int locX = 100;
		int locY = 150;
		levelSelector1 = new GButton("Level 1", locX, locY, 100, 50);
		locX = locX + 150;
		levelSelector2 = new GButton("Level 2", locX, locY, 100, 50);
		locX = locX + 150;
		levelSelector3 = new GButton("Level 3", locX, locY, 100, 50);
		locX = locX + 150;
		levelSelector4 = new GButton("Level 4", locX, locY, 100, 50);
	}
	
	public void levels(GButton app) {
		this.levelSelector1 = app;
		this.levelSelector2 = app;
	}
	public void showContents() { 
		levelSelector.add(levelSelector1);
		levelSelector.add(levelSelector2);
		levelSelector.add(levelSelector3);
		levelSelector.add(levelSelector4);
	}
	
	public void hideContents() { 
		levelSelector.remove(levelSelector1);
		levelSelector.remove(levelSelector2);
		levelSelector.remove(levelSelector3);
		levelSelector.remove(levelSelector4);
	}
	
	public void mousePressed(MouseEvent e) {
		  GObject obj = levelSelector.getElementAt(e.getX(), e.getY());
		  if (obj ==  levelSelector1) {
			  levelSelector.switchToMainScreen();
		  }
		  if (obj ==  levelSelector2) {
			  levelSelector.switchToMainScreen();
		  }
		  if (obj ==  levelSelector3) {
			  levelSelector.switchToMainScreen();
		  }
		  if (obj ==  levelSelector4) {
			  levelSelector.switchToMainScreen();
		  }
	}

	public void run() {
		// TODO Auto-generated method stub
		
	}
}
