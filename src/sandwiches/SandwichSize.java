package sandwiches;

public enum SandwichSize {
	
	junior,
	standard;


	
	public int getSize(){
		int size;
		switch (this) {
		case junior: size= 8; break;		
		default: size = 10;
		}
		return size;
	}
}


