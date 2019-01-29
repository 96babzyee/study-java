
public class HumanMain {
	
	Human aHuman2;

	public static void main(String[] args) 
	{
		Human aHuman;//레퍼런스 변수명?? 미생
		aHuman = new Human("홍길동");
//		aHuman.age = 21;
//		aHuman.height = 180.5;
//		aHuman.weight = 73.2;
		//HumanMain클래스에서 Human클래스의 변수에 직접 접근 하면 안됨!
		//메소드로 접근해야 한다. 캡슐화, 은닉화
		
		aHuman.setAge(21);
//		aHuman.printAge();
		
		//여기서 age는 멤버변수가 아니라 main()메소드의 지역변수!!
		int age = aHuman.getAge();
//		System.out.println("나이는=" + aHuman.age);
		System.out.println("HuamnMain 1: 나이는=" + age );
		System.out.println("HuamnMain 2: 나이는=" + aHuman.getAge() );
		
//		System.out.println("이름은=" + aHuman.name);
//		System.out.println("몸무게는=" + aHuman.weight);
		
		
		Human h1[] = new Human[5];
		
		for(int i=0; i< h1.length; ++i)
		{
			h1[i] = new Human("홍길동");
			h1[i].setScanner();
		}
		
		for(int i=0; i< h1.length; ++i)
		{
			h1[i].printAll();
		}
				

	}

}
