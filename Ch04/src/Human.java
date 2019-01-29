import java.util.Scanner;

public class Human 
{
	//멤버 변수는 public은 안됨! private or protected으로 지정
	private String name;
	private int age;
	private double height, weight;
	
//	Human()
//	{
//		
//	}
	//생성자는 무조건 public
	public Human (String name)
	{
		this.name = name;
	}
	
	public Human(String name, int age, double height) 
	{
		this.name = name;
		this.age = age;
		this.height = height;
	}



	//메소드는 public 이냐? private 냐?
	private void printAge() 
	{
		System.out.println("printAge:나이는="+ this.age);
	}
	
	public void printAll()
	{
		System.out.print("HumanMain:나이="+ this.age);
		System.out.print("HumanMain:이름="+ this.name);
		System.out.print("HumanMain:키="+ this.height);
		System.out.println("HumanMain:몸무게="+ this.weight);
	}
	
	public void setAge(int age)
	{
		this.age = age;
		printAge();
	}
	
	public int getAge()
	{
		return this.age;
	}
	
	public void setScanner()
	{
        Scanner s = new Scanner(System.in);
        
		name = s.next();
		age = s.nextInt();
		height = s.nextDouble();
		weight = s.nextDouble();
	}
	

//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public double getHeight() {
//		return height;
//	}
//
//	public void setHeight(double height) {
//		this.height = height;
//	}
	
	

}
