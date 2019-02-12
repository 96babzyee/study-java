import java.util.Scanner;

public class ex11_Main {
	public static void main(String[] args) {
		Add add = new Add();
		Sub sub = new Sub();
		Mul mul = new Mul();
		Div div = new Div();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하세요 >> ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		String c = sc.next(); //연산자
		
		
		switch(c) {
		case "+" : 
			add.setValue(a, b);
			System.out.println(add.calculate()); 
			break;
		case "-" : 
			sub.setValue(a, b);
			System.out.println(sub.calculate()); 
			break;
		case "*" : 
			mul.setValue(a, b);
			System.out.println(mul.calculate()); 
			break;
		case "/" : 
			div.setValue(a, b);
			System.out.println(div.calculate()); 
			break;
		}
		sc.close();
	}

}
