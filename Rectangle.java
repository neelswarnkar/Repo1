//comments
public class Rectangle {
	int length;
	int width;
	
	void insert(int l, int w) {
		length=l;
		width=w;
	}
	void calculateArea() {
		System.out.println(length*width);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle r1=new Rectangle();
		Rectangle r2=new Rectangle();
		
		r1.insert(12, 23);
		r2.insert(54, 5);
		
		r1.calculateArea();
		r2.calculateArea();

	}


}
