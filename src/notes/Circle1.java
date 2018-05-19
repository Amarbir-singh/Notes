package notes;

public class Circle1 extends Shape
{
	static final double PI =  3.141;
   double radius = 1.0;
   
   public Circle1()
   {
	   this.radius = 1.0;
   }
   public Circle1(double radius)
   {
	   this.radius = radius;
   }
   public Circle1(double radius,String color,boolean filled)
   {
	   this.radius = radius;
	   this.color = color;
	   this.filled = filled;
	   
   }
   public double getRadius()
   {
	   return radius;
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
