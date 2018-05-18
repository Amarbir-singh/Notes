package notes;

public class ICylinder  extends ICircle
{
	private double height = 1.0;
	public ICylinder()
	{
		super();
		height  = 1.0;
	}
	public ICylinder(double height)
	{
		super();
		this.height = height;
	}
	public ICylinder(double radius, double height, String color)
	{
		super(radius,color);
		this.height = height;
	}
	public double getHeight()
	{
		return height;
	}
	public void setHeight(double height)
	{
		this.height = height;
	}
	public double getVolume()
	{
		return getArea()*height;
	}
}
