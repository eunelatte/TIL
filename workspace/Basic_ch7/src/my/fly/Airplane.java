package my.fly;

public class Airplane extends Vehicle implements Flyer {	
	
	public void fly() {
		int distance=transfer(10,1000);
		System.out.println(distance+"�Ÿ���ŭ ������ �����ؼ� ����...");
	}

}
