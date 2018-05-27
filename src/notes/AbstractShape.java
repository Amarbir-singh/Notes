package notes;

public abstract class AbstractShape
{
	
	  String color = "red";
	  boolean filled = true;
	  
	  public AbstractShape()
	  {
		  this.color = "red";
		  this.filled = true;
	  }
	  public AbstractShape(String color,boolean filled)
	  {
		  this.color = color;
		  this.filled = filled;
	  }
	  public String getColor()
	  {
		  return color;
	  }
	  public void setColor(String color)
	  {
		  this.color=color;
	  }
	  public boolean isFilled()
	  {
		  return filled;
	  }
	  public void setFilled(boolean filled)
	  {
		  this.filled = filled; 
	  }
	  public String toString()
	  {
		  return "["+this.color+","+this.filled+"]";
	  }	
	  abstract public double getArea();
	  abstract public double getPerimeter();
}
