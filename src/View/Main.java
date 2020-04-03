package View;

import Controller.ControllerMain;
import processing.core.PApplet;

public class Main extends PApplet {

	private ControllerMain controllerMain;

	public static void main(String[] args) {
		PApplet.main(Main.class.getName());
	}

	public void settings() {

		size(800, 600);

	}

	public void setup() {

		controllerMain = new ControllerMain(this);
	}

	public void draw() {
		
		
		background(0);
		controllerMain.pintar();

	}

	public void keyPressed() {

		controllerMain.sortList(key);

	}
}