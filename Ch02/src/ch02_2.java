import java.util.Scanner;

public class ch02_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("2자리 정수 입력(10~99) >> ");
		int i = sc.nextInt();
		
		if((i>=10)&&(i<=99)) {
			if((i/10)==(i%10))
				System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
			else
				System.out.println("No! 10의 자리와 1의 자리가 다릅니다.");
		} else
			System.out.println("두자리 정수가 아닙니다.");
		
		sc.close();
	}
}