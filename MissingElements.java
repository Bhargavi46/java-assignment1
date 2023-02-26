package week3.day1;

import java.util.Arrays;

public class MissingElements {
	public static void main(String[] args) {
		int[] arr= {2,5,6,8,9,1,3,4};
		Arrays.sort(arr);
		int j=0;
		for(int i=0;i<arr.length;i++) {
			j=i+1;

		if(arr[i]!=j) {
			System.out.println(j);
			break;

		}	
		}

	}

}

