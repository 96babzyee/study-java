import java.util.InputMismatchException;
import java.util.Scanner;

public class ex15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("곱하고자 하는 두 수 입력 >> ");
		do {
			try {
				int n = sc.nextInt();
				int m = sc.nextInt();
				System.out.print(n +"*" +m+"="+n*m);
				break;
			}
			catch(InputMismatchException e) {
			 System.out.println("실수는 입력하면 안됩니다.");
			 System.out.print("곱하고자 하는 두 수 입력 >> ");
			 sc.nextLine();
			 continue;
			} 
		} while(true);
		sc.close();
	}
}
