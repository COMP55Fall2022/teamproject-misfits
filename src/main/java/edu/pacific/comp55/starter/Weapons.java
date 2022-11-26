package edu.pacific.comp55.starter;

public enum Weapons {
	SWORD, KINGSWORD, MUSKET;
	
	public String toString() {
		switch(this){
			case SWORD: return "sword";
			case KINGSWORD: return "king sword";
			case MUSKET: return "musket";
		}
		return "n/a";
	}

}
