package notes;

public class TestPoint3D {

	public static void main(String[] args)
	{
		Point3D p1 = new Point3D(5,6,7);
		Point2D p2 = new Point2D(5,6);
		System.out.println(p1.getXYZ()[0]);
		System.out.println(p1.getXYZ()[1]);
		System.out.println(p1.getXYZ()[2]);
		System.out.println(p1.toString());
		

	}

}
