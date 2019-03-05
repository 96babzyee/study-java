
class Km2Mile extends Converter {
	private double src;
	
	public Km2Mile(double ratio) {
		this.ratio=ratio;
	}
	protected double convert(double src) {
		return src/ratio;
	}
	protected String getSrcString() {
		return "mile";
	}
	protected String getDestString() {
		return "Km";
	}
	
}

public class EX04 {
	public static void main(String[] args) {
		Km2Mile toMile = new Km2Mile(1.6); //1마일은 1.6km
		toMile.run();
	}

}
