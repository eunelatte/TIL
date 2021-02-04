package test.datatype;

import java.util.Date;

public class Test {

	int age=28;
	double tall=167.5;
	char gender='여';
	boolean isPretty=true;
	//MemberName name=new MemberName();
	String name=new String("김은혜");
	//MyDate birthday=new MyDate();
	Date birthday=new Date(1994,10,11);
	
	public static void main(String[] args) {
	 Test t1=new Test();
	 
	System.out.println(t1.age);
	System.out.println(t1.tall);
	System.out.println(t1.gender);
	System.out.println(t1.isPretty);
	System.out.println(t1.name);
	System.out.println(t1.birthday.getYear()+"년"+t1.birthday.getMonth()+"월"+t1.birthday.getDate()+"일");
	}

}


