package notes;

public class ThisMethod
{
   public static void main(String [] args)
   {
	   ThisMethod tm1 = new ThisMethod();
	   tm1.methodTwo();
   }
   void methodOne()
   {
	   System.out.println("Inside method one");
   }
   void methodTwo()
   {
	   System.out.println("Inside method Two");
   }
   
}
