package notes;

public class TimeTest 
{
	 public static void main(String[] args)
	   {
		   Time t1 = new Time(59,59,3);
		   System.out.println(t1.toString());
		   System.out.println(t1.nextSecond());
	   }
}
