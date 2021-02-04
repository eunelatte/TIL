package test.final_;

public class Test {

	public static void main(String[] args) {
		B b=new B();
		b.i++;
		b.printI();

	}
}

  class A{
	    int i=10;
		public void printI() {
			System.out.println("A의 i는 "+i);
		}
	}
	class B extends A{
		public void printI() {
			System.out.println("A로부터 상속받은 i는 "+i);
		}
	}

