public class GradeSwitch {

	public static void main(String[] args) {
		char grade = 'C';
		switch(grade) {
			case 'A':
			case 'B':
				System.out.println("�� ���Ͽ����ϴ�.");
				break;
			case 'C':
			case 'D':
				System.out.println("�� �� ����ϼ���.");
				break;
			case 'F':
				System.out.println("���� �б⿡ �ٽ� �����ϼ���.");
			default:
				System.out.println("�߸��� �����Դϴ�.");
		}
	}
}