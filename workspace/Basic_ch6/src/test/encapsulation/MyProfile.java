package test.encapsulation;

public class MyProfile {

	String name="김은혜";
	MyDate birthday=new MyDate();
	
	public void setBirthday() {
//	    birthday.year=1994;
		birthday.setYear(19940000);
	    birthday.setMonth(10);
	    birthday.setDay(-3);
	System.out.println(birthday.getYear()+"년"+birthday.getMonth()+"월"
			+birthday.getDay()+"일");
	}
	
}
