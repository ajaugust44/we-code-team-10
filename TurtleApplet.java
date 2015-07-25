package turtlemap;

import processing.core.PApplet;
import processing.core.PImage;


public class TurtleMap extends PApplet {

	String paths = System.getProperty("user.home") + "/wecode/";
	String mtnPath = paths + "mountains.png";
	String boatPath = paths + "boat.png"; 
	String pengRPath = paths + "pengyR.png";
	String pengLPath = paths + "pengyL.png";
	String pengUPath = paths + "pengyU.png";
	String pengDPath = paths + "pengyD.png";
	
	
	
	String lilPengPath = paths + "littlePengy.png";
	PImage mtns, boat, lilPeng, pengR, pengL, pengU, pengD;
	
	int lineColor = 20;
	int gridSize;
	
	int HEIGHT = 500, WIDTH = 500;
	
	Game game;

	Boolean move = false;
	int[] moves = {0, 1, 1, 1, 0, 0, 0, 0, 1, 0,
					0, 0, 0, 1, 1, 1, 0, 0, 0, 0,
					0, 1, 0, 0, 0, 1, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0 };
	int currMove = 0;
	
	public void setup() {
		size( WIDTH, HEIGHT);
		
		stroke(lineColor);
		gridSize = height/10;
		
		mtns = loadImage(mtnPath);
		boat = loadImage(boatPath);
		
		pengR = loadImage(pengRPath);
		pengL = loadImage(pengLPath);
		pengU = loadImage(pengUPath);
		pengD = loadImage(pengDPath);

		lilPeng = loadImage(lilPengPath);
		
		drawGrid();
		game = new Game();
	}
	
	public void draw() {
		
		drawObstacles();
		drawTurtle();
		drawGrid();	
		
		if (mousePressed) {
			move = true;
			frameRate(2);
		}
		
		if(move){
			moveTurtle();
		}
		
	}
	
	public void drawGrid() {
		stroke(lineColor);
		strokeWeight(1);
		
		//draw row lines
		for(int i = 1; i < 11; i ++) {
			line(0, i * gridSize, 10 * gridSize, i * gridSize);
		}
		
		for(int i = 1; i < 11; i++) {
			line(i*gridSize, 0,i* gridSize, 10 * gridSize);
		}
	}
	
	
	public void drawObstacles() {
		background(230, 255, 255);
		image(mtns, gridSize * 2, 0, gridSize * 2, gridSize * 5 );
		image(mtns, gridSize * 2, gridSize * 6, gridSize * 2, height/2);
		image(mtns, gridSize * 6, gridSize * 2, gridSize * 2, gridSize * 5);
		image(mtns, gridSize * 6, gridSize * 7, gridSize * 2, gridSize * 5);
		
		image(boat, gridSize * 4, gridSize * 6, gridSize * 2, gridSize );
		
		image(lilPeng, gridSize * 9, gridSize * 9, gridSize, gridSize);
	}
	
	public void drawTurtle() {
		PImage i;
		Avatar peng = game.me;
		
		switch(peng.direction) {
		case "E":
			i = pengR;
			break;
		case "W":
			i = pengL;
			break;
		case "N":
			i = pengU;
			break;
		case "S":
			i = pengD;
			break;
		default:
			i = pengD;
		}
		image(i, peng.getX() * gridSize, peng.getY() * gridSize, gridSize, gridSize);
	}
	
	public void moveTurtle() {
		if (move) {
			System.out.println("P " + moves[currMove] + game.me.direction);
			if(moves[currMove] == 0) {
				game.moveForward(1);
			} else if (moves[currMove] == 1) {
				game.turnClockwise();
			}
		currMove += 1;
		}
	}
	
	
}
