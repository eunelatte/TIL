package test.shape;

public class Printer {
	
	public void print(Shape s) {
	    s.area();    
	}
	public void print(Circle c) {
		System.out.println(c.getRadius());
	}
	public void print(Rectangle r) {
		System.out.println(r.getW());
	}

}
