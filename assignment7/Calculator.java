package assignment7;

class Check extends Exception{
	
	public Check(String msg) {
		super(msg);   // calling parent class constructor
	}
}

public class Calculator {

	private int num1;
	private int num2;
	
	
	
	public Calculator(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

     public void add() throws Check
     {
    	 if(num1<0 ) 
    		 throw new Check("Number1 should not be -ve..");
    	 else if(num2<0)
    		 throw new Check("Number2 should not be -ve..");
    	 else
    		 System.out.println("Addition:"+(num1+num2));
     }
     
     public void sub() throws Check
     {
    	 if(num1<0 )
    		 throw new Check("Number1 should not be -ve..");
    	 else if(num2<0)
    		 throw new Check("Number2 should not be -ve..");
    	 else
    		 System.out.println("Subtraction:"+(num1-num2));
     }
     
     public void mul() throws Check
     {
    	 if(num1==0 )
    		 throw new Check("Number1 should not be 0..");
    	 else if(num2==0)
    		 throw new Check("Number2 should not be 0..");
    	 else
    		 System.out.println("Multiplication:"+(num1*num2));
     }
     
     public void Division() throws Check
     {
    	 if( num2<0)
    		 throw new Check("Number Divide by 0..");
    	 else if(num1>num2) 
    		 throw new Check("Number1 should be grater than number2.");
    	 else
    		 System.out.println("Division:"+(num1/num2));
     }


	public static void main(String[] args)  {
		
	Calculator calculator1=new Calculator(-10, 20);
	try {
		calculator1.add();
	} catch (Check e) {
		
		System.out.println(e);
	}

	Calculator calculator2=new Calculator(10, 0);
	try {
		calculator2.sub();
	} catch (Check e) {
		
		System.out.println(e);
	}
	
	Calculator calculator3=new Calculator(10, 0);
	try {
		calculator2.mul();
	} catch (Check e) {
		
		System.out.println(e);
	
	Calculator calculator4=new Calculator(10, 0);
	try {
		calculator2.Division();
	} catch (Exception e1) {
		
		System.out.println(e1);
	}
	}

	}	
}
