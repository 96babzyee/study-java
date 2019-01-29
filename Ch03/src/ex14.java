import java.util.Scanner;

public class ex14 {
	public static void main(String[] args) {
		String course [] = {"Java","C++","HTML5","컴퓨터구조","안드로이드"};
		int score [] = {95, 88, 76, 62, 55};
		
		String name;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("과목이름 >> ");
			name = sc.next();
			if(name.equals("그만"))
				break;
			
			int i =0;
			
			for(i=0;i<course.length;i++) {
				if(course[i].equals(name)) {
					System.out.println(name+"의 점수는 "+score[i]);
					break;
				}
			}
			if(i==course.length)
				System.out.println("과목 잘못 입력");
		}
		sc.close();
	}
}

