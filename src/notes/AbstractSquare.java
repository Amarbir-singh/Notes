package notes;

public class AbstractSquare extends AbstractRectangle
{
  public AbstractSquare() 
  {
	  this.length=1.0;
	  this.width=1.0;
  }
  public AbstractSquare(double side,String color,boolean filled)
  {
	  this.length = side;
	  this.width = side;
	  this.color = color;
	  this.filled = filled;
  }
  public double getSide()
  {
	  return this.length;
  }
  public void setSide(double side)
  {
	  this.length = side;
  }
  /*
   * methods defined after this class are not required 
   * but the parent class is Abstract class, therefore, we need to 
   * to define them or make the class abstract. Is there any other way.
   * */
   public  void setWidth(double side)
   {
	   this.length = side;
   }
  public  void setLength(double side) 
   {
	  this.width = side;
   }
  public  String toString()
  {
	  return "side = "+super.toString();
  }
  
}
