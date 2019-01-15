import java.util.Scanner;

public class ch02_6 {
	public static void main(String[] args) {
		System.out.print("1~99 사이의 정수를 입력하세요>> ");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if((num<10)&&(num%3==0))
	            System.out.println("박수짝");
		else if(num >= 10){
			if((num %10) == 3||(num %10) == 6||(num %10) == 9){
				if(num/10 == 3||num/10 == 6||num/10 == 9)
	                    System.out.println("박수짝짝");
	                else
	                    System.out.println("박수짝");
	            }
			else if(num/10 == 3||num/10 == 6||num/10 == 9)
	                System.out.println("박수짝");
		
		}
		sc.close();
	}
}