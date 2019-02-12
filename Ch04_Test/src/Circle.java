public class Circle {
	private double x,y;
	private int radius;
	
	public Circle(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public void show() {
		System.out.println("가장 큰 면적인 큰원은 ("+x+","+y+")"+radius);
	} // 5번 문제
	
	 public double area() {
		return radius*radius*3.14;
	}
	
}
