import java.util.Scanner;

public class ex08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num =0;
		do {
			System.out.print("정수 몇개? ");
			num = sc.nextInt();
		} while(num<=0||num>100);
		 
		int a[] = new int[num];
		
		for(int i=0; i<a.length; i++) {
			a[i] = (int)(Math.random()*100+1);
			for(int j=0;j<i;j++) {
				if(a[i]==a[j]) {
					i--;
					break;
				}	
			}
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
			if(i%10==0&&i!=0)
				System.out.println();
		}
		
		
		sc.close();
	}
}
