package com.menu.content;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import com.core.Handler;

public abstract class UserInterfaceItem implements Clickable
{
	public static ArrayList<UserInterfaceItem> items = new ArrayList<>();
	
	protected int x, y;
	protected int width, height;
	
	protected BufferedImage texture;
	
	protected Handler handler;
	
	public UserInterfaceItem(int x, int y, int width, int height, Handler handler)
	{
		this.x = x;
		this.y = y;
		
		this.width = width;
		this.height = height;
		
		this.handler = handler;
		
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
	
}
