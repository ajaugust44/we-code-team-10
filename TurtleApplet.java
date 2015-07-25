package turtlemap;

import processing.core.PApplet;


public class TurtleMap extends PApplet {

	int bgColor = 230;
	int lineColor = 20;
	int gridSize;
	
	int HEIGHT = 500, WIDTH = 500;
	

	public void setup() {
		size( WIDTH, HEIGHT);
		background(bgColor);
		stroke(lineColor);
		gridSize = height/10;
		
	}

	public void draw() {
		drawGrid();	
		drawObstacles();
		drawTurtle();
	}
	
	public void drawGrid() {
		gridSize = height/10;
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
		
	}
	
	public void drawTurtle() {
		
	}
	
}
