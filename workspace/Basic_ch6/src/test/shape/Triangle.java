package test.shape;

public class Triangle extends Shape{
	private int w,h;
	public void area() { //재정의
		System.out.println("삼각형의 넓이="+(w*h/2));
	}
	public int getW() {
		return w;
	}
	public void setW(int w) {
		if(w>0) {
			this.w = w;
		}else {
			System.out.println("가로는 0보다 큰 수");
		}
	}
	public int getH() {
		return h;
	}
	public void setH(int h) {
		if(h>0) {
			this.h = h;
		}else {
			System.out.println("세로는 0보다 큰 수");
		}
	}
	
}


