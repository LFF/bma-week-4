
public class Point {

	/**
	 * @param args
	 * *
	 * parameterized constructor
	 * 
	 * paramaterized constructor is overriden  to default.
	 * 
	 * explict no-argument constructor
	 * 
	 * delegating constructors
	 * 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		
		Point point = new Point(10, 33);
		
		Point point2 = new Point();
		
		
		
	}
	
	int x;
	int y;
	
	
	Point(int x, int y) {
		
		
		this.x = x;
		this.y = y;
				
		
		
	}
	
	
	Point() {
		
		
		this(0, 0);
		
				
	}
	
	

}
