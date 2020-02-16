package com.graphics;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public abstract class ImageLoader {
	
	public final static BufferedImage load(String path) {
		BufferedImage img = null;
		URL url = ImageLoader.class.getResource(path);
		if(url == null) {
			throw new RuntimeException("The file " + path + " couldn't be found");
		} else {
			try {
				img = ImageIO.read(url);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return img;
	}
	
}
