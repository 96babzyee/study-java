import java.util.Scanner;

public class ch02_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("원의 중심과 반지름 입력 >> ");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double radius = sc.nextDouble(); // 반지름
		
		System.out.print("점 입력 >> ");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		
		// z는 두점 사이의 거리
		double z = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)); // Math.sqrt(100) => 10
		
		if(z<radius)
			System.out.println("점("+x2+","+y2+")는 원 안에 있다.");
		else
			System.out.println("점("+x2+","+y2+")는 원 안에 없다.");

		sc.close();
	}
}
