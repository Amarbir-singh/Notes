package notes;

public class TestPAnimal {

	public static void main(String[] args) 
	{
		System.out.println(0);
		//Using the subclass
	   PCat cat = new PCat();
	   cat.greeting();
	   PDog dog = new PDog();
	   dog.greeting();
	   PBigDog bigDog = new PBigDog();
	   bigDog.greeting();

	   //Using polymorphism
	   System.out.println(1);
	   PAnimal animal1 = new PCat();
	   animal1.greeting();
	   PAnimal animal2 = new PDog();
	   animal2.greeting();
	   PAnimal animal3 = new PBigDog();
	   animal3.greeting();
	//   PAnimal animal4 = new PAnimal();
	   System.out.println(2);
	   
	   //Downcast
	   PDog dog2 = (PDog) animal2;
	   PBigDog bigDog2 = (PBigDog) animal2;
	   PDog dog4 = (PDog) animal2;
	   PCat cat2  = (PCat) animal2;
	   dog2.greeting(dog2);
	      dog4.greeting(dog2);
	      dog2.greeting(bigDog2);
	      bigDog2.greeting(dog2);
	      bigDog2.greeting(bigDog2);
	   
	   
	   
	   
	   
	}

}
