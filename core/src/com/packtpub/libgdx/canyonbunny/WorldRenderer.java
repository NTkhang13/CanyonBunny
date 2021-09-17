package com.packtpub.libgdx.canyonbunny;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Disposable;

public class WorldRenderer implements Disposable {

	private OrthographicCamera camera;
	private SpriteBatch batch;
	private WorldRenderer WorldController;
	
	public WorldRenderer(WorldRenderer worldRenderer) {
		super();
		this.WorldController = worldRenderer;
	}
	public void init () {
		
	}
	
	public void render() {
		
	}
	
	public void resize(int width, int height) {
		
	}
	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

}
