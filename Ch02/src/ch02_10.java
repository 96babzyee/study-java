import java.util.Scanner;

public class ch02_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ���� �߽ɰ� ������ �Է� >> ");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		double radius1 = sc.nextInt();
		
		System.out.print("�ι�° ���� �߽ɰ� ������ �Է� >> ");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		double radius2 = sc.nextInt();
		
		double z = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)); //z�� �� �� ������ �Ÿ�
		double radius = radius1 + radius2;
		
		if(radius>z)
			System.out.println("�� ���� ���� ��ģ��.");
		else
			System.out.println("�� ���� ���� ��ġ�� �ʴ´�.");
		
		sc.close();
	}
}