package HackerBlocks.Basics;

import java.util.Scanner;

public class SimpleInput {

	public static void main(String[] args) {
		
		Scanner scn= new Scanner(System.in);
		int in=scn.nextInt();
		int sum=in;
		
		while(sum>=0) {
			System.out.println(in);
			in = scn.nextInt();
			sum+=in;
		}
	}
	
}
