package Week3Day3;

public class Palindrome {
	public static void main(String[] args) {
		
		String s="madam";
		String reverse="";
		char[] charArray=s.toCharArray();
		for(int i=s.length()-1;i>=0;i--) {
			reverse=reverse+charArray[i];
		
	}
		if(s.equals(reverse)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
	}
}
