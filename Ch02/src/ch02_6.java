import java.util.Scanner;

public class ch02_6 {
	public static void main(String[] args) {
		System.out.print("1~99 ������ ������ �Է��ϼ���>> ");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if((num<10)&&(num%3==0))
	            System.out.println("�ڼ�¦");
		else if(num >= 10){
			if((num %10) == 3||(num %10) == 6||(num %10) == 9){
				if(num/10 == 3||num/10 == 6||num/10 == 9)
	                    System.out.println("�ڼ�¦¦");
	                else
	                    System.out.println("�ڼ�¦");
	            }
			else if(num/10 == 3||num/10 == 6||num/10 == 9)
	                System.out.println("�ڼ�¦");
		
		}
		sc.close();
	}
}