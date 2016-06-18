package main.Menu;

import java.awt.*;

import main.ActualGame;
import main.RPG;
import main.Sound;
import main.entity.Player;

public class gameOverMenu extends Menu {

	public int delayTicks = 60;
	public Player player;

	public Graphics g;
	
	public void paint(Graphics gr)
	{
		g = gr;
		drawMenu();
	}
	public gameOverMenu(Player player) {
		this.player = player;
	}

	public void drawMenu() {
		
		g.setColor(Color.white);
		g.drawString("You Survived "+player.getDaysSurvived()+" days!", 40, 8);
		
		if (delayTicks == 0)
			g.drawString("-> Continue", 40, RPG.HEIGHT - 16);
	}

	public void tick(ActualGame aGame, boolean up, boolean down, boolean left, boolean right, boolean select)
	{
		if (delayTicks > 0)
			delayTicks--;
		else if (select) {
			Sound.select.play();
			aGame.setMenu(new titleMenu());
		}
	}
	
	}
	
