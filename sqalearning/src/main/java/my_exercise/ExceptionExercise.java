package my_exercise;

public class ExceptionExercise {
	
	public static void main(String args[]){
		
		try {
			
			myName("waqas ahmed");
			
		} 
		
		catch (Exception e) {
			
			//e.printStackTrace();
			System.out.println("Exception caught");
			
		}
		
		
	}

	private static void myName(String str) throws Exception{
		
		if (str.length()>10) {
		
			throw new Exception ("This string has more than 10 characters");
		}
		
		 System.out.println("The string is: "+ str);
	}

}
