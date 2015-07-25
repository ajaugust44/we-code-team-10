
package turtlemap;

public class Map 
{
	boolean[][] grid;
	
	public Map(int x, int y)
	{
		grid = new boolean[x][y];
	}
	
	public void setBlocked(int x, int y)
	{
		grid[x][y] = true;
	}
	
	public void setClear(int x, int y)
	{
		grid[x][y] = false;
	}
	
	public boolean isBlocked(int x, int y)
	{
		return false;
	}
}
