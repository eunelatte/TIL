package test.shape;

public class Circle extends Shape{
	private int radius;
	public void area() { //������
		System.out.println("���� ����="+(3.14*radius*radius));
	}
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		if(radius>0) {
			this.radius = radius;
		}else {
			System.out.println("�������� 0���� ū ��");
		}
		
	}
}
