public class Goods1Main {
	public static void main(String[] args) {
		//Goods1 g1[];
		//g1 = new Goods1[5];
		Goods1 g1[] = new Goods1[5];
		
//		중요 ! 객체배열(1개 만들때 g1[],쓸때 g1)의
//		원소에 각 객체 생성 (g1[0], g1[1],g1[2] ...)
		for(int i=0;i<g1.length;i++) {
			g1[i]=new Goods1(); // 객체 만들기
		}
//		g1[0] = new Goods1(); //객체 만들기
//		g1[1] = new Goods1(); //객체 만들기
//		g1[2] = new Goods1(); //객체 만들기
//		g1[3] = new Goods1(); //객체 만들기
//		g1[4] = new Goods1(); //객체 만들기

		g1[0].name = "세탁기"; //객체배열의 한 원소인 1개의 객체에 멤버(name)값 넣기
		g1[0].price = 150000; //객체배열의 한 원소인 1개의 객체에 멤버(price)값 넣기
		
		g1[1].name = "냉장고";
		g1[1].price = 450000;
		
		g1[2].name = "전자렌지";
		g1[2].price = 170000;
		
//		객체에 메소드를 통해 멤버 변수 접근(값 할당)
		g1[3].setName("TV");
		g1[3].setPrice(512000);
		
		//모든 객체 안의 멤버(name, price)를 출력
		for(int i=0;i<g1.length;i++) {
//			객체(예:g1[i])의 멤버변수 name 접근
//			그러나 멤버변수에 직접 접근하는 것은 객체지향에 위배
//			System.out.println("상품명: "+g1[i].name);
//			System.out.println("상품가격: "+g1[i].price);
			System.out.print(i+1+"-");			
			//객체의 메소드를 통해서 멤버변수에 접근
			g1[i].printAll();
			System.out.println();
		}
	}

}
