package pizza5;

public enum PizzaSize {
	
	small,
	standard,
	large,
	extralarge;

	
	public int getSize(){
		int size;
		switch (this) {
		case small: size= 8; break;
		case standard: size= 10; break;
		case large: size= 12; break;
		case extralarge: size= 15; break;
		default: size = 10;
		}
		return size;
	}
}


