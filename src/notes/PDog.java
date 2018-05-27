package notes;

public class PDog extends PAnimal
{
  @Override
  public void greeting()
  {
	  System.out.println("Woof!");
  }
  public void greeting(PDog another)
  {
	  System.out.println("Wooooooooooof!");
  }
}
