import java.util.Scanner;

public class ch02_5 {
	public static void main(String[] args) {
		System.out.print("���� 3���� �Է��Ͻÿ�>> ");
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(((a+b)>c)&&((b+c)>a)&&((a+c)>b))
			System.out.println("�ﰢ���� �˴ϴ�.");
		else
			System.out.println("�ﰢ���� �� �� �����ϴ�.");
		
		sc.close();
	}

}