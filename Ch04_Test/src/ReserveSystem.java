import java.util.Scanner;

public class ReserveSystem {
	ReserveShow rs = new ReserveShow();
	Scanner sc = new Scanner(System.in);
	int i ;
	
	void run() {
		System.out.println("명품콘서트 예약 시스템입니다.");
		System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4 >> ");
		i = sc.nextInt();
		
		while(true) {
			switch(i) {
			case 1:
				rs.reserve();
				break;
			case 2:
				rs.seach();
				break;
			case 3:
				rs.cencel();
				break;
			case 4:
				rs.finish();
				break;
			default:
				System.out.println("번호를 잘못 입력하였습니다. 다시 입력해주세요.");
				continue;
			}
		}
		
	}
	
}
