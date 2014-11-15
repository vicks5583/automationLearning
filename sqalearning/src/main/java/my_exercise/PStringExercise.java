package my_exercise;

public class PStringExercise {

/*	Write a java program that has 3 string variables:
		1) Soccer
		2) Football
		3) Cricket
		“Soccer” and “Cricket” are a string literal, “Football” is java object.

		a) Compare 1 with 2, 1 with 3 and 2 with 3 for equality and memory address.
		b) Print out the total characters in 2.
		c) Print second last character from 3
		d) Print the position of first “c” in 1.
		exercise to do now
		*/
	public static void main (String args[]){
		
		
		
		String str1 = "soccer";
		String str2 = new String("football");
		String str3 = "cricket";
		
		int length = str1.length();
		System.out.println("Length of str1 is: "+length);
		
		String subStr2 = str2.substring(0,length);
		System.out.println("Substring of str2 is: "+subStr2);
		
		int indexStr1 = str1.indexOf("c");
		System.out.println("Position of first 'c' in 'str1' is: "+indexStr1);
		
		//Below "==" compares the memory address
        System.out.println("Comparing references of str1 and str2 : "+ (str1 == str2));
		
      //Below "==" compares the memory address
        System.out.println("Comparing references of str1 and str3 : "+ (str1 == str3));
        
      //Below "==" compares the memory address
        System.out.println("Comparing references of str2 and str3 : "+ (str2 == str3));
        
      //Below .equals compares the values of string
        System.out.println("Comparing values of str1 and str2 : "+str1.equals(str2));
                 
        System.out.println("Testing value equality for str1 and str3 : "+str1.equals(str3));
         
        System.out.println("Testing value equality for str2 and str3 : "+str2.equals(str3));
        System.out.println("Testing value equality for str2 and str3 : "+str2 == str3);
        
        
	}

}
