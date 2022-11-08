package edu.pacific.comp55.starter;

import java.awt.Graphics;
import java.util.LinkedList;

public class Hander {//created handler for updating our objects in order to render them to screen

	LinkedList<Objects> object = new LinkedList<Objects>();//used to add objects in a linked list
	
	public void tick() {
		for(int i=0; i< object.size();i++) {
		
			Objects tempObject = object.get(i);
			
			tempObject.tick();
		}
	}
	
	public void render(Graphics g) {
		for(int i=0; i< object.size();i++) { //used to iterate through objects and render them
			
			Objects tempObject = object.get(i);
			
			tempObject.render(g);
		}
	
	}
	public void addObject(Objects object) {
		this.object.add(object);
	}
	
	public void removeObject(Objects object) {
		this.object.remove(object);
	}
	
}
