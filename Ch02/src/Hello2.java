public class Hello2 {
	//1.메소드 만들기(in:O, out:O)
	public int sum(int a, int b) {
		return a+b;
	}
	
	//2.메소드 만들기(in:O, out:X)
	public void sum2(int a, int b) {
		System.out.println(a+b);
	}
	
	//3.메소드 만들기(in:X, out:X)
	public void sum3() {
		System.out.println("안녕~!!!");
		System.out.println("안녕~!!!");
		System.out.println("안녕~!!!");
		System.out.println("안녕~!!!");
	}
	
	//4.메소드 만들기(in:X, out:O)
	public int sum4() {		
		return 700;
	}
	
}
