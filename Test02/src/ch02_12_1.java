import java.util.Scanner;

public class ch02_12_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����(������ : +,-,*,/) >> ");
		double x = sc.nextDouble();
		String y = sc.next(); //������
		double z = sc.nextDouble();
		double result = 0; //�����
		
		if (y.equals("+")) {
			result = x + z;
			System.out.println(x+y+z+"�� ������� "+result);
		}
		else if (y.equals("-")) {
			result = x - z;
			System.out.println(x+y+z+"�� ������� "+result);
		}
		else if (y.equals("*")) {
			result = x * z;
			System.out.println(x+y+z+"�� ������� "+result);
		}
		else if (y.equals("/")) {
			if (z !=0) {
			result = x / z;
			System.out.println(x+y+z+"�� ������� "+result);
			}
			else {
				System.out.println("0���� ���� �� �����ϴ�.");
			}	
		}
		else
			System.out.println("�����ڸ� �߸� �Է�");
		
		sc.close();
	}
}
