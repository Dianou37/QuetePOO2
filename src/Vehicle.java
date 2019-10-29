
public abstract class Vehicle 
{

	//atributs
	private String brand;
	private int kilometers;
	
	//Constructeurs
	public Vehicle(String brand, int kilometers) 
	{
		this.kilometers = kilometers;
		this.brand = brand;
	}
	
	//Getters
	public String getBrand() 
	{
		return this.brand;
	}
	public int getKilometers() 
	{
		return this.kilometers;
	}
	
	//Setters
	public void setBrand(String brand)
	{
		this.brand = brand;
	}
	public void setKilometers(int kilometers)
	{
		this.kilometers = kilometers;
	}
	//Abstract Methode
	public abstract String doStuff();
}
