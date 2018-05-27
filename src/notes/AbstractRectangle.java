package notes;

public class AbstractRectangle extends AbstractShape
{
	  double width;
	  double length;
	   
  public AbstractRectangle()
  {
	  this.length=1;
	  this.width=1;
  }
  public AbstractRectangle(double width,double length)
  {
	  this.length=length;
	  this.width =width;
	  this.color = "red";
	  this.filled = true;
  }
  public AbstractRectangle(double width,double length,String color,boolean filled)
  {
	  this.width=width;
	  this.length=length;
	  this.color = color;
	  this.filled = filled;
  }
  public double getWidth()
  {
	  return this.width;
  }
  public void setWidth(double width)
  {
	  this.width = width;
  }
  public double getLength()
  {
	  return this.length;
  }
  public void setLength(double length)
  {
	  this.length = length;
  }
  public double getArea()
  {
	  return length*width;
  }
  public double getPerimeter()
  {
	  return 2*(length+width);
  }
  public String toString()
  {
	  return "length = "+length+"width = "+width;
  }
}
