public class ex10 {
	public static void main(String[] args) {
		int cnt= 1;
		int random1, random2;
		int a[][] = new int[4][4];
		
		for(int i=0; i<a.length; i++) 
			for(int j=0; j<a[i].length; j++) 
				a[i][j] = (int)(Math.random()*10+1);
				
		while(cnt<7) {
			random1 = (int)(Math.random()*3);
			random2 = (int)(Math.random()*3);
			if(a[random1][random2]!=0) {
				a[random1][random2] = 0;
				cnt++;
			}
		} 
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
}
