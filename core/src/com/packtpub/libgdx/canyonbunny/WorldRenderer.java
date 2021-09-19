package com.packtpub.libgdx.canyonbunny;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Disposable;

public class WorldRenderer implements Disposable {

	
	private OrthographicCamera camera;
	private SpriteBatch batch;
	private WorldController worldController;
	
	public WorldRenderer(WorldController worldController) {
		this.worldController = worldController;
		init ();
	}
	private void init () {
		batch = new SpriteBatch();
		camera = new OrthographicCamera(Constant.VIEWPORT_WIDTH, Constant.VIEWPORT_HEIGHT);
		camera.position.set(0, 0, 0);
		camera.update();
	}
	
	public void render() {
    	renderObjects();
    }
	
	 private void renderObjects() {
	    	batch.setProjectionMatrix(camera.combined);
	    	batch.begin();
	    	for (Sprite spr : worldController.testSprites) {
				spr.draw(batch);
			}
	    	worldController.sprCar.draw(batch);
	    	batch.end();
	    }
	    
	public void resize(int width, int height) {
		camera.viewportWidth = (Constant.VIEWPORT_HEIGHT / height) *
    			width;
    	camera.update();

	}
	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		batch.dispose();
	}

}
