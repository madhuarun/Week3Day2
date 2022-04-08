package Week3Day3;

public class FindTypes {

@SuppressWarnings("deprecation")
public static void main(String[] args) {
		
		String str="$$ Welcome to 2nd class of Automation $$";
		int specialchar=0;
		int letter=0;
		int space=0;
		int num=0;
		
		//enter the loop till the end of string 
	   	for(int i=0;i<str.length();i++) 
	   	{
	   		//condition to check if the string has letter,digit,space and if present increment the counter
	   		if(Character.isLetter(str.charAt(i)))
	   		{
	   			letter++;
	   		}
	   		else if(Character.isDigit(str.charAt(i)))
	   		{
	   			num++;
	   		}
	   		else if (Character.isSpace(str.charAt(i)))
	   		
	   		{
	   			space++;
	   		}
	   		else {
	   			
	   			specialchar++;
	   			   		}
	   	}
	   		System.out.println("The letters in the string is "+letter);
	   		System.out.println("The digits in the string is "+num);
	   		System.out.println("The space in the string is "+space);
	   		System.out.println("The specialchar in the string is "+specialchar);
	   		
}
}
