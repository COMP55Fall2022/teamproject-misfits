package edu.pacific.comp55.starter;

import java.awt.Graphics;

public abstract class Objects {//used to create objects

	protected int x,y;
	protected ID id;
	protected int speedX,speedY;
	
	public Objects(int x,int y, ID id) {
	this.x =x;
	this.y=y;
	this.id=id;
	}
	
	public abstract void tick();
	public abstract void render(Graphics g);
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getX(int x) {
		return x;
	}
	
	public int getY(int y) {
		return y;
	}
	
	public void setID(ID id) {
		this.id = id;
	}
	
	public ID getID() {
		return id;
	}
	
	public void setSpeedX(int speedX) {
		this.speedX = speedX;
	}
	
	public int getSpeedX() {
		return speedX;
	}
	
	public void setSpeedY(int speedY) {
		this.speedY = speedY;
	}
	
	public int getSpeedY() {
		return speedY;
	}
}
