package HackerBlocks.Basics;

import java.util.Scanner;

public class ReplaceWith5 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		long n=scn.nextLong();
		long rem=0;
		long tn=0;
		long multiplier=1;
		
		if(n==0) {
			System.out.println(5);
			return;
		}
		
		while(n!=0) {
			rem=n%10;
			if(rem==0) {
				tn=tn+5*multiplier;
			}else {
				tn=tn+rem*multiplier;
			}
			multiplier=multiplier*10;
			n=n/10;
		}
		System.out.println(tn);
	}
	
}
