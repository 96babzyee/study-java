public class Hello2 {
	//1.�޼ҵ� �����(in:O, out:O)
	public int sum(int a, int b) {
		return a+b;
	}
	
	//2.�޼ҵ� �����(in:O, out:X)
	public void sum2(int a, int b) {
		System.out.println(a+b);
	}
	
	//3.�޼ҵ� �����(in:X, out:X)
	public void sum3() {
		System.out.println("�ȳ�~!!!");
		System.out.println("�ȳ�~!!!");
		System.out.println("�ȳ�~!!!");
		System.out.println("�ȳ�~!!!");
	}
	
	//4.�޼ҵ� �����(in:X, out:O)
	public int sum4() {		
		return 700;
	}
	
}
