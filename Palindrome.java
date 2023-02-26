package week3.day1;

public class Palindrome {
	public static void main(String[] args) {
		String a="madam";
		int len=a.length();
		char[] charArray=a.toCharArray(); 
		String rev="";
		for(int i=len-1;i>=0;i--) {
			rev=rev+charArray[i];
			
		}
		if(a.equals(rev))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
 	}

}
