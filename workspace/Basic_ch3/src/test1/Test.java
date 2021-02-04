package test1;

public class Test {

	public static void main(String[] args) {
		MyProfile m1=new MyProfile();
		m1.setProfile("김은혜", 28, 167.5, '여', true);//메소드 호출
		System.out.println(m1);
		m1.pirntProfile();

		MyProfile m2=new MyProfile();
		m2.setProfile("홍길동",38, 177.5, '남', true);
		System.out.println(m2);
		m2.pirntProfile();
		
	}

}
