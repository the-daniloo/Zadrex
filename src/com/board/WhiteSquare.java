package com.board;

import java.awt.Color;
import java.awt.Graphics;

public class WhiteSquare extends Square{
	
	public WhiteSquare(int x, int y) {
		super(x, y, Color.white);
	}
	
	public void render(Graphics g) {
		g.setColor(color);
		g.fillRect(x, y, WIDTH, HEIGHT);
	}
}
