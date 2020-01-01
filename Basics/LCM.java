package HackerBlocks.Basics;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int num1=scn.nextInt();
		int num2= scn.nextInt();
		
		int lcm=0;
		
		if(num1>num2) {
			lcm=num1;
		}else {
			lcm=num2;
		}
		
		while(true) {
			
			if(lcm%num1==0&&lcm%num2==0) {
				System.out.println(lcm);
				break;
			}
			lcm++;
		}
		
		//or using formula lcm=(num1*num2)/gcd
		
		
	}
	
}
