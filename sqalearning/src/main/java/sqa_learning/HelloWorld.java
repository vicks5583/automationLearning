package sqa_learning;

public class HelloWorld {
	
	 public static void main(String args[]){
	        System.out.println("Entering main");
	        int myVariable = 2*2;
	        System.out.println("Value of I is : "+myVariable);
	        int callerValue = childFunction(2);
	        System.out.println("Exiting main with value = "+callerValue);
	    }
	     
	    public static int childFunction(int myNum){
	        System.out.println("Entering childFunction");
	        int myVariable = myNum/2;       
	        System.out.println("returning from childFunction");
	        return myVariable;
	    }

}
