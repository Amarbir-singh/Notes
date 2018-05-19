package notes;

public class Rectangle extends Shape
{
   double width = 1.0;
   double length = 1.0;
   public Rectangle()
   {
	   this.width =1.0;
	   this.length =1.0;
   }
   public Rectangle(double length, double width)
   {
	   this.length = length;
	   this.width = width;
   }
   public Rectangle(double length, double width,String color,boolean filled)
   {
	   this.length = length;
	   this.width = width;
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
	   return length;
   }
   public void setLength(double length)
   {
	   this.length =length;
   }
   public double getArea()
   {
	   return this.length*this.width;
   }
   public double getPerimeter()
   {
	   return 2*(this.length+this.width);
   }
   public String toString()
   {
	   return "["+length+","+width+"]";
   }
   
   
}
