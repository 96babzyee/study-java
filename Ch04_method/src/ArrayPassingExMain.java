public class ArrayPassingExMain {
	public static void main(String[] args) {
		char c[] = {'T','h','i','s',' ','i','s',' ',
					'a',' ','p','e','n','c','i','l','.'};
		
		ArrayPassingEx a1 = new  ArrayPassingEx();
		
		a1.printCharArray(c);
		a1.replaceSpace(c);
		a1.printCharArray(c);
	}
}


