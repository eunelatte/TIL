package test.constructor;

public class Korean {
	String nation="���ѹα�";
	String name;
	String ssn;
	
	public Korean(String n,String s) {
		name=n;
		ssn=s;
	}
	public Korean() {
		this("ȫ�浿","000000-0000000");
	}

}
