package edu.pacific.comp55.starter;

import java.awt.Graphics;
import java.util.LinkedList;

public class Hander {//created handler for updating our objects in order to render them to screen

	LinkedList<Objects> object = new LinkedList<Objects>();//used to add objects in a linked list
	
	public void tick() {
		for(int i=0; i< object.size();i++) {//updates variables
		
			Objects tempObject = object.get(i);
			
			tempObject.tick();
		}
	}
	
	public void render(Graphics g) {
		for(int i=0; i< object.size();i++) { //updates graphics
			
			Objects tempObject = object.get(i);
			
			tempObject.render(g);
		}
	
	}
	public void addObject(Objects object) {//add objects to list
		this.object.add(object);
	}
	
	public void removeObject(Objects object) {//remove objects from list
		this.object.remove(object);
	}
	
}
