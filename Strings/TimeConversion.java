package HackerBlocks.Strings;

import java.util.Scanner;

public class TimeConversion {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		String s = scn.next();    //Time in AM/PM format
		
		
		convertTime(s);
		
	}

	private static void convertTime(String s) {
		// TODO Auto-generated method stub
		
		String duplicateS=String.valueOf(s);
		String amPm =duplicateS.substring(9, 11);
//		System.out.println(amPm);
		String hoursInAMPM = duplicateS.substring(0,2);
		
		if(amPm.contains("AM")) {
			System.out.println(s.substring(0,8));
		}else {
			int hours = Integer.valueOf(s.substring(0,2))+12;
			s="";
			s = hours+duplicateS.substring(2,8);
			System.out.println(s);
		}
		
	}
	
}
