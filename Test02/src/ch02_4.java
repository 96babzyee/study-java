import java.util.Scanner;

public class ch02_4 {
	public static void main(String[] args) {
		System.out.print("���� 3�� �Է� >>");
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if((a<=b)&&(b<=c)||((c<=b)&&(b<=a)))
			System.out.println("�߰����� "+b);
		else if((b<=a)&&(a<=c)||(c<=a)&&(a<=b))
			System.out.println("�߰����� "+a);
		else if((a<=c)&&(c<=b)||(b<=c)&&(c<=a))
			System.out.println("�߰����� "+c);
		
		sc.close();
	}
	
}
