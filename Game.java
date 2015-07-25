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
	}

	public void moveForward(int spaces) {		
		//change y +
		if (me.direction.equals("N")) {
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
		
		//change y -
		else if (me.direction.equals("S")) {
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
	}
}
