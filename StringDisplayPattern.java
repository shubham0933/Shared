package com.string;

public class StringDisplayPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String splitThis = "My Name Is Shubham ";
			
		
		String a1 = splitThis.substring(0, splitThis.indexOf(' ')).trim();
		char[] aa1=a1.toCharArray();
		System.out.println(a1);
		
		
		splitThis=splitThis.substring(splitThis.indexOf(' '), splitThis.length()).trim();
		String a2=splitThis.substring(0, splitThis.indexOf(' '));
		char[] aa2=a2.toCharArray();
		System.out.println(a2);
		
		
		splitThis=splitThis.substring(splitThis.indexOf(' '), splitThis.length()).trim();
		String a3=splitThis.substring(0, splitThis.indexOf(' '));
		char[] aa3=a3.toCharArray();
		System.out.println(a3);
		
		splitThis=splitThis.substring(splitThis.indexOf(' '), splitThis.length()).trim();
		String a4=splitThis.substring(0, splitThis.length());
		char[] aa4=a4.toCharArray();
		System.out.println(a4);
		
		String x1=String.valueOf(aa1[0]);
		
		for (int i=0;i<5;i++) {
			System.out.println(String.valueOf(aa1[0])+String.valueOf(aa2[0])+String.valueOf(aa3[0])+String.valueOf(aa4[0]));
			System.out.println(String.valueOf(aa1[1])+String.valueOf(aa2[1])+String.valueOf(aa3[1])+String.valueOf(aa4[1]));
			//System.out.println(aa1[1]+aa2[1]+aa3[1]);
		}
		
		//System.out.println(splitThis.matches(" "));
		
		//System.out.println(splitThis.);
		
	}

}
