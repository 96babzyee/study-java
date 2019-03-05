import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EX01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileWriter fw = null;
		File f;
		try {
			f = new File("c:\\temp\\phone.txt");
			fw = new FileWriter(f);
			while(true) {
				System.out.print("이름 전화번호 >> ");
				String line = sc.nextLine();
				if(!line.equals("그만"))
					fw.write(line+" \r\n");
				else
					break;
			}
			System.out.println(f.getPath()+"에 저장하였습니다.");
			fw.close();
		} catch (IOException e) {
			System.out.println("오류");
		}
		sc.close();
	}

}
