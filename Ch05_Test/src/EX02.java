class IPTV extends TV {
	private int color;
	private String ip;
	
	public IPTV(String ip, int size, int color) {
		super(size);
		this.ip = ip;
		this.color = color;
	}
	
	void printProperty() {
		System.out.print("나의 IPTV는 "+ip+" 주소의 "+getSize()+"인치 "+color+"컬러");
	}	
}


public class EX02 {
	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		iptv.printProperty();
	}
}
