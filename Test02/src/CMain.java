public class CMain {
	public static void main(String[] args) {
		int i=20;
		int s;
		char a;
		
		Hello2 h = new Hello2();
		//1�� �޼ҵ� ���
		s = h.sum(i,10);//���� ����
		
		System.out.println("1�� s:"+s);
		//2�� �޼ҵ� ���
		h.sum2(100, 200);//���� ������!~
		
		//3�� �޼ҵ� ���
		h.sum3();//���� ������(out ����)
		h.sum3();//���� ������(out ����)
		
		//4�� �޼ҵ� ���
//		s = h.sum4();
//		System.out.println("2�� s:"+s);
		
		System.out.println("4�� s" + h.sum4());
		
		a = '?';
		System.out.println(a);
		System.out.println("Hello");
		System.out.println(s);		
	}
}