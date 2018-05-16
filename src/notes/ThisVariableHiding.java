package notes;

public class ThisVariableHiding 
{
	 int x = 10;
	  public static void main(String[] args)
	  {
		  ThisVariableHiding t1 = new   ThisVariableHiding();
		  t1.method(21);
		  t1.method();
	  }
	  void method(int x)
	  {
		  x = 5;
		  System.out.println("value of variable: "+x);
		 
		  
		  //this help in printing the value of instance variable instead of local variable
		  System.out.println("value of instance variable: "+this.x);
		  
	  }
	  void method()
	  {
		 int x =4;
		  System.out.println("value of  variable: "+x);
		  System.out.println("value of instance variable: "+this.x);
	  }
}
