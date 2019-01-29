public class CMain {
	public static void main(String[] args) {
		int i=20;
		int s;
		
		Hello2 h = new Hello2();
		//1번 메소드 사용
		s = h.sum(i,10);//값을 가짐
		System.out.println("1번 s:"+s);
		
		//2번 메소드 사용
		h.sum2(100, 200);//값을 못가짐!~
		
		//3번 메소드 사용
		h.sum3();//값을 못가짐(out 없음)
		
		//4번 메소드 사용
		s = h.sum4();
		System.out.println("4번 s:"+s);		
		System.out.println("4번 s :" + h.sum4());
//		
//		a = '?';
//		System.out.println(a);
//		System.out.println("Hello");
//		System.out.println(s);		
	}
}
