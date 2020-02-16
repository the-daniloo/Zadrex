package com.input;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseManager implements MouseListener, MouseMotionListener{
	
	public int x, y;
	public boolean right, left, middle;
	
	public MouseManager() {
		right = false;
		left = false;
		middle = false;
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		x = e.getX();
		y = e.getY();
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		int btn = e.getButton();
		if(btn == MouseEvent.BUTTON1) left = true;
		if(btn == MouseEvent.BUTTON2) right = true;
		if(btn == MouseEvent.BUTTON3) middle = true;
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		int btn = e.getButton();
		if(btn == MouseEvent.BUTTON1) left = false;
		if(btn == MouseEvent.BUTTON2) right = false;
		if(btn == MouseEvent.BUTTON3) middle = false;
	}
	
	
	
	
	
	//not used methods
	
	@Override
	public void mouseDragged(MouseEvent e) {}

	@Override
	public void mouseClicked(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}
	
}
