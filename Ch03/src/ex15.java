import java.util.InputMismatchException;
import java.util.Scanner;

public class ex15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ϰ��� �ϴ� �� �� �Է� >> ");
		do {
			try {
				int n = sc.nextInt();
				int m = sc.nextInt();
				System.out.print(n +"*" +m+"="+n*m);
				break;
			}
			catch(InputMismatchException e) {
			 System.out.println("�Ǽ��� �Է��ϸ� �ȵ˴ϴ�.");
			 System.out.print("���ϰ��� �ϴ� �� �� �Է� >> ");
			 sc.nextLine();
			 continue;
			} 
		} while(true);
		sc.close();
	}
}
