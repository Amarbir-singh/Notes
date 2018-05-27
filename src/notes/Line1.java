package notes;

public class Line1 extends Point
{
	   Point end;
	   
	   public Line1(Point begin, Point end)
	   {
		   super(begin.getX(),begin.getY());
		   this.end = end;
	   }
	   public Line1(int beginX, int beginY, int endX, int endY)
	   {
		   super(beginX, beginY);
		   this.end = new Point(endX, endY);
	   }
	   public String toString()
	   {
		   return  super.toString()+","+this.end;
	   }
	   public Point getBegin()
	   {
		   return (Point) this;
	   }
	   public void setBegin(int x, int y)
	   {
		   super.setY(y);
		   super.setX(x);
	   }
	   public void setEnd(int x, int y)
	   {
		   end.setY(y);
		   end.setX(x);
	   }
	   public Point getEnd()
	   {
		   return end;
	   }
	   public int getBeginX()
	   {
		   return this.getX();
	   }
	   public int getBeginY()
	   {
		   return this.getY();
	   }
	   public int getEndX()
	   {
		   return end.getX();
	   }
	   public int getEndY()
	   {
		   return end.getY();
	   }
	   public void setBeginX(int x)
	   {  
		   super.setX(x);
	   }
	   public void setBeginY(int y)
	   {
		   super.setY(y);
	   }
	   public void setEndX(int x)
	   {
		   super.setX(x);
	   }
	   public void setEndY(int y)
	   {
		   super.setY(y);
	   }
	   public double getLength()
	   {
		  int xDiff = getEndX()-getBeginX();
		  int yDiff = getEndY()-getBeginY();
		return     Math.sqrt(xDiff*xDiff+yDiff*yDiff);
	   }
	   public double getGradient()
	   {
		   int xDiff = super.getX()-super.getX();
		   int yDiff = super.getY()-super.getY();
		   return Math.atan2(yDiff, xDiff);
	   }
	   
	   
}
