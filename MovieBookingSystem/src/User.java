public class User {
	private String userID;
	private String pwd;
	private String name;
	private String phone;
	private int money;
	private Ticket ticket; //객체형변수
	
	public User() {}
	
	public User(String userID, String pwd, String name, String phone, int money) {
		this.userID = userID;
		this.pwd = pwd;
		this.name = name;
		this.phone = phone;
		this.money = money;
	}
	
	public void TicketBuy(Ticket ticket) {
		this.ticket = ticket;
		this.money = this.money - ticket.getPrice();
		
		System.out.println("<티켓 구매>");
		ticket.ticketInfo();
		System.out.println();
	}
	
	public void checkMoney() {
		System.out.println("<가진 금액 확인>");
		System.out.println("금액 : "+this.money);
		System.out.println();
	}

	public void checkTicket() {
		System.out.println("<구매한 티켓 확인>");
		ticket.ticketInfo();
		System.out.println();
	}
	
}
