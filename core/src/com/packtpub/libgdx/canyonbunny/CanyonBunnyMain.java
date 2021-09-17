package com.packtpub.libgdx.canyonbunny;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class CanyonBunnyMain extends ApplicationAdapter {
	private static final String TAB = CanyonBunnyMain.class.getName();
	private WorldController WorldController;
	private WorldRenderer WorldRenderer;
	
	
	@Override
	public void create() {
		WorldController = new WorldController();
		WorldRenderer = new WorldRenderer(WorldRenderer);
		
	}
	
    @Override
	public void render() {
    	WorldController.update(Gdx.graphics.getDeltaTime());
		Gdx.gl.glClearColor(0x64/255.0f, 0x95/255.0f, 0xed/255, 0xff/255.0f);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		WorldRenderer.render();
    }
    
    @Override 
    public void resize(int width, int height) {
    	// TODO Auto-generated method stub
    	WorldRenderer.resize(width, height);
    	
    }
    
    @Override 
    public void pause() {
    	// TODO Auto-generated method stub
    	super.pause();
    	
    }
    
    @Override 
    public void resume() {
    	// TODO Auto-generated method stub
    	super.resume();
    	
    }
    
    @Override 
    public void dispose() {
    	WorldRenderer.dispose();
    	
    }
	
	//@Override
	
}
