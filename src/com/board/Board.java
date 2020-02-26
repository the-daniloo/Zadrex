package com.board;

import java.awt.Color;
import java.awt.Graphics;

public class Board {
	
	//tabuleiro é 8x8
	public static final int SQUARE_WIDTH = 8;
	public static final int SQUARE_HEIGHT = 8;
	
	//tamanho do tabuleiro
	private static final int HEIGHT = 512;
	private static final int WIDTH = 512;
	
	private final int black = 1;
	private final int white = 0;
	private int squares[][];
	
	public Board() {
		this.squares = new int[SQUARE_WIDTH][SQUARE_HEIGHT];
	}
	
	public void tick() {
		
	}
	
	public void render(Graphics g) {
		for(int x = 0; x < 8; x++) {
			for(int y = 0; y < 8; y++) {
				if(squares[x][y] == black) {
					g.setColor(Color.black);
					//g.fillRect();
				} else {
					g.setColor(Color.white);
					//g.fillRect();
				}
			}
		}
	}
	
	public void squareLoad() {
		boolean blackStatus = true;
		
		for(int x = 0; x < 8; x++) {
			for(int y = 0; y < 8; y++) {
				if(blackStatus == true) {
					squares[x][y] = black;
					blackStatus = false;
				} else {
					squares[x][y] = white;
					blackStatus = true;
				}
			}
		}
	}
	
	public int getBoardHeight() {
		return height;
	}
	
	public void setBoardHeight(int newValue) {
		this.height = newValue;
	}
	
	public int getBoardWidth() {
		return width;
	}
	
	public void setBoardWidth(int newValue) {
		this.width = newValue;
	}
	
	
}
