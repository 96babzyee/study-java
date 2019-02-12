public class SongMain {
	public static void main(String[] args) {
//		Song s1 = new Song("Dancing Queen", "ABBA", 1978, "스웨덴");
//		s1.show();
		
		//방법1.
		String title[] = new String[3];
		title[0] = "안녕 노래1";
		title[1] = "안녕 노래2";
		title[2] = "안녕 노래3";
		new Song(title, "ABBA", 1978, "스웨덴").show();
		
		//방법2.
//		String title[] = {"디엔에이","페이크","안녕!"};
		
		//방법3.
//		new Song(new String[]{"디엔에이","페이크","안녕!"}, "ABBA", 1978, "스웨덴").show();
		
	}
	
}

