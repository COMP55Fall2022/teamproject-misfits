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
		int velocity = -50;
		int BREAK_MS = 30;
		GImage background;
		GImage cloud;
		Game app;
		Timer cloudTimer;
		
		public Environment (Game app, String name, int x, int y) {
			background = new GImage(name, x, y);
			background.setSize(Game.WINDOW_WIDTH, Game.WINDOW_HEIGHT);
			cloud = new GImage("media/cumulus-cloud-3.jpg", 800, 0);
			cloud.setSize(50,50);
			cloudTimer = new Timer(500, this);
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
			i=i+1;
			if (i==19) {
				cloud.move(1050,0);
				i=0;
			}
		}


}

