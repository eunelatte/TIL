package test.abstract_;

public class Cat extends Animal {
	public Cat() {
		this.kind = "°í¾çÀÌ";
	}

	@Override
	public void sound() {
		System.out.println("¾ß¿Ë");
	}
}
