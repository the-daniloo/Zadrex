package com.board;

import java.awt.Graphics;

public class Board {
	
	//tabuleiro é 8x8
	public static final int SQUARE_WIDTH = 8;
	public static final int SQUARE_HEIGHT = 8;
	
	//tamanho do tabuleiro
	public static final int HEIGHT = 512;
	public static final int WIDTH = 512;
	
	private Square squares[][];
	
	public Board() {
		this.squares = new Square[SQUARE_WIDTH][SQUARE_HEIGHT];
	}
	
	public void tick() {
		
	}
	
	public void render(Graphics g) {
		for(int x = 0; x < 8; x++) {
			for(int y = 0; y < 8; y++) {
				squares[x][y].render(g);
			}
		}
	}
	
	public void squareLoad() {
		boolean blackStatus = true;
		
		int positionx = 142;
		int positiony = 82;
		
		for(int y = 0; y < SQUARE_HEIGHT; y++) {
			for(int x = 0; x < SQUARE_WIDTH; x++) {
				if(x == SQUARE_WIDTH - 1) {
					if(blackStatus == true) {
						squares[x][y] = new BlackSquare((x * Square.WIDTH) + positionx, (y * Square.HEIGHT) + positiony);
					} else {
						squares[x][y] = new WhiteSquare((x * Square.WIDTH) + positionx, (y * Square.HEIGHT) + positiony);
					}
				} else {
					if(blackStatus == true) {
						squares[x][y] = new BlackSquare((x * Square.WIDTH) + positionx, (y * Square.HEIGHT) + positiony);
						blackStatus = false;
					} else {
						squares[x][y] = new WhiteSquare((x * Square.WIDTH) + positionx, (y * Square.HEIGHT) + positiony);
						blackStatus = true;
					}
				}
			}
		}
	}
}
