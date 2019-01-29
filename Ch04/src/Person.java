//1.클래스 만들기 <-> 사용아님!
public class Person {
	//클래스를 만드는 구성요소 3가지
	//1.(멤버)변수(==필드) -> 멤버 변수가 아닌게 도대체 뭔가??
	//2.생성자(메소드==함수) 
	//3.(멤버)메소드 (==일반 메소드, 일반 함수)
	
	//1.변수 만들기 <-> 사용 아님!
	int age;
	String name;
	
	//2.생성자 (생성자 만들기<-> 사용 아님), 어떻게 사용??
	Person(){ //반환값 없음~!
		//.....
	}
	
	//3.메소드 만들기 <-> 사용 아님!
	void printNumber(int num) {
		int a = num;
		System.out.println("숫자는"+a+"입니다");
		//.....
	}
	
	//3.메소드 만들기 -> 멤버 변수와 연관짓기
	void setAge(int age1) {
		//매개변수 age1을 
		//멤버변수 age에 넣기
		//age는 setAge메소드와 같은식구(같은 클래스 소속)==(멤버변수)
		age = age1;
	}
	
	void printAge() {
		//같은 식구 age(=멤버변수)를 출력 -> 연관성
		System.out.println("나이는" + age);
	}
	
}