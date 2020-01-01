package HackerBlocks.Basics;

import java.util.Scanner;

public class NumberLadder_Pattern {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int rows=scn.nextInt();
		//1. number of rows
		//2. self work
		//3. preparation
		
		int nst=1;
		
		int val=1;
		while(rows>0) {
			
			int cst=1;
			while(cst<=nst) {
				System.out.print(val+"\t");
				val++;
				cst++;
			}
			System.out.println();
			nst++;
			rows--;
		}
		
	}
	
}
