package main.Level;
import java.awt.*;

import main.Art;
import main.RPG;
import main.entity.entity;
import main.entity.regZombie;

public class ForestLevel extends Level {

	Graphics g;
	
	public ForestLevel()
	{
		super();
		xSpawn = 30;
		ySpawn = RPG.HEIGHT - 30;
		name = "Forest";
		addEntity(new regZombie());
	}
	public void tick(Graphics gr)
	{
		g = gr;
		super.tick(g);
		if(entities.size() < 10)
			spawnEntities();
	}
	
	
	void drawBackground() 
	{
		g.drawImage(Art.getImageFromFile("./images/menu/green.png"),0, 0, RPG.WIDTH, RPG.HEIGHT,null);
	}	

	public void paint(Graphics gr)
	{
		g = gr;
		drawBackground();
		super.paint(gr);
	}

	public void switchLevel(int id) {
		if (id == 2) aGame.switchLevel("StonePath", 2);
	}

	
}
