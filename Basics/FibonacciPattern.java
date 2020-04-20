package HackerBlocks.Basics;

import java.util.Scanner;

public class FibonacciPattern {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int rows=scn.nextInt();
		int nst=1;
		
		int a=0,b=1,c=a+b;
		while(rows>0) {
			
			int cst=1;
			while(cst<=nst) {
				System.out.print(a+"\t");
				a=b;
				b=c;
				c=a+b;
				cst++;
			}
			
			System.out.println();
			nst++;
			rows--;
		}
		
	}
}
