package notes;

public class StaticUseWithoutInstance
{
    static int i=10;
    static void method()
    {
    	System.out.println("Inside static method ");
    }
    
	public static void main(String[] args)
	{
		//Accessing Static void method
		StaticUseWithoutInstance.method();
	
		//Accessing Static variables
		System.out.println(StaticUseWithoutInstance.i);
		
		/*
		 * No instance is required to access Static variable or method as we
		 * have seen above. Still we can access the same static  varaible
		 * and static method using Instance references as below.
		 * 
		 * */
		StaticUseWithoutInstance obj1 = new StaticUseWithoutInstance();
		StaticUseWithoutInstance obj2 = new StaticUseWithoutInstance();
        /*Accessing static variable in Non Static way. Compiler will warn you with
         * below warning.
         * 
         * The static field StaticUseWithoutInstance.i should be accessed in a static way
         * 
         * 
         * */
		System.out.println(obj1.i);
		obj1.method();
	}

}
