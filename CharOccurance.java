package Week3Day3;

public class CharOccurance {
	public static void main(String[] args) {
		
		String str="Welcome to chennai";
		int count=0;		
	   	for(int i=0;i<str.length();i++) {
			
			//condition to check if the string has the letter e
	   		if(str.charAt(i)=='e'){
				count++;
			}
			
		}
	   	System.out.println("E letter present: " +count);
		
	}

}
