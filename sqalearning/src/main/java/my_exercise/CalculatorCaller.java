package my_exercise;

public class CalculatorCaller {
	
	public static void main(String args[]){
        
        //Directly calling the method within sysout
        System.out.println("Output of add is " + Calculator.add(2, 2));
                 
        int sub = Calculator.sub(4, 2);
        System.out.println("Output of sub is "+sub);
         
        int mul = Calculator.mul(3, 2);
        System.out.println("Output of sub is "+mul);
         
        int div = Calculator.div(4, 2);
        System.out.println("Output of sub is "+div);
    }

}
