public class MyExp {
	int base;
	int exp;
	
	int getValue() {
		int res =1;
		for(int i=0;i<exp;i++)
			res*=base;
		return res;
	}
	
}
