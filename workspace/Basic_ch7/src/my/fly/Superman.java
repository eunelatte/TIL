package my.fly;

public class Superman extends Human implements Flyer {
	@Override
	public void eat() {		
		super.eat();
		System.out.println("»§µµ ¸Ô´Â´Ù...");
	}
	
	public void fly() {
		System.out.println("¸ÁÅä¸¦ ÈÖ³¯¸®¸ç ³­´Ù...");
	}
}
