package HackerBlocks.Basics;

import java.util.Scanner;

public class PatternMountain {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n =scn.nextInt();
		int rows=1;
		int nst=1;
		int nsp=2*n-3;
		int val=1;
		
		while(rows<=n) {
			val=1;
			int cst=1;
			while(cst<=nst) {
				System.out.print(val+"\t");
				cst++;
				val++;
			}
			
			int csp=1;
			while(csp<=nsp) {
				System.out.print("\t");
				csp++;
			}

			val=rows;
			cst=1;
			if(rows==n) {
				cst=2;
				val--;
			}
			while(cst<=nst) {
				System.out.print(val+"\t");
				cst++;
				val--;
				
			}
			
			System.out.println();
			nsp-=2;
			nst+=1;
			rows++;
		}
		
		
	}
	
}
