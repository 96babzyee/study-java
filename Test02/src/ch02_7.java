import java.util.Scanner;

public class ch02_7 {
	public static void main(String[] args) {
		System.out.print("�� (x,y)�� ��ǥ�� �Է��Ͻÿ�>> ");
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if((x>100)&&(x<200)) {
			if((y>100)&&(y<200))
			System.out.println("("+x+","+y+")�� �簢�� �ȿ� �ֽ��ϴ�.");
			else
			System.out.println("("+x+","+y+")�� �簢�� �ȿ� �����ϴ�.");
		}
		else
			System.out.println("("+x+","+y+")�� �簢�� �ȿ� �����ϴ�.");
		
		sc.close();
	}

}