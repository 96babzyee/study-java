import java.util.Scanner;

public class ex03 {
	public static void main(String[] args) {
		System.out.print("������ �Է��Ͻÿ�>> ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		for(int i=x;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		sc.close();
	}
}
