public class Rectangle {
	private int x;
	private int y;
	private int width;
	private int height;
	
	public Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	int square() {
		return width*height;
	}
	
	void show() {
		System.out.println("("+x+","+y+")에서 크기가 "+width+"x"+height+"인 사각형");
	}
	
	boolean contains(Rectangle r) {
		if (r.x > this.x && r.y > this.y) {
            if ((r.x + r.width < this.x + this.width) &&
            		(r.y + r.height < this.y + this.height)) {
                return true;
            }
        }
        return false;
	}
	
}
