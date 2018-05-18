package notes;

public class MovablePoint extends Point2D
{
	private float xSpeed =0.0f;
	private float ySpeed =0.0f;
  public MovablePoint(float x,float y,float xSpeed,float ySpeed)
  {
	  this.x = x;
	  this.y = y;
	  this.xSpeed = xSpeed;
	  this.ySpeed = ySpeed;
  }
  public MovablePoint()
  {
	  this.x = 0;
	  this.y = 0;
	  this.xSpeed = 0;
	  this.ySpeed = 0;
  }
  public float getXSpeed()
  {
	  return xSpeed;
  }
  public void setXSpeed(float xSpeed)
  {
	  this.xSpeed = xSpeed;
  }
  public float getYSpeed()
  {
	  return ySpeed;
  }
  public void setYSpeed(float ySpeed)
  {
	  this.ySpeed = ySpeed;
  }
  public void setSpeed(float xSpeed,float ySpeed)
  {
	  this.xSpeed = xSpeed;
	  this.ySpeed = ySpeed;
  }
  public float [] getSpeed()
  {
	  float[] arr = new float[2];
	  arr[0]=this.xSpeed;
	  arr[1]=this.ySpeed;
	  return arr;
  }
  
}
