import java.util.Scanner;

public class ex04 {
	public static void main(String[] args) {
		System.out.print("소문자 알파벳을 입력하시오>> ");
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next(); //문자열 읽기
		char c = s.charAt(0); //문자열 첫번째 알파벳
		
		for(char i=c;i>='a';i--) {
			for(char j ='a';j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		sc.close();
	}
}
