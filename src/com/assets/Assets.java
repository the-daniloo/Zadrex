package com.assets;

import java.awt.image.BufferedImage;

import com.graphics.ImageLoader;
import com.graphics.SpriteSheet;

public abstract class Assets {
	public static SpriteSheet sheet;
	
	public static BufferedImage b;
	
	public static void init() {
		sheet = new SpriteSheet(ImageLoader.load("/tile.png"));
		b = sheet.get(0, 16, 16, 16);
	}
}
