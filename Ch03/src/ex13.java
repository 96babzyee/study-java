public class ex13 {
	public static void main(String[] args) {
		for (int i=1;i<100;i++) {
			if((i<10)&&(i%3==0))
	            System.out.println(i +" 박수짝");
			else if(i >= 10){
				if((i %10) == 3||(i %10) == 6||(i %10) == 9) { // 1의자리가 3,6,9
					if(i/10 == 3||i/10 == 6||i/10 == 9) //10의자리와 1의자리 모두 3,6,9
	                    System.out.println(i +" 박수짝짝");
	                else
	                    System.out.println(i +" 박수짝"); // 1의자리가 3,6,9
		            }
				else if(i/10 == 3||i/10 == 6||i/10 == 9) //10의자리가 3,6,9
	                System.out.println(i +" 박수짝");
			}
		}
	}
}
