import java.util.Scanner;

public class CircleMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Circle c[] = new Circle[3];
		for(int i=0;i<c.length;i++) {
			System.out.print("x, y, radius >> ");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			int radius = sc.nextInt();
			c[i] = new Circle(x,y,radius);
		}
		double max = c[0].area();
		int j = 0;
		for(int i=1;i<c.length;i++) {
			if(max<c[i].area()) {
				max=c[i].area();
				j = i;
			}
		} 
		c[j].show();
		
//		5번 문제
//		for (int i=0;i<c.length;i++)
//			c[i].show(); 
		sc.close();
	}
}
