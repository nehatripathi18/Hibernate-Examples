package junit;

abstract class example2 {
	
	abstract public void method1();
//	{
//		System.out.println("hello");
//	}
	
	public static void method2()
	{
		System.out.println(" heloo world");
	}

}
	public class hello extends example2
	
	{
	       public void method1()
	       {
	    	   System.out.println("my name is neha");
	       }
				
		public static void main(String args[]) {
		
		hello hl= new hello();
		//hl.method2();
		hl.method1();
		
		hello.method2();
		
	
		
			
			
			
		}	
		
	}
	
	
	
	
	
	
	
	

