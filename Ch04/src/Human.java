import java.util.Scanner;

public class Human 
{
	//��� ������ public�� �ȵ�! private or protected���� ����
	private String name;
	private int age;
	private double height, weight;
	
//	Human()
//	{
//		
//	}
	//�����ڴ� ������ public
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



	//�޼ҵ�� public �̳�? private ��?
	private void printAge() 
	{
		System.out.println("printAge:���̴�="+ this.age);
	}
	
	public void printAll()
	{
		System.out.print("HumanMain:����="+ this.age);
		System.out.print("HumanMain:�̸�="+ this.name);
		System.out.print("HumanMain:Ű="+ this.height);
		System.out.println("HumanMain:������="+ this.weight);
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
