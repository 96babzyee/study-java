import java.util.Scanner;

public class ch02_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� �߽ɰ� ������ �Է� >> ");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double radius = sc.nextDouble(); // ������
		
		System.out.print("�� �Է� >> ");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		
		// z�� ���� ������ �Ÿ�
		double z = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)); // Math.sqrt(100) => 10
		
		if(z<radius)
			System.out.println("��("+x2+","+y2+")�� �� �ȿ� �ִ�.");
		else
			System.out.println("��("+x2+","+y2+")�� �� �ȿ� ����.");

		sc.close();
	}
}