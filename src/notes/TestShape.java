package notes;

public class TestShape {

	public static void main(String[] args) 
	{
		Rectangle r1 = new Rectangle(5.0,7.0);	
	       System.out.println(r1);
       Square s1 = new Square(5.0,"green",true);
       System.out.println(s1);
       
       Circle1 c1 = new Circle1(6.0);

       System.out.println("Perimeter of the circle is "+c1.getPerimeter());
       System.out.println(c1);
       
	}

}
