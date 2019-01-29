public class Goods1 { //클래스 => 객체는 클래스를 만들기 위한 것
	// 3요소 
	// 1. 멤버변수
	// 2. 생성자
	// 3. 멤버메소드
	String name;
	int    price;
	
	Goods1() {
		name = "상품명미정";
		price = 0;
	}
	
	void setName(String name) {
		this.name = name;
	}
		
	void setPrice(int price) {
		this.price = price;
	}
	

	void printAll() {
		System.out.println("상품명: "+name); //this 생략가능
//		System.out.println("상품명: "+this.name);
		System.out.println("상품가격: "+price); //this 생략가능
//		System.out.println("상품가격: "+this.price);
	}
	
}
