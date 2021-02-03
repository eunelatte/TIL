package my.fly;

public class Superman extends Human {
	@Override
	public void eat() {		
		super.eat();
		System.out.println("»§µµ ¸Ô´Â´Ù...");
	}
	
	public void flying() {
		System.out.println("¸ÁÅä¸¦ ÈÖ³¯¸®¸ç ³­´Ù...");
	}
}
