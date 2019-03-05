public class MovieMain {
	public static void main(String[] args) {
		User u1 = new User("abc","1234","홍길동","010-1234-5678",50000);
		User u2 = new User("def","5678","박보검","010-4444-5555",20000);
		
		Ticket t1 = new Ticket(4258,"스타워즈2",12000,"6층 1관 G10","2018-02-22 17:30");
		Ticket t2 = new Ticket(4285,"스타워즈2 - 조조할인",8000,"6층 2관 J11","2018-02-25 9:30");
		Ticket t3 = new Ticket(1348,"더킹",11000,"7층 6관 H7","2018-02-23 14:20");
		
		u1.checkMoney();
		u1.TicketBuy(t2);
		u1.checkTicket();
		u1.checkMoney();
		System.out.println("========================================");
		u2.checkMoney();
		u2.TicketBuy(t3);
		u2.checkTicket();
		u2.checkMoney();

	}
}
