package test.shape;

public class Rectangle extends Shape{
	private int w,h;
	public void area() { //������
		System.out.println("�簢���� ����="+(w*h));
	}
	public int getW() {
		return w;
	}
	public void setW(int w) {
		if(w>0) {
			this.w = w;
		}else {
			System.out.println("���δ� 0���� ū ��");
		}
	}
	public int getH() {
		return h;
	}
	public void setH(int h) {
		if(h>0) {
			this.h = h;
		}else {
			System.out.println("���δ� 0���� ū ��");
		}
	}

}
