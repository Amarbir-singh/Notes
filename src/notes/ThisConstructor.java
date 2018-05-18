package notes;

public class ThisConstructor 
{
    public ThisConstructor()
    {
    	this("thi");
    	System.out.println("Inside the constructor withour parameter");
    }
    public ThisConstructor(String str)
    {
    	System.out.println("Inside Constructor with String parameter as "+str);
    }
    public static void main(String[] args)
    {
    	ThisConstructor tc1 = new ThisConstructor();
    }
}
