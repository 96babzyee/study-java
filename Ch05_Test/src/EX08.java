
class PositivePoint extends Point {
//	public PositivePoint() {
//		super(x,y);
//	}
	
	public PositivePoint(int x, int y) {
		super(x,y);
	}
	
	public void move(int x, int y) {
		super.move(x,y);
		
	}
}

public class EX08 {
	public static void main(String[] args) {
		PositivePoint p = new PositivePoint(10,10);
		p.move(10,10);
		System.out.println(p.toString()+"입니다.");
		
		p.move(-5,5);
		System.out.println(p.toString()+"입니다.");
		
		PositivePoint p2 = new PositivePoint(-10,-10);
		System.out.println(p.toString()+"입니다.");
	}
}
