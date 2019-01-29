//클래스는 맞다, 좀 스페셜~~!
public class PersonTest {
	//프로그램 시작점~!
	public static void main(String[] args) {
		//.... 다른 클래스들을 사용하는 곳~!

		//비교 예외적인거
		String s1;
		Integer i1;
		
		int a; //변수 만들기 -> 자료형 변수
		a=0; //변수 사용하기
		//2.클래스 사용하기 <-> 만들기 아님
		Person p1;//클래스 사용? 어디 사용? 객체 만들기
		//자료형 변수
		//클래스 객체
		//p1 을 변수라고 하는데, 객체, 객체 변수
		//p1은 아직 객체가 덜됐음~! 미생~!
		p1 = new Person();// 객체 만들기  <-> 객체 사용 아님!
		//p1이 객체가 다 됐음~! 완생
		// new Person() => 객체~!! 중요 
		//Person() => 생성자~! 사용하는거임~! <-> 만드는거 아님~!
		
//		new Person();//이름 없는 객체, 익명 객체, 무명 객체
//		//Person p1 = new Person();		
//		//그래서  p1 같은 이름을 준다~!
		
		//정리
		//1.클래스 만들기
		//2.클래스 사용하기(3과 동일)
		//3.객체 만들기 (2와 동일)
		//4.객체 사용 (가장 중요~!)
		p1.printAge(); //나이는 0
		p1.age = 33;  //객체사용->객체의 (멤버)변수 사용
		p1.printAge(); //나이는 33
		p1.printNumber(28);//객체사용->객체의 (멤버)메소드 사용 //숫자는 28
		
		p1.setAge(25);
		p1.printAge(); //나이는 25
		
		p1.age = 50;
		p1.printAge(); //나이는 50
		
		Person p2;
		p2 = new Person();
		p2.setAge(39);
		p2.printAge(); //나이는 39
		p1.printAge(); //나이는 50
		
		Person p3 = new Person();
		
	}

}
