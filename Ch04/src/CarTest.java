
public class CarTest {
	public static void main(String[] args) {
		//1.클래스 만들기
		//2.클래스 사용하기(3과 동일)
		//3.객체 만들기 (2와 동일)
		//4.객체 사용 (가장 중요~!)

		
		Car c1;
		//c1을 변수라고 함. 미생, 객체변수, 레퍼런스
		//자료형 변수, 클래스 객체
		c1 = new Car();
		// 완생
		//Car() <- 생성자, 생성자 사용
		//new Car() = > 객체
		
		Car c2 = new Car("벤츠");
		
		System.out.println("1------------");
		c1.printCar();
		System.out.println("2------------");
		c2.printCar();
		System.out.println("3------------");
		c1.printCar("대포차");
		
		System.out.println("4------------");
		Car c3 = new Car("Van", "이스타나", 170, 10);
		c3.printCar();
	}
}
