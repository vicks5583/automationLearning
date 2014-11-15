package my_exercise;

public class PArrayExercise {
	public static void main (String args[]){
	
	char[] myChar = new char[5];
	printSize(myChar);
	
	int[] myInt = new int[5];
		
	
		myInt[0] = 10;
		myInt[1] = 11;
		myInt[2] = 12;
		myInt[3] = 13;
		myInt[4] = 14;
		
		System.out.println(myInt[0]);
		System.out.println(myInt[1]);
		System.out.println(myInt[2]);
		System.out.println(myInt[3]);
		System.out.println(myInt[4]);
	
		printSize(myInt);


  }
	
	public static void printSize (int myIntArray[]){
		System.out.println("size of my Int Array is:"+myIntArray.length);
		
	}
	
	public static void printSize (char myCharArray[]){
		System.out.println("size of my Char Array is:"+myCharArray.length);
	}
	
	public static void myStringArray (String[] stringArray){
		
		String[] myString = new String[]{"waqas","reno","shweta"};
		System.out.println(myString[1]);
		
		
	}

	
}

