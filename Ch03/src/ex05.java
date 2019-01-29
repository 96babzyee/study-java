import java.util.Scanner;

public class ex05 {
	public static void main(String[] args) {
		System.out.print("양의 정수 10개를 입력하시오>> ");
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[10];
			
		for (int i =0; i<a.length;i++) {
			a[i] = sc.nextInt();
			if(a[i]%3==0)
				System.out.print(a[i]+" ");
		}
		sc.close();
	}
}	
