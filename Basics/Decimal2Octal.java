package HackerBlocks.Basics;

import java.util.Scanner;

public class Decimal2Octal {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int dn=scn.nextInt();
		int rem=0,on=0;
		int multiplier=1;
		
		while(dn!=0) {
			rem=dn%8;
			on=on+rem*multiplier;
			multiplier=multiplier*10;
			dn=dn/8;
		}
		
		System.out.println(on);
	}
	
}
