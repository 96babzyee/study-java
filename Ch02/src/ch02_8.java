import java.util.Scanner;

public class ch02_8 {
	public static boolean inRect(int x, int y,int r_x1, int r_y1, int r_x2, int r_y2) {
		if((x>=r_x1 && x <=r_x2)&&(y>=r_y1 && y<=r_y2))
			return true;
		else return false;
	}
	
	public static void main(String[] args) {
		System.out.print("(x1,y1),(x2,y2)�� ��ǥ�� �Է��Ͻÿ�>> ");
		
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt(); //ù���� ��
		int y1 = sc.nextInt();
		int x2 = sc.nextInt(); //�ι�° ��
		int y2 = sc.nextInt();
		
		if(inRect(x1,y1,100,100,200,200) &&
		   inRect(x2,y2,100,100,200,200) &&
		   inRect(x1,y2,100,100,200,200) &&
		   inRect(x2,y1,100,100,200,200))
		{
			System.out.println("�űԻ簢�� �ȿ� ����");
			System.out.println("�浹");
		}
		else if(inRect(x1,y1,100,100,200,200) ||
				inRect(x2,y2,100,100,200,200) ||
				inRect(x1,y2,100,100,200,200) ||
				inRect(x2,y1,100,100,200,200))
		{
			System.out.println("�� 1���� ��ħ");
			System.out.println("�浹");
		}
		else if(inRect(100,100,x1,y1,x2,y2) &&
				inRect(200,200,x1,y1,x2,y2) &&
				inRect(100,200,x1,y1,x2,y2) &&
				inRect(200,100,x1,y1,x2,y2)) 
		{
			System.out.println("�űԻ簢���� ����(100,200)�� ����");
			System.out.println("�浹");
		}
		
		sc.close();
	}
}

