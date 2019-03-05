import java.util.Scanner;

public class ch02_8 {
	public static boolean inRect(int x, int y,int r_x1, int r_y1, int r_x2, int r_y2) {
		if((x>=r_x1 && x <=r_x2)&&(y>=r_y1 && y<=r_y2))
			return true;
		else return false;
	}
	
	public static void main(String[] args) {
		System.out.print("(x1,y1),(x2,y2)의 좌표를 입력하시오>> ");
		
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt(); //첫번재 점
		int y1 = sc.nextInt();
		int x2 = sc.nextInt(); //두번째 점
		int y2 = sc.nextInt();
		
		if(inRect(x1,y1,100,100,200,200) &&
		   inRect(x2,y2,100,100,200,200) &&
		   inRect(x1,y2,100,100,200,200) &&
		   inRect(x2,y1,100,100,200,200))
		{
			System.out.println("신규사각형 안에 있음");
			System.out.println("충돌");
		}
		else if(inRect(x1,y1,100,100,200,200) ||
				inRect(x2,y2,100,100,200,200) ||
				inRect(x1,y2,100,100,200,200) ||
				inRect(x2,y1,100,100,200,200))
		{
			System.out.println("점 1개라도 걸침");
			System.out.println("충돌");
		}
		else if(inRect(100,100,x1,y1,x2,y2) &&
				inRect(200,200,x1,y1,x2,y2) &&
				inRect(100,200,x1,y1,x2,y2) &&
				inRect(200,100,x1,y1,x2,y2)) 
		{
			System.out.println("신규사각형이 기준(100,200)을 포함");
			System.out.println("충돌");
		}
		
		sc.close();
	}
}

