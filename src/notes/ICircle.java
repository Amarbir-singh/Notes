package notes;

public class ICircle
{
   public double radius = 1.0;
    String color = "red";
    static final double PI = 3.141;
   
   public ICircle()
   {
	   this.radius = 1.0;
	   this.color  = "red";
   }
   public ICircle(double radius)
   {
	   this.radius = radius;
	   this.color  = "red";
   }
   public ICircle(double radius, String color)
   {
	   this.radius = radius;
	   this.color  = color;
   }
   public double getRadius()
   {
	   return this.radius;
   }
   public void setRadius(double radius)
   {
	   this.radius = radius;
   }
  
   public String getColor()
   {
	   return this.color;
   }
   public void setColor(String color)
   {
	   this.color = color;
   }
   public double getArea()
   {
	   return  PI*this.radius*this.radius;
   }
   public String toString()
   {
	   return "Circle["+radius+","+color+"]";
   }
}
