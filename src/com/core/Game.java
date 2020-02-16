package com.core;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import com.GUI.Window;
import com.assets.Assets;
import com.input.KeyboardManager;
import com.input.MouseManager;
import com.state.GameState;
import com.state.MenuState;
import com.state.State;

public class Game implements Runnable {
	
	private Window window;
	
	private Thread thread;
	private boolean running = false;
	
	private BufferStrategy bs;
	private Graphics g;
	
	private KeyboardManager keyboardManager;
	private MouseManager mouseManager;
	
	private GameState gameState;
	private MenuState menuState;
	
	@Override
	public void run() {
		init();
		
		int fps = 60;
		double timePerTick = 1000000000 / fps;
		double unprocessed = 0;
		long now;
		long lastTime = System.nanoTime();
		long timer = 0;
		int ticks = 0;

		while(running){
			now = System.nanoTime();
			unprocessed += (now - lastTime) / timePerTick;
			timer += now - lastTime;
			lastTime = now;
			
			if(unprocessed >= 1){
				tick();
				render();
				ticks++;
				unprocessed--;
			}
			
			if(timer >= 1000000000){
				System.out.println(ticks);
				ticks = 0;
				timer = 0;
			}
		}
		stop();
	}
	
	private void init() {
		keyboardManager = new KeyboardManager();
		mouseManager = new MouseManager();
		window = new Window("Game Core Window", 900, 600);
		
		window.addKeyListener(keyboardManager);
		window.addMouseListener(mouseManager);
		window.addMouseMotionListener(mouseManager);
		
		window.getCanvas().addKeyListener(keyboardManager);
		window.getCanvas().addMouseListener(mouseManager);
		window.getCanvas().addMouseMotionListener(mouseManager);
		
		Assets.init();
		
		gameState = new GameState();
		menuState = new MenuState();
		
		State.setCurrentStateTo(menuState);
	}
	
	private void render() {
		bs = window.getCanvas().getBufferStrategy();
		if(bs == null) {
			window.getCanvas().createBufferStrategy(2);
			return;
		}
		g = bs.getDrawGraphics();
		g.clearRect(0, 0, window.getWidth(), window.getHeight());
		
		State.getCurrentState().render(g);
		
		g.dispose();
		bs.show();
	}
	
	private void tick() {
		keyboardManager.tick();
	}
	
	public synchronized void start() {
		if(running)
			return;
		
		thread = new Thread(this);
		thread.start();
		running = true;
	}
	
	public synchronized void stop() {
		if(!running)
			return;
		
		try {
			thread.join();
			running = false;
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
