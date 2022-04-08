package Week3Day3;
import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
		
		String s1="stops";
		String s2="potss";
		
		//checking the length of the strings
		if(s1.length()==s2.length()) 
		{
			char[] Ch1=s1.toCharArray();
			char[] Ch2=s2.toCharArray();
			Arrays.sort(Ch1);
			Arrays.sort(Ch2);
			//checking if both strings are same
				if(Arrays.equals(Ch1, Ch2))
				{
			System.out.println("Anagram");
		}
				else 
				{
			System.out.println("NotAnagram");
		} 
}else {
	System.out.println("Not Anagram");
}
}

		}
		