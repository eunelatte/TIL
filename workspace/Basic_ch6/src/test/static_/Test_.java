package test.static_;

public class Test_ {
	
	public static void main(String[] args) {
		
		B o1=new B("전은수");
		B.count++;
		
		B o2=new B("홍길동");
		B.count++;
		
		B.printCount();

	}

}

class B{
	String name;
	static int count=0;//방문자수
	static public void printCount() {
		System.out.println(count);
	}
	B(String name){
		this.name=name;
	}
}
