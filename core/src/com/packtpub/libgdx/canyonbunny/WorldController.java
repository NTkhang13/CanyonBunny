package com.packtpub.libgdx.canyonbunny;

import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Pixmap.Format;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.utils.IntSet.IntSetIterator;

public class WorldController {
	private static final String TAG =
	        WorldController.class.getName();
	private Sprite[] testSprite;
	private int selectedSprite;
	private Sprite[] testSprites;
	private int i;
	
	
	
	
	
	public void WorldController() {
		init();
		
	}
	
	
    private void init() {
    	initTestObject();
    	
    }
    
    private void initTestObject() {
    	testSprite = new Sprite [5];
    	int width = 32;
    	int height = 32;
    Pixmap pixmap = createProceduralPixmap(width, height);
    
    Texture texture = new Texture(pixmap);
    for (int i = 0; i < testSprite.length; i++) {
    		
    	Sprite spr = new Sprite(texture);
        // Define sprite size to be 1m x 1m in game world
        spr.setSize(1, 1);
        // Set origin to sprite's center
        spr.setOrigin(spr.getWidth() / 2.0f, spr.getHeight() / 2.0f);
        // Calculate random position for sprite
        float randomX = MathUtils.random(-2.0f, 2.0f);
        float randomY = MathUtils.random(-2.0f, 2.0f);
        spr.setPosition(randomX, randomY);
        // Put new sprite into array
        testSprites[i] = spr;
    	}
    	selectedSprite = 0;
    }
    
    private Pixmap createProceduralPixmap(int width, int height) {
        Pixmap pixmap = new Pixmap(width, height, Format.RGBA8888);
        // Fill square with red color at 50% opacity
        pixmap.setColor(1, 0, 0, 0.5f);
        pixmap.fill();
        // Draw a yellow-colored X shape on square
        pixmap.setColor(1, 1, 0, 1);
        pixmap.drawLine(0, 0, width, height);
        pixmap.drawLine(width, 0, 0, height);
        // Draw a cyan-colored border around square
        pixmap.setColor(0, 1, 1, 1);
        pixmap.drawRectangle(0, 0, width, height);
        return pixmap;
    }

    
    public void update(float deltaTime) {}
    private void updateTestObjects(float deltaTime) {
        // Get current rotation from selected sprite
        float rotation = testSprites[selectedSprite].getRotation();
        // Rotate sprite by 90 degrees per second
        rotation += 90 * deltaTime;
        // Wrap around at 360 degrees
        rotation %= 360;
        // Set new rotation value to selected sprite
        testSprites[selectedSprite].setRotation(rotation);
    }


	public void render() {
		// TODO Auto-generated method stub
		
	}


	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}


	

	


	


	
	
}
