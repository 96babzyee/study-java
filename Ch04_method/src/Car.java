
public class Car 
{
	private int year;
	
	Car()
	{
		year=2015;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	private int real_add(int a, int b)
	{
		int sum = a +b;
		return sum;
	}
	
	public int add(int a, int b)
	{
		int sum = real_add(a,b);
		return sum;
	}
	
	
	
	

}
