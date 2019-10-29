
public class Hangar 
{
	public static void main(String[] args) 
	{
		Car myCar = new Car("Peugeot", 15);
		Boat myBoat = new Boat("Titanic", 2500);
		System.out.println(myCar.doStuff());
		System.out.println(myBoat.doStuff());
	}

}
