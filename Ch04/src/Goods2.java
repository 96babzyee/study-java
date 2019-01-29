public class Goods2 {
	private String name;
	private int price;
	private int numberOfStock;
	private int sold;
	
	Goods2(String n, int p, int nStack, int s){
		name = n;
		price = p;
		numberOfStock = nStack;
		sold = s;
	}
	
	String getName() {
		return name;
	}
	
	int getPrice() {
		return price;
	}
	
	int getNumberOfStock() {
		return numberOfStock;
	}
	
	int getSold() {
		return sold;
	}
	
}
