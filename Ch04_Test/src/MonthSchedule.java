import java.util.Scanner;

public class MonthSchedule {
	private int x;
	
	Day day[];
	
	public MonthSchedule(int x) {
		this.x = x;
		day = new Day[x];
		
		for(int i=0;i<day.length;i++)
			day[i] =new Day();
	}
	
	Scanner sc = new Scanner(System.in);
	
	void input() {
		System.out.print("날짜(1~30)? ");
		int date = sc.nextInt();
		System.out.print("할일(빈칸없이입력)? ");
		String work = sc.next();
		date--; //배열의 0인덱스를 맞추기위해
		day[date].set(work);
		
		System.out.println();
	}
	
	void view() {
		System.out.print("날짜(1~30)? ");
		int date = sc.nextInt();
		date--; //배열의 0인덱스를 맞추기위해
		System.out.print((date+1)+"일의 할 일은 ");
		day[date].show();
		
	}
	
	void finish() {
		System.out.println("프로그램을 종료합니다.");
	}
	
	void run() {
		while(true) {
			System.out.print("할일(1:입력, 2:보기, 3:끝내기) >> ");
			int num = sc.nextInt();
			
			if(num ==1)
				input();
			else if (num == 2)
				view();
			else if(num ==3) {
				finish();
				break;
			}
			else {
				System.out.println("1, 2, 3 중 다시 입력");
				System.out.println();
			}
			
		}
	}


}
