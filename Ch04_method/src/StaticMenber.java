import java.util.Scanner;

public class StaticMenber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("환율(1달러) >> ");
		double rate = sc.nextDouble();
		
		CurrencyConverter.setRate(rate);
		System.out.println("백만원은 $"+CurrencyConverter.toDollar(1000000)+"입니다.");
		System.out.println("$`100은 "+CurrencyConverter.toKWR(100)+"입니다.");
	}

}
      