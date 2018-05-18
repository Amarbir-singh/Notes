package notes;

public class ThisAsMethodParameter2 extends ThisAsMethodParameter
{
   int i;
   void method()
   {
	   method1(this);
   }
   void method1(ThisAsMethodParameter2 t)
   {
	   System.out.println(t.i);
   }
}
