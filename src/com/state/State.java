package com.state;

import java.awt.Graphics;

public abstract class State {
	
	//STATICS
	public static State currentState = null;
	
	public static State getCurrentState()
	{
		return currentState;
	}
	
	public static void setCurrentStateTo(State state)
	{
		currentState = state;
	}
	
	//OBJECT
	
	public abstract void tick();
	public abstract void render(Graphics g);
	
}
