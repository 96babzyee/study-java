import java.util.Scanner;

public class rspGame {
	public static void main(String[] args) {
		System.out.println("���������� �����Դϴ�. ����, ����, �� �߿��� �Է��ϼ���.");
		Scanner sc = new Scanner(System.in);
		System.out.print("ö�� >> ");
		String boy = sc.next();
		System.out.print("���� >> ");
		String girl = sc.next();
		
		if(boy.equals("����")) {
			if(girl.equals("����"))
				System.out.println("�����ϴ�.");
			else if (girl.equals("����"))
				System.out.println("ö���� �����ϴ�.");
			else
				System.out.println("ö���� �̰���ϴ�.");
		}
		
		if(boy.equals("����")) {
			if(girl.equals("����"))
				System.out.println("ö���� �̰���ϴ�.");
			else if (girl.equals("����"))
				System.out.println("�����ϴ�.");
			else
				System.out.println("ö���� �����ϴ�.");
		}
		
		if(boy.equals("��")) {
			if(girl.equals("����"))
				System.out.println("ö���� �����ϴ�.");
			else if (girl.equals("����"))
				System.out.println("ö���� �̰���ϴ�.");
			else
				System.out.println("�����ϴ�.");
		}
		
		sc.close();
	}
}
