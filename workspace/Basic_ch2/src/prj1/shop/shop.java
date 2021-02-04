package prj1.shop;

public class shop {

	public static void main(String[] args) {
	Customer c1=new Customer();
	c1.name="김은혜";
	c1.address="마포";
	c1.gender='여';
	
	
	System.out.println(c1);
	System.out.println(c1.name);
	System.out.println("["+c1.gender+"]");
	System.out.println(c1.age);
	System.out.println(c1.tall);
	System.out.println(c1.isPretty);
	System.out.println(c1.address);
	
	Customer c2=new Customer();
	c2.name="홍길동";
	c2.address="서울";
	c2.gender='남';	
	
	
	System.out.println(c2);
	System.out.println(c2.name);
	System.out.println("["+c2.gender+"]");
	System.out.println(c2.age);
	System.out.println(c2.tall);
	System.out.println(c2.isPretty);
	System.out.println(c2.address);
	}

}
