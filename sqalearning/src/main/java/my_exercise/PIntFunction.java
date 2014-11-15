package my_exercise;

public class PIntFunction {
	
	public static void main (String args[]){
		int reciver=2;
		product(reciver, reciver);
    }
     
    public static int product (int no1, int no2){
        
        System.out.println("First no is:"+no1);
        System.out.println("Second no is:"+no2);
        int myVariable = no1*no2;
        System.out.println("Result is : "+myVariable);
        return myVariable;
    }
	
}
