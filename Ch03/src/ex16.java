import java.util.Scanner;

public class ex16 {
	public static void main(String[] args) {
		String com[] = {"����","����","��"};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		
		//1. ����� �Է�
		while(true) {
			System.out.print("���� ���� ��!>> ");
			String user = sc.nextLine(); //����ڰ� �� ��
			
			if(user.equals("�׸�")) {
				System.out.println("������ �����մϴ�.");
				break;
			}
			
			//2.��ǻ�Ͱ� ���� rps
			int index = (int)(Math.random()*3); //0,1,2�� ��ǻ�Ͱ� �������� ���� ��
			String strCom = com[index];
			
			System.out.print("���� "+user);
			System.out.print(", ��ǻ�ʹ� "+strCom);
			
			if(user.equals("����")) {
				if(strCom.equals("����"))
					System.out.println(" �����");
				else if(strCom.equals("����"))
					System.out.println(" ����");
				else if(strCom.equals("��"))
					System.out.println(" �̰���");				
			}
			else if(user.equals("����")) {
				if(strCom.equals("����"))
					System.out.println(" �̰���");
				else if(strCom.equals("����"))
					System.out.println(" �����");
				else if(strCom.equals("��"))
					System.out.println(" ����");				
			}
			else if(user.equals("��")) {
				if(strCom.equals("����"))
					System.out.println(" ����");
				else if(strCom.equals("����"))
					System.out.println(" �̰���");
				else if(strCom.equals("��"))
					System.out.println(" �����");				
			}
			else {
				System.out.println("�߸� �½��ϴ�");
			}
		}
		
		
		

		
		
		

		
	}
}
