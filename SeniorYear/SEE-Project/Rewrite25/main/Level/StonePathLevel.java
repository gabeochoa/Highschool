package main.Level;

import java.awt.Graphics;

import main.Art;
import main.RPG;

public class StonePathLevel extends Level {
	
Graphics g;
	
	public StonePathLevel()
	{
		super();
		xSpawn = 30;
		ySpawn = RPG.HEIGHT - 30;
		name = "StonePath";
	}
	public void tick(Graphics gr)
	{
		g = gr;
		super.tick(g);
	}
	
	
	void drawBackground() 
	{
		g.drawImage(Art.getImageFromFile("./images/menu/black.png"),0, 0, RPG.WIDTH, RPG.HEIGHT,null);
	}	

	public void paint(Graphics gr)
	{
		g = gr;
		drawBackground();
	}

	public void switchLevel(int id) {
		if (id == 0) aGame.switchLevel("Forest", 0);
		if (id == 2) aGame.switchLevel("Town", 2);
	}

	
}

