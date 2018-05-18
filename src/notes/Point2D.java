package notes;

public class Point2D
{
	
   float x= 0.0f;
   float y = 0.0f;
   public Point2D(float x, float y)
   {
	   this.x = x;
	   this.y = y;
	}
   public Point2D()
   {
	   this.x = 0.0f;
	   this.y = 0.0f;
   }
   public float getX()
   {
	   return this.x;
   }
   public void setX(float x)
   {
	   this.x = x;
   }
   public float getY()
   {
	   return this.y;
   }
   public void setY(float y)
   {
	   this.y = y;
   }
   public void setXY(float x, float y)
   { 
	   this.x=x;
	   this.y =y;
	  
   }
   public float[] getXY()
   {
	   float[] arr = new float[2];
	   arr[0] = this.x;
	   arr[1] = this.y;
	   return arr;
   }
   public String toString()
   {
	   return "("+x+","+y+")";
   }
   
}
