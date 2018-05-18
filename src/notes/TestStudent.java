package notes;

public class TestStudent 
{
   public static void main(String[] args)
   {
	   Student s1 = new Student("hey!","hoo");
	   System.out.println(s1);
	   s1.setAddress("java environment");
	   System.out.println(s1);
	   
	   System.out.println(s1.getName());
	   System.out.println(s1.getAddress());
	   
	   s1.addCourseGrade("M101",89);
	   s1.addCourseGrade("M101",99);
	   s1.addCourseGrade("M101",80);
	   s1.printGrades();
	   
	   System.out.printf("The average grade is %.2f%n",s1.getAverageGrade());
   }
}
