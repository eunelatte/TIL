package my.fly;

public class Superman extends Human implements Flyer {
	@Override
	public void eat() {		
		super.eat();
		System.out.println("���� �Դ´�...");
	}
	
	public void fly() {
		System.out.println("���並 �ֳ����� ����...");
	}
}
