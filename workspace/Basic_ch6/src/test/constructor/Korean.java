package test.constructor;

public class Korean {
	String nation="´ëÇÑ¹Î±¹";
	String name;
	String ssn;
	
	public Korean(String n,String s) {
		name=n;
		ssn=s;
	}
	public Korean() {
		this("È«±æµ¿","000000-0000000");
	}

}
