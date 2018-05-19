package notes;

public class Line 
{
	Point p1 = new Point(10,11);
	Point p2 = new Point(15,17);
   private Point begin;
   private Point end;
   
   public Line(Point begin, Point end)
   {
	   this.begin = begin;
	   this.end = end;
   }
   public Line(int beginX, int beginY, int endX, int endY)
   {
	   begin = new Point(beginX,beginY);
	   end =   new Point(endX, endY);
   }
   public String toString()
   {
	   return  begin+","+end;
   }
   public Point getBegin()
   {
	   return this.begin;
   }
   public void setBegin(Point begin)
   {
	   this.begin =  begin;
   }
   public Point getEnd()
   {
	   return this.end;
   }
   public int getBeginX()
   {
	   return p1.getX();
   }
   public int getBeginY()
   {
	   return p1.getY();
   }
   public int getEndX()
   {
	   return p2.getX();
   }
   public int getEndY()
   {
	   return p2.getY();
   }
   public void setBeginX(int x)
   {  
	   p1.setX(x);
   }
   public void setBeginY(int y)
   {
	   p1.setY(y);
   }
   public void setEndX(int x)
   {
	   p2.setX(x);
   }
   public void setEndY(int y)
   {
	   p2.setY(y);
   }
   public double getLength()
   {
	  int xDiff = getEndX()-getBeginX();
	  int yDiff = getEndY()-getBeginY();
	return     Math.sqrt(xDiff*xDiff+yDiff*yDiff);
   }
   public double getGradient()
   {
	   int xDiff = p2.getX()-p1.getX();
	   int yDiff = p2.getY()-p1.getY();
	   return Math.atan2(yDiff, xDiff);
   }
}
