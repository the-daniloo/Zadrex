package com.board;

import java.awt.Color;
import java.awt.Graphics;

public class BlackSquare extends Square {
	
	public BlackSquare(int x, int y) {
		super(x, y, Color.black);
	}
	
	public void render(Graphics g) {
		g.setColor(color);
		g.fillRect(x, y, WIDTH, HEIGHT);
	}
}
