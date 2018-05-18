package notes;

public class Staff extends Person
{
  String school;
  int year;
  double pay;
  public Staff(String name, String address,String school,int year, double pay)
  {
	  super(name, address);
	  this.school = school;
	  this.year = year;
	  this.pay = pay;
	  
  }
  public String getSchool()
  {
	  return school;
  }
  public void setPay(double pay)
  {
	  this.pay = pay;
  }
  public String toString()
  {
	  return "Staff["+super.toString()+school+pay;
  }
}
