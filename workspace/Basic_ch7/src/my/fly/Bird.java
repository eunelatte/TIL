package my.fly;

public class Bird extends Animal implements Flyer{
	
	@Override
	public void eat() {
		System.out.println("������ ��� �԰� ���...");
	}
	
	public void fly() {
		System.out.println("������ �޷��̸� ����...");
	}

}
