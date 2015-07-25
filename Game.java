package turtlemap;

import java.util.Arrays;
import java.util.List;


public class Game 
{
	//start in the lower left corner, facing right
	Avatar me = new Avatar(0, 9);
	Map map;
	
	//constructor
	public Game() {
		map = new Map(10, 10);
		
		//set blocked squares
		map.setBlocked(2, 0);
		map.setBlocked(3, 0);
		map.setBlocked(4, 0);
		map.setBlocked(5, 0);
		map.setBlocked(6, 0);
		map.setBlocked(7, 0);
		map.setBlocked(2, 1);
		map.setBlocked(3, 1);
		map.setBlocked(4, 1);
		map.setBlocked(5, 1);
		map.setBlocked(6, 1);
		map.setBlocked(7, 1);
		map.setBlocked(2, 2);
		map.setBlocked(3, 2);
		map.setBlocked(4, 2);
		map.setBlocked(5, 2);
		map.setBlocked(6, 2);
		map.setBlocked(7, 2);
		map.setBlocked(2, 3);
		map.setBlocked(3, 3);
		map.setBlocked(4, 3);
		map.setBlocked(5, 3);
		map.setBlocked(6, 3);
		map.setBlocked(7, 3);
		map.setBlocked(6, 4);
		map.setBlocked(6, 5);
		map.setBlocked(6, 6);
		map.setBlocked(6, 7);
		map.setBlocked(7, 4);
		map.setBlocked(7, 5);
		map.setBlocked(7, 6);
		map.setBlocked(7, 7);
		map.setBlocked(2, 5);
		map.setBlocked(2, 6);
		map.setBlocked(2, 7);
		map.setBlocked(2, 8);
		map.setBlocked(2, 9);
		map.setBlocked(3, 5);
		map.setBlocked(3, 6);
		map.setBlocked(3, 7);
		map.setBlocked(3, 8);
		map.setBlocked(3, 9);	
	}

	public void moveForward(int spaces) {		
		//change y +
		if (me.direction.equals("N")) {
			int i = 1;
			while (!map.isBlocked(me.x, me.y + 1) && i <= spaces) {
				me.y += 1;
				i++;
			}
			//went too far
			if (i < spaces) {
				explode();
			}
		}
		
		//change y -
		else if (me.direction.equals("S")) {
			int i = 1;
			while (!map.isBlocked(me.x, me.y - 1) && i <= spaces) {
				me.y -= 1;
				i++;
			}
			
			//went too far
			if (i < spaces) {
				explode();
			}
		}
		
		//change x +	
		else if (me.direction.equals("E")) {
			int i = 1;
			while (!map.isBlocked(me.x + 1, me.y) && i <= spaces) {
				me.x += 1;
				i++;
			}
			
			//went too far
			if (i < spaces) {
				explode();
			}
		}
		
		//change x -
		else if (me.direction.equals("W")) {
			int i = 1;
			
			while (!map.isBlocked(me.x - 1, me.y) && i <= spaces) {
				me.x -= 1;
				i++;
			}
			
			//went too far
			if (i < spaces) {
				explode();
			}
		}
		
		else {
			//error - do nothing
		}
	}

	public void turnClockwise() {
		List<String> dirArr = Arrays.asList("N", "E", "S", "W");
		String current = me.direction;
		int i = dirArr.indexOf(current);
		
		i++;
		
		if (i == 4) {
			i = 0;
		}
		me.direction = dirArr.get(i); 
	}

	public void turnCClock()
	{
		List<String> dirArr = Arrays.asList("N", "W", "S", "E");
		String current = me.direction;
		int i = dirArr.indexOf(current);
		i++;
		if (i == 4)	{
			i = 0;
		}
		me.direction = dirArr.get(i); 
	}
	
	public void explode()
	{
		//TODO:
	}
}
