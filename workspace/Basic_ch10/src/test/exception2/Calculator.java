package test.exception2;

public class Calculator {

	public int divide(int x,int y) throws MyException{
	int z=0;
	
	 if(y==0) {
		 throw new MyException("0���� �Է�����������");
	 }

	 z=x/y;
	
	  return z;
    }
}
