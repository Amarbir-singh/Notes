package notes;

public class Ball
{
      private double x;
      private double y;
      private double xStep;
      private double yStep;
      public Ball(double x, double y, double xStep,double yStep)
      {
    	  this.x = x;
    	  this.y = y;
    	  this.xStep = xStep;
    	  this.yStep = yStep;
      }
      public double getX()
      {
    	  return this.x;
      }
      public void setX(double x)
      {
    	  this.x = x;
      }
      public void setY(double y)
      {
    	  this.y = y;
      }
      public double getY()
      {
    	  return this.y;
      }
      public double getXStep()
      {
    	  return this.xStep;
      }
      public void setXStep(double xStep)
      {
    	  this.xStep = xStep;
      }
      public void setYStep(double yStep)
      {
    	  this.yStep = yStep;
      }
      public double getYStep(double yStep)
      {
    	  return this.yStep;
      }
      public String toString()
      {
    	  return "Ball@("+x+","+y+"),speed("+xStep+","+yStep+")";
      }
      public double[] getXY()
      {
    	  double[] results = new double[2];
    	  results[0] = this.x;
    	  results[1] = this.y;
    	  return results;
      }
      public void setXY(double x,double y)
      {
    	  this.x = x;
    	  this.y = y;
      }
      public double[] getXYStep()
      {
    	  double [] results = new double[2];
    	  results[0] = this.xStep;
    	  results[1] = this.yStep;
    	  return results;
      }
      public void setXYStep(double xStep,double yStep)
      {
    	  this.xStep = xStep;
    	  this.yStep = yStep;
      }
      public Ball move()
      {
    	  x+=xStep;
    	  y+=yStep;
    	  return this;
      }
}
