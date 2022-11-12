package edu.pacific.comp55.starter;

import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Handler;

public class PlayerObject extends Objects {

	public PlayerObject(int x, int y, ID id,Hander handler, int speedX, int speedY) {
		super(x, y, id, speedX, speedY);
	}

	
	public void tick() {
		// TODO Auto-generated method stub
	}

	public void render(Graphics g) {
		g.setColor(Color.orange);
		g.fillOval(x,y, 40, 40);
		
		
	}
	
	
}
