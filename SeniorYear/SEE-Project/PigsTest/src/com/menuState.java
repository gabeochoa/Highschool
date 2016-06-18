package com;

import org.lwjgl.input.*;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class menuState extends BasicGameState {

	public String mousetxt = "no input yet";
	Image pic;
	int picX = 200;
	int picY = 200;
	
	public menuState(int state)
	{
		
	}
	
	@Override
	public void init(GameContainer gc, StateBasedGame state)
			throws SlickException {
		
		pic = new Image("res/Frame.png");
		
	}

	@Override
	public void render(GameContainer gc, StateBasedGame state, Graphics g)
			throws SlickException {
		g.drawString(mousetxt, 50, 50);
		g.drawImage(pic, picX, picY);
		
	}

	@Override
	public void update(GameContainer gc, StateBasedGame state, int number)
			throws SlickException {

		int mouseX = Mouse.getX();
		int mouseY = Mouse.getY();
		mousetxt = ""+mouseX+"   "+mouseY;
		
		Input input = gc.getInput();
		int speed = 1;

		if(input.isKeyDown(Input.KEY_UP))
				{
					picY -= speed;
				}
		if(input.isKeyDown(Input.KEY_DOWN))
				{
					picY += speed;
				}
		if(input.isKeyDown(Input.KEY_LEFT))
				{
					picX -= speed;
				}
		if(input.isKeyDown(Input.KEY_RIGHT))
				{
					picX += speed;
				}
			
		if( (mouseX > 0) && (mouseY>0) && input.isMouseButtonDown(0))
		{
			state.enterState(1);
		}
	}

	@Override
	public int getID() {
		return 0;
	}

	
}
