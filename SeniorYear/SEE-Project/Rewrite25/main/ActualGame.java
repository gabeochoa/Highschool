/**
 * 
 */
package main;

import java.awt.Graphics;
import java.awt.event.KeyEvent;

import main.Level.*;
import main.Menu.*;
import main.entity.Item;
import main.entity.*;

/**
 * @author Gabe
 *@version added in Alpha 1.2
 *@current 1.2
 */
public class ActualGame {

	public int time;
	public Level level;
	public Player player;
	public int pauseTime;
	public Menu menu;
	private Graphics g;

	public ActualGame() {
		setMenu(new titleMenu(true));
	}
	public ActualGame(Graphics gr) {
		setMenu(new titleMenu(true));
		g = gr;
	}

	public void newGame() {
		level = Level.loadLevel(this, "forest");
		player = new Player();
		player.level = level;
		level.player = player;
	    player.x = level.xSpawn;
	    player.y = level.ySpawn;
	    level.addEntity(player);
	    level.addEntity(new regZombie());
	}

	public void switchLevel(String name, int id) {
		pauseTime = 50;
		level = Level.loadLevel(this, name);
		player.x = level.xSpawn;
		level.addEntity(player);
	}


	public void tick(boolean[] keys) {
		if (pauseTime > 0) {
			drawLevelTitle(level.name);
			pauseTime--;
			return;
		}

		time++;

		boolean up = keys[KeyEvent.VK_W] || keys[KeyEvent.VK_UP] || keys[KeyEvent.VK_NUMPAD8];
		boolean down = keys[KeyEvent.VK_S] || keys[KeyEvent.VK_DOWN] || keys[KeyEvent.VK_NUMPAD2];
		boolean left = keys[KeyEvent.VK_A] || keys[KeyEvent.VK_LEFT] ;
		boolean right = keys[KeyEvent.VK_D] || keys[KeyEvent.VK_RIGHT];

		boolean use = keys[KeyEvent.VK_SPACE] || keys[KeyEvent.VK_ENTER];

		if (keys[KeyEvent.VK_ESCAPE]) {
			keys[KeyEvent.VK_ESCAPE] = false;
			if (menu == null) {
				setMenu(new pauseMenu());
			}
		}

		if (use) {
			keys[KeyEvent.VK_SPACE] = false;
		}

		if (menu != null) {
			keys[KeyEvent.VK_W] = keys[KeyEvent.VK_UP] = keys[KeyEvent.VK_NUMPAD8] = false;
			keys[KeyEvent.VK_S] = keys[KeyEvent.VK_DOWN] = keys[KeyEvent.VK_NUMPAD2] = false;
			keys[KeyEvent.VK_A] = false;
			keys[KeyEvent.VK_D] = false;

			menu.tick(this, up, down, left, right, use);
		}
		else {
			player.tick(up, down, left, right);
			if (use) {
				player.action();
			}

			level.tick(g);
			level.paint(g);

			checkBounds();
		}
		if(menu != null)
		menu.paint(g);
		
	}


	public void drawLevelTitle(String name)
	{
		g.drawImage(Art.getImageFromFile("./images/level-plates/"+name+".png"), 0,0,null);
	}
	
private void checkBounds() {
	//true is right
	if(player.x < -50)
		level.switchLevel(0);
	if(player.x > 768+100)
		level.switchLevel(2);
	}

	public void getLoot(Item item) {
		player.addLoot(item);
	}

	public void win(Player player) {
		setMenu(new winMenu(player));
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public void lose(Player player) {
		setMenu(new gameOverMenu(player));
	}

	public void initializeGame() {
		// TODO Auto-generated method stub
		
	}
}
