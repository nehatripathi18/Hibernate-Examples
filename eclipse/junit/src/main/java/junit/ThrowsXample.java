package junit;

public class ThrowsXample {

	int division(int a, int b) throws ArithmeticException{
	int t=a/b;
	return t;
	}

	
	public static void main(String args[])
	{
		
		ThrowsXample TX = new ThrowsXample();
		try {
			
			System.out.println(TX.division(15, 0));
        		}
	catch(ArithmeticException ae){

		System.out.println("not divisible");
	}
		
 }
}