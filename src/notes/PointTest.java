package notes;

public class PointTest 
{
  public static void main(String[] args)
  { 
	 Line1 line1 = new Line1(1,2,3,4);
	 
	 System.out.println(line1.end.getY());
	 System.out.println(line1.getX());
	 
	 System.out.println(line1.getBegin().getX());
	 System.out.println(line1.getLength());
	 
  }
//	  Point p1 = new Point(1,2);
//	  System.out.println(p1);
//	  
//	  Point p2 = new Point();
//	  System.out.println(p2);
//	  
//	  p1.setX(3);
//	  p1.setY(4);
//	  System.out.println(p1);
//	  System.out.println("X is:  "+p1.getX());
//	  System.out.println("Y is:  "+p1.getY());
//	  
//	  p1.setXY(5,4);
//	  System.out.println(p1);
//	  System.out.println("X is:  "+p1.getXY()[0]);
//	  System.out.println("y is:  "+p1.getXY()[1]);
//	  
//	  
//	  p2.setXY(13,15);
//	 
//	  System.out.printf("Distance is: %.2f%n", p1.distance(p2));
//	  System.out.printf("Distance is: %.2f%n", p1.distance(p1));
//	  System.out.printf("Distance is: %.2f%n", p1.distance());
//  }
}
