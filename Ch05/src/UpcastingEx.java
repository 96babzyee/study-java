class Person1 {
	String name;
	String id;
	
	public Person1(String name) {
		this.name = name;
	}
}

class Student1 extends Person1 {
	String grade;
	String department;
	
	public Student1(String name) {
		super(name);
	}
}

public class UpcastingEx {
	public static void main(String[] args) {
		Person1 p1;
		Student1 s1 = new Student1("이재문");
		p1 = s1; //Person1 p1=new Student1("이재문");
		
		System.out.println(p1.name);
	}
}
