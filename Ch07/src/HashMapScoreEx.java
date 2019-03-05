import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapScoreEx {
	public static void main(String[] args) {
		HashMap<String, Integer> javaScore = new HashMap<String, Integer>();
		
		javaScore.put("김성동",97);
		javaScore.put("황기태",88);
		javaScore.put("김남윤",98);
		javaScore.put("이재문",70);
		javaScore.put("한원선",99);
		
		System.out.println("HashMap의 요소 개수 :"+javaScore.size());
		
		// 모든 사람의 점수 출력
		// javaScore에 들어 있는 모든 키와 값을 쌍으로 출력
		// key문자열을 가진 집합 Set컬렉션 리턴
		Set<String> keys = javaScore.keySet();
		// key문자열을 순서대로 접근할 수 있는 Iterator 리턴
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String name = it.next();
			int score = javaScore.get(name);
			System.out.println(name +":"+score);
		}
	}
}
