package com.menu.content;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public abstract class UserInterfaceItem 
{
	public static ArrayList<UserInterfaceItem> items = new ArrayList<>();
	
	protected int x, y;
	protected int width, height;
	
	protected BufferedImage texture;
	
	protected boolean hovered = false;
	
	public UserInterfaceItem(int x, int y, int width, int height)
	{
		this.x = x;
		this.y = y;
		
		this.width = width;
		this.height = height;
		
		items.add(this);
	}
	
	public abstract void tick();
	public abstract void render(Graphics g);
	
	//GETTERS AND SETTERS
	
	public int getX()
	{return this.x;}
	
	public void setX(int x)
	{this.x = x;}
	
	
	public int getY()
	{return this.y;}
	
	public void setY(int y)
	{this.y = y;}
	
	
	public int getWidth()
	{return this.width;}
	
	public void setWidth(int width)
	{this.width = width;}
	
	
	public int getHeight()
	{return this.height;}
	
	public void setHeight(int height)
	{this.height = height;}

	
	public BufferedImage getTexture() 
	{return texture;}

	public void setTexture(BufferedImage texture) 
	{this.texture = texture;}

	
	public boolean isHovered() 
	{return hovered;}

	public void setHovered(boolean hovered) 
	{this.hovered = hovered;}
	
}
