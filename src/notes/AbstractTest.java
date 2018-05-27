package notes;

public class AbstractTest
{
    public static void main(String[]args)
    {
    	
    	AbstractShape as1 = new AbstractCircle(6.5,"grey",false);
    	/*
    	 * why Upcast Circle to shape
    	 * or whatever it is
    	 * */
    	System.out.println(as1);
    	System.out.println(as1.getArea());
    	System.out.println(as1.getPerimeter());
    	System.out.println(as1.getColor());
    	System.out.println(as1.isFilled());
    	//System.out.println(as1.getRadius());
    	
    	AbstractCircle ac1 = new AbstractCircle();
    	System.out.println(ac1);
    	System.out.println(ac1.getArea());
    	System.out.println(ac1.getPerimeter());
    	System.out.println(ac1.getColor());
    	System.out.println(ac1.isFilled());
    	System.out.println(ac1.getRadius());
    
       /*
        * Downcast back to circle??????????????????
        * */
    	AbstractCircle ac2 = (AbstractCircle) as1;
    	System.out.println(ac2);
    	System.out.println(ac2.getArea());
    	System.out.println(ac2.getPerimeter());
    	System.out.println(ac2.getColor());
    	System.out.println(ac2.isFilled());
    	System.out.println(ac2.getRadius());
    
         //AbstractShape as3 = new AbstractShape();
         
    	AbstractShape a4 = new AbstractRectangle(1.0,2.0,"RED",false);//upcast
    	System.out.println(a4);
    	System.out.println(a4.getArea());
    	System.out.println(a4.getPerimeter());
    	System.out.println(a4.getColor());
    //	System.out.println(a4.getLength());
    	
        
    	AbstractRectangle a5 = (AbstractRectangle) a4;
    	System.out.println(a5);
    	System.out.println(a5.getArea());
    	System.out.println(a5.getColor());
    	System.out.println(a5.getLength());
    	
    	
    	AbstractSquare a6 = (AbstractSquare) a5; //error why
    	System.out.println(a6);
    	System.out.println(a6.getArea());
    	System.out.println(a6.getColor());
    	System.out.println(a6.getLength());
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    
    }
}
