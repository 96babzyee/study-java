public class ex13 {
	public static void main(String[] args) {
		for (int i=1;i<100;i++) {
			if((i<10)&&(i%3==0))
	            System.out.println(i +" �ڼ�¦");
			else if(i >= 10){
				if((i %10) == 3||(i %10) == 6||(i %10) == 9) { // 1���ڸ��� 3,6,9
					if(i/10 == 3||i/10 == 6||i/10 == 9) //10���ڸ��� 1���ڸ� ��� 3,6,9
	                    System.out.println(i +" �ڼ�¦¦");
	                else
	                    System.out.println(i +" �ڼ�¦"); // 1���ڸ��� 3,6,9
		            }
				else if(i/10 == 3||i/10 == 6||i/10 == 9) //10���ڸ��� 3,6,9
	                System.out.println(i +" �ڼ�¦");
			}
		}
	}
}
