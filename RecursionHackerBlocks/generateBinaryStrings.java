package HackerBlocks.RecursionHackerBlocks;

import java.util.Scanner;

public class generateBinaryStrings {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int tc = scn.nextInt();

		while (tc-- != 0) {

			String test = scn.next();
			generateBinary(test,"");

		}

	}


	public static void generateBinary(String ques, String ans) {

		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		for(int i=0;i<ques.length();i++) {
			char ch = ques.charAt(i);
			if(ch=='1'||ch=='0') {
				generateBinary(ques.substring(i+1),ans+ch);
				return;
			}else if(ch=='?'){
				//1
				generateBinary(ques.substring(i+1),ans+1);
				//0
				generateBinary(ques.substring(i+1),ans+0);
				return;
			}
		}
		
	}

}
