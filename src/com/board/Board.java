package com.board;

import java.awt.Color;
import java.awt.Graphics;

public class Board {
	
	//tabuleiro é 8x8
	public static final int SQUARE_WIDTH = 8;
	public static final int SQUARE_HEIGHT = 8;
	
	//tamanho do tabuleiro
	private int height = 512;
	private int width = 512;
	
	//tamanho em PIXELS dos quadrados
	private int widthSquare = 64;
	private int heightSquare = 64;
	
	
	private final int black = 0;
	private final int white = 1;
	private int squares[][];
	
	public Board() {
		this.squares = new int[SQUARE_WIDTH][SQUARE_HEIGHT];
	}
	
	public Board (int height, int width) {
		this.height = height;
		this.width = width;
		this.squares = new int[SQUARE_WIDTH][SQUARE_HEIGHT];
	}
	
	public void tick() {
		
	}
	
	public void render(Graphics g) {
		for(int x = 0; x <= 8; x++) {
			for(int y = 0; y <= 8; y++) {
					if(squares[x][y] == squares[0][0]) {
						g.setColor(Color.black);
						g.fillRect(0, 0, widthSquare, heightSquare);
					} else {
					if(squares[x][y] == black) {
						g.setColor(Color.black);
						g.fillRect(0, squares[x][y-1] + heightSquare, widthSquare, heightSquare);
					} else {
						g.setColor(Color.white);
						g.fillRect(squares[x-1][y] + widthSquare, 0, widthSquare, heightSquare);
					}
				}
			}
		}
	}
	
	public void squareLoad() {
		for(int x = 0; x <= 8; x++) {
			for(int y = 0; y <= 8; y++) {
				if((x % 2 == 0) && (y % 2 == 0)) {
					squares[x][y] = black;
				}
				else if((x % 2 != 0) && (y % 2 == 0)) {
					squares[x][y] = white;
				}
				else if((x % 2 != 0) && (y % 2 != 0)) {
					squares[x][y] = black;
				}
				else if((x % 2 == 0) && (y % 2 != 0)) {
					squares[x][y] = white;
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
