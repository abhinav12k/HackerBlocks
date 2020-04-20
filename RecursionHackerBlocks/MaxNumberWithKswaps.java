package HackerBlocks.RecursionHackerBlocks;

import java.util.Scanner;

public class MaxNumberWithKswaps {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		String number = scn.next();
		int swaps=scn.nextInt();
		
		char[] ch = number.toCharArray();
		System.out.println(maxNumber(ch,swaps,0));
	}
	
	public static int maxNumber(char[] number,int mSwaps,int vidx) {
		
		int max = Integer.parseInt(new String(number));
		
		if(mSwaps==0) {
			return max;
		}
		
		for(int i=vidx;i<number.length;i++) {
			for(int j=i+1;j<number.length;j++) {
				
				if(number[i]<number[j]) {
					//swap
					swap(number,i,j);
					int ans = maxNumber(number,mSwaps-1,i+1);
					max = Math.max(max, ans);
					swap(number,i,j);
				}
				
			}
		}
		return max;
	}
	
	public static void swap(char[] number,int i,int j) {
		
		//swapping logic
		char ch = number[j];
		number[j]=number[i];
		number[i]=ch;
	}
	
}
