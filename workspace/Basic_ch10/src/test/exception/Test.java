package test.exception;

public class Test {

	public static void main(String[] args) {
		try {
		int x=100;
		args[0]=null;
		int y=Integer.parseInt(args[0].trim());
		System.out.println(x/y);
		}catch(ArithmeticException e) {
			System.out.println("0���� ������ ������");
		}catch(NumberFormatException e) {
			System.out.println("���ڷ� �ٲ� �� ���� �Է��Դϴ�");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("���ڸ� �Է��ϼ���");
		}catch(Exception e) {
			System.out.println("� �ͼ����� �߻�");
		}
		System.out.println("���� �߿��� �� ����...");
	}

}

