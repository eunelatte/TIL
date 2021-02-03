package test.shape;
public class Test {
    public static void main(String[] args) {
		Circle c=new Circle();
		c.setRadius(5);
		Rectangle r=new Rectangle();
		r.setW(3);
		r.setH(3);
		Triangle t=new Triangle();
		t.setW(3);
		t.setH(5);
		Printer out=new Printer();
		out.print((Shape)c);
		out.print(c);
		out.print(r);
		out.print(t);
	
	}

}
