package week3.day1;

public class CharOccurance {
	public static void main(String[] args) {
		String str="Testleaf";
		int count=0;
		int len=str.length();
		char[] ch=str.toCharArray();
		for(int i=0;i<len;i++) {
			if(ch[i]=='e') {
				count++;
			}
		}
		System.out.println(count);


	}

}


