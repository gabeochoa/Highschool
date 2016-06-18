package main.Level;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.*;
import java.util.*;

import main.ActualGame;
import main.Art;
import main.RPG;
import main.Menu.errorMenu;
import main.entity.*;

public abstract class Level
{
	Image background, healthFrame, clockFrame, clockBackground;
	ArrayList<entity> entities = new ArrayList<entity>();
	Graphics g;
	Graphics2D gClockBackground;
	entity test;
	public Player player;
	public int xSpawn;
	public int ySpawn;
	protected ActualGame aGame;
	public String name = "";
	public double clockAngle = 1;
	public int rbounds, lbounds;
	
	public Level()
	{
		healthFrame = Art.getImageFromFile("./images/HUD/healthBar.png");
		clockFrame = Art.getImageFromFile("./images/HUD/clockOutline.png");
		clockBackground = Art.getImageFromFile("./images/HUD/clockBackground.png");
		gClockBackground = (Graphics2D) clockBackground.getGraphics();
		rbounds = 768;
		lbounds = 0;
		
		addEntity(new regZombie());
	}
	

	public void tick(Graphics gr)
	{
		g = gr;
		
		//drawBackground();
		
		drawEntities();
		//updateMovement();
		//collision();	
		//drawHUD();
		//winClock();		
	}
	
	private void drawHUD() 
	{
		
		
		g.drawImage(healthFrame, 0, 0,null);
		
		
	}
	public void winClock()
	{
		clockAngle++;
		//Image temp = Art.getImageFromFile("./images/HUD/blank.png");
		//Graphics2D gTemp = (Graphics2D) temp.getGraphics();
		/*gClockBackground.translate(150/2,150/2);
		gClockBackground.rotate(Math.toRadians( (double) clockAngle));
		gClockBackground.translate((150/2)*-1,(150/2)*-1);
		gClockBackground.drawImage(clockBackground, 50, 50,null);*/
		
		gClockBackground.rotate(Math.toRadians( (double) clockAngle),150/2,150/2);
		gClockBackground.drawImage(clockBackground, 0, 0,null);
		//gTemp.rotate(Math.toRadians( (double) clockAngle),150/2,150/2);
		
		gClockBackground.rotate(Math.toRadians( (double) clockAngle*-1),150/2,150/2);
		g.drawImage(clockBackground, 50, 50,null);
	}


    public Image imageRotator(Image toBeRotated, double angle, int imageWidth, int imageHeight)
	{
		Image temp = Art.getImageFromFile("./images/HUD/blank.png");
		Graphics2D temp2D = (Graphics2D) temp.getGraphics();
		temp2D.translate(imageWidth/2,imageHeight/2);
		temp2D.rotate(Math.toRadians(angle));
		temp2D.translate(-(imageWidth/2),-(imageHeight/2));
		temp2D.drawImage(toBeRotated,0,0,null);
		return temp;
	}


	abstract void drawBackground(); 

	

	private void collision() {
		// TODO Auto-generated method stub
		
	}

	private void updateMovement() {
		// TODO Auto-generated method stub
		for(entity e: entities)
		{
			e.move();
		}
		
	}

	public void drawEntities() {
		for(entity e: entities)
			e.paint(g);
	}

	public void spawnEntities()
	{
		Random random = new Random();
		
		switch(random.nextInt(50))
		{		
		case 1:
			test = new slowZombie();
			break;
		case 2:
			test = new slowZombie();
			break;
		case 3:
			test = new regZombie();
			break;
		case 4:
			test = new regZombie();
			break;
		case 5:
			test = new regZombie();
			break;
		default:
			return;
		}
		this.addEntity(test);
		test.level = this;
		test.move();
	}
	
	public void addEntity(entity p)
	{
		entities.add(p);
	}
	public void removeEntites(){}
	
	public void paint(Graphics gr)
	{
		g = gr;
		drawEntities();
	}
	
	public static Level loadLevel(ActualGame aGame, String name)
	{
		Level requested = getLevelByName(name);
		if(requested != null)
		{
			requested.init(aGame, name, Art.getImageFromFile("./images/level/"+name+".png"));
			return requested;
		}
		else
			aGame.setMenu(new errorMenu("Failed to Load Level"));
			
		return null;
	}

	private void init(ActualGame aGame, String name, Image imageFromFile) {
		this.aGame = aGame;
		player = aGame.player;
		background = imageFromFile;
	}
	private static Level getLevelByName(String name)
	{
	 try{
		name = name.substring(0, 1).toUpperCase() + name.substring(1);
				return (Level) Class.forName("main.Level." + name + "Level").newInstance();
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
	}
	public void switchLevel(int id)
	{
		
	}
}