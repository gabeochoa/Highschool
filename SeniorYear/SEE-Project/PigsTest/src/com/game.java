package com;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class game extends StateBasedGame {

	public static final String gamename = "TITLE GAME";
	public static final int menu = 0;
	public static final int gameplay = 1;
	
	public game(String gamename)
	{
		super(gamename);
		this.addState(new menuState(menu));
		this.addState(new playState(gameplay));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AppGameContainer appgc;
		
		try
		{
			appgc = new AppGameContainer(new game(gamename));
			appgc.setDisplayMode(640, 360, false);
			appgc.start();
		}
		catch(SlickException e)
		{
			e.printStackTrace();
		}
		
	}

	@Override
	public void initStatesList(GameContainer gc) throws SlickException {

		this.getState(menu).init(gc, this);
		this.getState(gameplay).init(gc, this);
		this.enterState(menu);
	}

}
