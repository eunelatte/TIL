package test.static_;

public class Test_ {
	
	public static void main(String[] args) {
		
		B o1=new B("������");
		B.count++;
		
		B o2=new B("ȫ�浿");
		B.count++;
		
		B.printCount();

	}

}

class B{
	String name;
	static int count=0;//�湮�ڼ�
	static public void printCount() {
		System.out.println(count);
	}
	B(String name){
		this.name=name;
	}
}
