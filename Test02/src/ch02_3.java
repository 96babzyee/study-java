import java.util.Scanner;

public class ch02_3 {
	public static void main(String[] args) {
		System.out.print("�ݾ��� �Է��Ͻÿ�>> ");
		
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		
		System.out.println("�������� "+money/50000+"��");
		System.out.println("������ "+money%50000/10000+"��");
		System.out.println("õ���� "+money%50000%10000/1000+"��");
		System.out.println("��� "+money%50000%10000%1000/100+"��");
		System.out.println("���ʿ� "+money%50000%10000%1000%100/50+"��");
		System.out.println("�ʿ� "+money%50000%10000%1000%100%50/10+"��");
		System.out.println("�Ͽ� "+money%50000%10000%1000%100%50%10/1+"��");
	
		sc.close();
	}

}