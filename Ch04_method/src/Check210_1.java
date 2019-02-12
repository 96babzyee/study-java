public class Check210_1 {
//	double getSum(double[] arr) {
//		double sum =0;
//		for(int i=0;i<arr.length;i++) {
//			sum+=arr[i];
//		}
//		return sum;
//	}
	void getSum(double[] arr, double[] sum, double[] mult) {
		for(int i=0;i<arr.length;i++) {
			sum[0]+=arr[i];
			mult[0]*=arr[i];
		}
	}
}
