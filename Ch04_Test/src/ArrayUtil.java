public class ArrayUtil {
	public static int [] concat(int[] a, int[] b) {
		//배열a와 b를 연결한 새로운 배열 리턴
		int [] arr=new int[a.length+b.length];
		
		for(int i=0;i<a.length;i++) {
			arr[i]=a[i];
		}
		
		for(int i=a.length;i<arr.length;i++) {
			arr[i]=b[i-a.length];
		}
			return arr;
	}
	
	public static void print(int[] a) {
		//배열 a출력
		System.out.print('[');
		for(int i=0;i<a.length;i++)
			System.out.print(" "+a[i]+" ");
		System.out.print(']');
	}
	
}
