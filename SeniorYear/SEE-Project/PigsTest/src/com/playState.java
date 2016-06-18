package com;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class playState extends BasicGameState {

	public playState(int state)
	{
		
	}
	
	@Override
	public void init(GameContainer gc, StateBasedGame state)
			throws SlickException {
		
		
	}

	@Override
	public void render(GameContainer gc, StateBasedGame state, Graphics g)
			throws SlickException {
		g.drawString("Playing", 50, 50);
	}

	@Override
	public void update(GameContainer gc, StateBasedGame state, int number)
			throws SlickException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return 1;
	}

	
}
