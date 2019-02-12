
 class Person 
{
//	int age;
	
	void addAge(int age)
	{		
		age = age +10;
		System.out.println("Person: "+age);
		///???? 
	}
	
	void addAgeArr(int ageArr[])
	{
		ageArr[0] = ageArr[0] + 10;
		System.out.println("Person:"+ ageArr[0]);
	}
	
	void addCar(Car c1)
	{
		//c1.year = c1.year + 10;
		c1.setYear(c1.getYear() + 10);
		
		//System.out.println("Person Car:"+ c1.year);
		System.out.println("Person Car:"+ c1.getYear());
	}
	
	void addCarArr(Car c1[])
	{
		//c1[0].year = c1[0].year + 10;
		c1[0].setYear( c1[0].getYear() + 10);
		//System.out.println("Person CarArr:"+ c1[0].year);
		System.out.println("Person CarArr:"+ c1[0].getYear());
	}

}
