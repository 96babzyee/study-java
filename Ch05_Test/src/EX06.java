class ColorPoint1 extends Point {
	private String color;

	public ColorPoint1() {
		super(0,0);
		this.color = "BLACK";
	}
	public ColorPoint1(int x, int y) {
		super(x,y);
	}
	
	public void setXY(int x, int y) {
		move(x,y);
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return color + "의 색이 ("+getX()+","+getY()+")의 ";
	}
}

public class EX06 {
	public static void main(String[] args) {
		ColorPoint1 zeroPoint = new ColorPoint1();
		System.out.println(zeroPoint.toString() +"입니다.");
		
		ColorPoint1 cp = new ColorPoint1(10,10);
		cp.setXY(5,5);
		cp.setColor("RED");
		System.out.println(cp.toString()+"입니다.");
	}
}
