package edu.pacific.comp55.starter;
import acm.graphics.GImage;
import java.util.Date;

import javax.swing.Timer;

import acm.program.GraphicsProgram;
import acm.graphics.*;

import java.awt.ActiveEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Thread;


	public class Environment implements ActionListener {
		
		int i = 0;
		int x1 = 800;
		int y1 = 0;
		int velocity = -1;
		int BREAK_MS = 30;
		GImage background;
		GImage cloud;
		Game app;
		Timer cloudTimer;
		
		public Environment (Game app, String name, int x, int y) {
			background = new GImage(name, x, y);
			background.setSize(Game.WINDOW_WIDTH, Game.WINDOW_HEIGHT);
			cloud = new GImage("media/Cloud.png", 800, -200);
			cloud.setSize(400,400);
			cloudTimer = new Timer(50, this);
			this.app = app;
			
		}		
		
		public void showEnvironment() {
			app.add(background);
			app.add(cloud);
			cloudTimer.start();
		}
		
		public void hideEnvironment() {
			app.remove(background);
			app.remove(cloud);
			cloudTimer.stop();
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			cloud.move(velocity, 0);
			if (cloud.getX()<-400) {
				cloud.move(1350,0);
			}
		}


}

