package my.fly;

public class Superman extends Human {
	@Override
	public void eat() {		
		super.eat();
		System.out.println("���� �Դ´�...");
	}
	
	public void flying() {
		System.out.println("���並 �ֳ����� ����...");
	}
}
