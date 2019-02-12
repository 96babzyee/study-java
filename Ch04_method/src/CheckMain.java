public class CheckMain {
	public static void main(String[] args) {
		Check210_1 c1 = new Check210_1();
		double arr[] = {10.5, 10.2, 20.1};
		
//		double sum=0;
//		sum=c1.getSum(arr);
//		System.out.println("합계는: "+sum);
		double []sum= {0};
		double []mult= {1};
		c1.getSum(arr,sum,mult);
		
		System.out.println("합계 >> "+sum[0]);
		System.out.println("곱 >> "+mult[0]);
	}
}
