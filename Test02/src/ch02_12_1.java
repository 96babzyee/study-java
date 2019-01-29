import java.util.Scanner;

public class ch02_12_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("연산(연산자 : +,-,*,/) >> ");
		double x = sc.nextDouble();
		String y = sc.next(); //연산자
		double z = sc.nextDouble();
		double result = 0; //계산결과
		
		if (y.equals("+")) {
			result = x + z;
			System.out.println(x+y+z+"의 계산결과는 "+result);
		}
		else if (y.equals("-")) {
			result = x - z;
			System.out.println(x+y+z+"의 계산결과는 "+result);
		}
		else if (y.equals("*")) {
			result = x * z;
			System.out.println(x+y+z+"의 계산결과는 "+result);
		}
		else if (y.equals("/")) {
			if (z !=0) {
			result = x / z;
			System.out.println(x+y+z+"의 계산결과는 "+result);
			}
			else {
				System.out.println("0으로 나눌 수 없습니다.");
			}	
		}
		else
			System.out.println("연산자를 잘못 입력");
		
		sc.close();
	}
}
