import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class EX04 {
	public static void main(String[] args) {
		FileReader fr;
		try {
			
			fr = new FileReader("c:\\windows\\system.ini");
			Scanner sc = new Scanner(fr);
			int lineNumber = 1;
			
			while(sc.hasNext()) {
				String line = sc.nextLine();
				System.out.printf("%4d",lineNumber);
				System.out.println(": "+line);
				lineNumber++;
			}
		} catch(IOException e) {
			System.out.println("입출력 오류");
		}
	}
}
