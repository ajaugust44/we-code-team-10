package turtlemap;

public class Avatar 
{
	public int x;
	public int y;
	
	public String direction;
	
	public Avatar(int x, int y)
	{
		this.x = x;
		this.y = y;
		this.direction = "E";
	}
	
	public void setX(int x)
	{
		this.x = x;
	}
	
	public int getX()
	{
		return this.x;
	}
	
	public void setY(int y)
	{
		this.y = y;
	}
	
	public int getY()
	{
		return this.y;
	}
}
