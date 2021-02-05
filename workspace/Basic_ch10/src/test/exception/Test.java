package test.exception;

public class Test {

	public static void main(String[] args) {
		try {
		int x=100;
		args[0]=null;
		int y=Integer.parseInt(args[0].trim());
		System.out.println(x/y);
		}catch(ArithmeticException e) {
			System.out.println("0으로 나누지 마세요");
		}catch(NumberFormatException e) {
			System.out.println("숫자로 바꿀 수 없는 입력입니다");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("숫자를 입력하세요");
		}catch(Exception e) {
			System.out.println("어떤 익셉션이 발생");
		}
		System.out.println("아주 중요한 일 시작...");
	}

}

