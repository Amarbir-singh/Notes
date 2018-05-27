package notes;

public class AbstractCircle extends AbstractShape
{
	static final double PI =  3.141;
	   double radius = 1.0;
	   
	   public AbstractCircle()
	   {
		   this.radius = 1.0;
	   }
	   public AbstractCircle(double radius)
	   {
		   this.radius = radius;
	   }
	   public AbstractCircle(double radius,String color,boolean filled)
	   {
		   this.radius = radius;
		   this.color = color;
		   this.filled = filled;
		   
	   }
	   public double getRadius()
	   {
		   return this.radius;
	   }
	   public void setRadius(double radius)
	   {
		   this.radius = radius;
	   }
	   public double getArea()
	   {
		   return PI*radius*radius;
	   }
	   public double getPerimeter()
	   {
		   return  2*PI*radius;
	   }
	   public String toString()
	   {
		   return "radius = "+radius+","+" color = "+color;
	   }
}
