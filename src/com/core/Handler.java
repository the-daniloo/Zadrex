package com.core;

import com.GUI.Window;
import com.input.KeyboardManager;
import com.input.MouseManager;

public class Handler {
	
	private Game g;
	
	public Handler(Game g)
	{
		this.g = g;
	}
	
	public KeyboardManager getKeyboard()
	{
		return this.g.getKeyboardManager();
	}
	
	public MouseManager getMouse()
	{
		return this.g.getMouseManager();
	}
	
	public Window getWindow()
	{
		return this.g.getWindow();
	}
	
}
