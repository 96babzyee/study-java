import java.util.Scanner;

public class ch02_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("2�ڸ� ���� �Է�(10~99) >> ");
		int i = sc.nextInt();
		
		if((i>=10)&&(i<=99)) {
			if((i/10)==(i%10))
				System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
			else
				System.out.println("No! 10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�.");
		} else
			System.out.println("���ڸ� ������ �ƴմϴ�.");
		
		sc.close();
	}
}