package notes;

public class ExceptionHandlingTest
{
   public static void main(String[] args)
   {
	   ExceptionHandling t1 =  new ExceptionHandling(2,3,4);
	   System.out.println(t1);
	   //Invalid inputs
	   ExceptionHandling t2 = new ExceptionHandling(60,59,12);
	   System.out.println(t2);
	   
	   
	   
	   try 
	   {
		   ExceptionHandling t3 = new ExceptionHandling(60,59,12);
		   System.out.println("This line will be skipped, if exception occurs");
	   }
	   catch (IllegalArgumentException ex)
	   {
		   ex.printStackTrace();
	   }
	   System.out.println("aslfl");
   }
}
