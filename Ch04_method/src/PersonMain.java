public class PersonMain {
	public static void main(String[] args) {
		int age = 20; // main()�޼ҵ��� �������� (��������ƴ�)
		int ageArr[] = {11, 22, 33};
		
		Person p1 = new Person();
		//1. ���� age
		p1.addAge(age);
		System.out.println("PersonMain: "+age);
		
		//2. �迭 ageArr
		p1.addAgeArr(ageArr);
		System.out.println("PersonMain: "+ ageArr[0]);
		
		//3. ��ü c
		Car c = new Car(); //2015��� �ڵ��� ����
		c.year = 2015;
		System.out.println("PersonMain 1: "+c.year); //2015
		p1.addCar(c); //2025
		System.out.println("PersonMain 2: "+c.year); //2025
		
		//4. ��ü �迭 c2[]
		Car c2[] = new Car[3];
		c2[0] = new Car();
		c2[1] = new Car();
		c2[2] = new Car();
		
		p1.addCarArr(c2); //2025
		System.out.println("PersonMain Car Arr:"+c.year); //2025
	}
}
