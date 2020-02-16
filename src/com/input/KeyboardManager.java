package com.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardManager implements KeyListener {
	
	public static final int KEYS = 256;
	
	private boolean[] currentKeys;
	private State[] keys;
	
	public KeyboardManager() {
		keys = new State[KEYS];
		currentKeys = new boolean[KEYS];
	}
	
	public void tick() {
		//setting the state of each key
		for(int i = 0 ; i < KEYS ; i++) {
			//is it being pressed?
			if(currentKeys[i] == true) {
				/*if it is, so check 
				 * if the key was being held
				in the last frame */
				if(keys[i] == State.RELEASED) {
					/* if the key was released in the last frame
					 * so this means that it was just pressed
					 * so set the key to ONCE */
					keys[i] = State.ONCE;
				} else {
					// else, set it as PRESSED
					keys[i] = State.PRESSED;
				}
			} else {
				//if the key was not being pressed, so it is released
				keys[i] = State.RELEASED;
			}
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		//basically checks if the key is being pressed to verify in what state the key is
		int keyCode = e.getKeyCode();
		if(keyCode >= 0 && keyCode < KEYS) {
			currentKeys[keyCode] = true;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		//basically checks if the key is released to set the key as released state
		int keyCode = e.getKeyCode();
		if(keyCode >= 0 && keyCode < KEYS) {
			currentKeys[keyCode] = false;
		}
	}
	
	//this method verifies if the key is down
	public boolean keyDown(int keyCode) {
		return keys[keyCode] == State.ONCE ||
		keys[keyCode] == State.PRESSED;
	}
	
	//this method verifies if the key was pressed once;
	public boolean keyDownOnce(int keyCode) {
		return keys[keyCode] == State.ONCE;
	}
	
	//not implemented method
	@Override
	public void keyTyped(KeyEvent e) {}
		
}
