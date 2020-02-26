package com.board;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Square {
	
	public static final int WIDTH = 64;
	public static final int HEIGHT = 64;
	protected Color color;
	protected int x;
	protected int y;
	
	public Square(int x, int y, Color color) {
		this.x = x;
		this.y = y;
		this.color = color;
	}
	
	public abstract void render(Graphics g);
	
	public int getX() {
		return x;
	}
	
	public void setX(int newValue) {
		this.x = newValue;
	}
	
	public int getY() {
		return y;
	}
	public void setY(int newValue) {
		this.y = newValue;
	}
	
	public Color getColor() {
		return color;
	}
	
	public void setColor(Color newValue) {
		this.color = newValue;
	}
}
