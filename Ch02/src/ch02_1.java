import java.util.Scanner;

public class ch02_1 {
	public static void main(String[] args) {
		System.out.print("��ȭ�� �Է��ϼ���(���� ��) >> ");
		
		Scanner sc = new Scanner(System.in);
		int won = sc.nextInt();
		double dollar = (won/1100);

		System.out.println(won+"���� "+"$"+dollar+"�Դϴ�.");
		
		sc.close();
	}
}