public class DowhileTest {
	public static void main(String[] args) {
		int sum=0;
		int i =0;
		
		do {
			sum+=i;
			i+=2;
		}while (i<99);
		System.out.println(sum);
	}

}
