package notes;

public class TestI1 {

	public static void main(String[] args) 
	{
	    	ICylinder c1 = new ICylinder();
	    	
	    	
	    	System.out.println(i1.getArea());
	    	System.out.println(c1.getRadius());
	    	System.out.println("Cylinder:"
	    			+ "  radius = "+c1.getRadius()
	    			+ "  height = "+ c1.getHeight()
	    			+ "  bas area = "+c1.getArea()
	    			+ "  volume = "+c1.getVolume());

	    	ICylinder c2 = new ICylinder(10.0);
	    	System.out.println("Cylinder:"
	    			+ "  radius = "+c2.getRadius()
	    			+ "  height = "+ c2.getHeight()
	    			+ "  bas area = "+c2.getArea()
	    			+ "  volume = "+c2.getVolume());
	    	ICylinder c3 = new ICylinder(2.0,10.0,"blue");
	    	System.out.println("Cylinder:"
	    			+ "  radius = "+c3.getRadius()
	    			+ "  height = "+ c3.getHeight()
	    			+ "  bas area = "+c3.getArea()
	    			+ "  volume = "+c3.getVolume());
	}

}
