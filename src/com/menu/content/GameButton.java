package com.menu.content;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.core.Handler;

public class GameButton extends UserInterfaceItem {
	
	protected BufferedImage hoveredTexture;
	protected boolean hovering = false;
	
	public GameButton(int x, int y, int width, int height, Handler handler) {
		super(x, y, width, height, handler);
	}

	//SUPER CLASS 
	
	@Override
	public void tick()
	{
		checkMouse();
	}
	
	@Override
	public void render(Graphics g)
	{
		if(!hovering) {
			g.drawImage(texture, x, y, width, height, null);
		} else {
			g.drawImage(hoveredTexture, x, y, width, height, null);
		}
	}
	
	protected void checkMouse()
	{
		if(handler.getMouse().x >= this.x && handler.getMouse().x <= this.x + this.width && 
		handler.getMouse().y >= this.y && handler.getMouse().y <= this.y + this.height)
		{
			hovering = true;
			onHover();
			if(handler.getMouse().left)
			{
				onClick();
			}
		} else {
			hovering = false;
		}
	}
	
	//INTERFACE CLICKABLE
	
	@Override
	public void onClick() {}

	@Override
	public void onHover() {}
	
	//GETTERS AND SETTERS
	
	public BufferedImage getHoveredTexture()
	{return hoveredTexture;}

	public void setHoveredTexture(BufferedImage hoveredTexture) 
	{this.hoveredTexture = hoveredTexture;}
	

	public boolean isHovering() 
	{return hovering;}

	public void setHovering(boolean hovering) 
	{this.hovering = hovering;}

}
