package com.GUI;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Window extends JFrame {
	
	private String name;
	private int width, height;
	
	private Canvas canvas;
	
	public Window(String name, int width, int height) {
		this.name = name;
		this.width = width;
		this.height = height;
		
		setTitle(name);
		setSize(712, 712);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		createCanvas();
		
		add(canvas);
	}
	
	private void createCanvas() {
		canvas = new Canvas();
		canvas.setPreferredSize(new Dimension(width, height));
		canvas.setMaximumSize(new Dimension(width, height));
		canvas.setMinimumSize(new Dimension(width, height));
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public Canvas getCanvas() {
		return canvas;
	}
	
}
