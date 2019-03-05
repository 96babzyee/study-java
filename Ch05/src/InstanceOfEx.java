class Person3 {}
class Student3 extends Person3 {}
class Researcher extends Person3 {}
class Professor extends Researcher {}

public class InstanceOfEx {
	static void print(Person3 p) {
		if(p instanceof Person3)
			System.out.println("Person3 ");
		if(p instanceof Student3)
			System.out.println("Student3 ");
		if(p instanceof Researcher)
			System.out.println("Researcher ");
		if(p instanceof Professor)
			System.out.println("Professor ");
		System.out.println();
	}
	public static void main(String[] args) {
		System.out.print("new Student() ->\t");
		print(new Student3());
		System.out.print("new Researcher() ->\t");
		print(new Researcher());
		System.out.print("new Professor() ->\t");
		print(new Professor());
	}
}
