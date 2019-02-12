import java.util.Scanner;

public class Book1Array {
	public static void main(String[] args) {
		Book1[] b = new Book1[2];
		
		Scanner sc = new Scanner(System.in);
		for (int i =0;i<b.length;i++) {
			System.out.print("���� >> ");
			String title = sc.nextLine();
			System.out.print("���� >> ");
			String author = sc.nextLine();
			b[i] = new Book1(title, author);
		}
		
		for (int i=0;i<b.length;i++) {
			System.out.print("("+b[i].title+", "+b[i].author+")");
		}
		
		sc.close();
	}
}
