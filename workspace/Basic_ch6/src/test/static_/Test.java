package test.static_;

public class Test {
	
	public static void main(String[] args) {
		A.i++;
		A.printI();
		
		A.i++;
		A.printI();

	}

}

class A{
	static int i=10;
	static public void printI() {
		System.out.println(i);
	}
}
