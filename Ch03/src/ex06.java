import java.util.Scanner;

public class ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		
		System.out.print("�ݾ��� �Է��Ͻÿ� >> ");
		int money = sc.nextInt();
		int count = 0;
		
		for (int i=0; i<unit.length; i++) {
			count = money/unit[i];
			money = money%unit[i];
			if(count!=0)
				System.out.println(unit[i]+"�� ¥�� : "+count+"��");
		}
		sc.close();
	}
}
