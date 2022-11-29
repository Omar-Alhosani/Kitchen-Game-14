package chef.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;

import com.badlogic.gdx.math.Rectangle; //Used to represent chefs and surroundings
public class MyGdxGame extends ApplicationAdapter {
	private Texture ChefImage; //Image of the chef variable
	private Texture BGImage; //Image for the background
	private OrthographicCamera camera; //Camera which will be used to view the game
	private SpriteBatch batch; //Sprite batch which will use the ChefImage to display the character
	private Rectangle ChefA; //Creates ChefA Rectangle/Hitbox

	@Override
	public void create() {
		//Loads the images for Chef and Background (BG) in, 64x64 pixels each
		//ChefImage = new Texture(Gdx.files.internal("ChefImage.png"));
		//BGImage = new Texture(Gdx.files.internal("BGImage.png"));

		//Creates the camera and sprite batch
		camera = new OrthographicCamera();
		camera.setToOrtho(false, 800, 480); //Camera shows the whole screen (currently set to 800x480 (android landscape))
		batch = new SpriteBatch();

		//Create Chef rectangle
		ChefA = new Rectangle();
		ChefA.x = 800 / 2 - 64 / 2;
		ChefA.y = 20;
		ChefA.width = 100;
		ChefA.height = 50;

	}

	@Override
	public void render () {
		ScreenUtils.clear(0, 0, 1, 0);
		camera.update();
		batch.setProjectionMatrix(camera.combined);
		batch.begin();
		batch.draw(ChefA.x, ChefA.y);
		batch.end();
	}
	
	@Override
	public void dispose () {
	}
}
