public class Ticket {
	private int ticketNum;
	private String movieName;
	private int price;
	private String seatNum;
	private String movieTime;
	
	public Ticket() {}
	
	public Ticket(int ticketNum, String movieName, int price, String seatNum, String movieTime) {
		super();
		this.ticketNum = ticketNum;
		this.movieName = movieName;
		this.price = price;
		this.seatNum = seatNum;
		this.movieTime = movieTime;
	}

	public int getPrice() {
		return price;
	}
	
	public void ticketInfo() {
		System.out.println("티켓 번호 : "+ticketNum);
		System.out.println("영화 제목 : "+movieName);
		System.out.println("티켓 가격 : "+price);
		System.out.println("좌석 번호 : "+seatNum);
		System.out.println("상영 시간 : "+movieTime);
	}
	
}
