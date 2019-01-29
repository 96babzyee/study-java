import java.util.Scanner;

public class ch02_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 원의 중심과 반지름 입력 >> ");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		double radius1 = sc.nextInt();
		
		System.out.print("두번째 원의 중심과 반지름 입력 >> ");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		double radius2 = sc.nextInt();
		
		double z = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)); //z는 두 점 사이의 거리
		double radius = radius1 + radius2;
		
		if(radius>z)
			System.out.println("두 원은 서로 겹친다.");
		else
			System.out.println("두 원은 서로 겹치지 않는다.");
		
		sc.close();
	}
}
