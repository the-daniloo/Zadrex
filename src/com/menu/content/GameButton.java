package com.menu.content;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class GameButton extends UserInterfaceItem implements Clickable {
	
	protected BufferedImage hoveredTexture;
	protected boolean hovered = false;
	
	public GameButton(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	//SUPER CLASS 
	
	@Override
	public void tick()
	{
		
	}
	
	@Override
	public void render(Graphics g)
	{
		if(!hovered) {
			g.drawImage(texture, x, y, width, height, null);
		} else {
			g.drawImage(hoveredTexture, x, y, width, height, null);
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
	

	public boolean isHovered() 
	{return hovered;}

	public void setHovered(boolean hovered) 
	{this.hovered = hovered;}

}
