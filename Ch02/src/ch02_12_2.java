import java.util.Scanner;

public class ch02_12_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����(������ +,*,/) >> ");
		double x = sc.nextDouble();
		String y = sc.next(); //������
		double z = sc.nextDouble();
		double result = 0; //�����
		
		switch(y) {
		case "+": result = x + z;
			System.out.println(x+y+z+"�� ������� "+result);
			break;
		case "-": result = x - z;
			System.out.println(x+y+z+"�� ������� "+result);
			break;
		case "*": result = x * z;
			System.out.println(x+y+z+"�� ������� "+result);
			break;
		case "/":
			if (z !=0) {
				result = x / z;
				System.out.println(x+y+z+"�� ������� "+result);
				}
				else {
					System.out.println("0���� ���� �� �����ϴ�.");
				}
			break;
		default:
			System.out.println("������ �߸� �Է�");
		}
		sc.close();
	}
}
