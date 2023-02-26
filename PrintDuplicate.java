package week3.day1;

public class PrintDuplicate {
	public static void main(String[] args) {
		int[] arr= {11,22,33,44,55,66,22,77,11};
		int len=arr.length;
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}


	}

}


