package edu.pacific.comp55.starter;

import acm.graphics.*;
import java.awt.event.ActionListener;
import javax.swing.*;

public abstract class Level implements ActionListener {
	int currentLevel;
	int enemiesKilled;
	int enemiesRemaining;
	int damageDealt;
	//player addPlayer;
	int windowHeight;
	int windowWidth;
	Timer addEnemy = new Timer(1000, this);
	Timer attack = new Timer(1000, this);
	
	
}
