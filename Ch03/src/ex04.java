import java.util.Scanner;

public class ex04 {
	public static void main(String[] args) {
		System.out.print("�ҹ��� ���ĺ��� �Է��Ͻÿ�>> ");
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next(); //���ڿ� �б�
		char c = s.charAt(0); //���ڿ� ù��° ���ĺ�
		
		for(char i=c;i>='a';i--) {
			for(char j ='a';j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		sc.close();
	}
}
