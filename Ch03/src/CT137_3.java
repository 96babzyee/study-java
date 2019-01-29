public class CT137_3 {
	public static void main(String[] args) {
		int[] tenArray = new int[10];
		
		for(int i = 0; i<tenArray.length;i++)
			tenArray[i] = i+1;
		
		int sum=0;
		for(int i=0;i<tenArray.length;i++)
			sum+=tenArray[i];
		
		System.out.println("모든 원소의 합은 : " + sum);
		
	}
}
