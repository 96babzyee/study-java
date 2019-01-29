public class Car {
	//변수, 생성자, 메소드
	//클래스를 만드는 구성요소 3가지
	//1.(멤버)변수(==필드)
	//2.생성자(메소드==함수) 
	//3.(멤버)메소드 (==일반 메소드, 일반 함수)
	
	//1.멤버변수
	//String type = "SUV"; => 클래스는 값을 가지면X
	String type;
	String name;
	int maxSpeed; //최고속도
	int curSpeed; //현재속도
	
	//2.생성자 메소드
	//외적인 특징=> 1.클래스명과 동일  2.반환값X(표시도 X)
	//내용적인 특징 => 1.멤버변수  초기화 (기본값)
	//만약 생성자를 안만들면 생략되어 있음(아래처럼) => 디폴트 생성자
//	Car() {
//		
//	}
	Car(){ //멤버변수 값을 초기화, 생성자 만들기
		type = "SUV"; //객체가 값을 가짐
		name = "산타페";
		maxSpeed = 200;
		curSpeed = 0;
	}
	
	Car(String name)//메소드는 허용한 "이름중복을"
	{
		this();// Car() 요놈을 불러오는거(호출)
		this.name = name;
//		type = "sport";//객체가 값을 가지게 된다~!
//		this.name = name;
//		maxSpeed = 300;
//		curSpeed = 0;
	}
	
	Car(String type, String name, int maxSpeed, int curSpeed) {
		this.type = type;
		this.name = name;
		this.maxSpeed = maxSpeed;
		this.curSpeed = curSpeed;
	}
	
	//3.메소드 만들기
	void printCar(){
		System.out.println(type);
		System.out.println(name);
		System.out.println(maxSpeed);
		System.out.println(curSpeed);
	}
	
	void printCar(String type) {
		System.out.println(type);
	}
	
}
