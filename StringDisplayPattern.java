package com.string;

import java.util.HashMap;
import java.util.Map;

public class StringDisplayPattern {

	static Map<String,char[]> map=new HashMap<>();
	
	public static void main(String[] args) {
		String splitThis = "My Name Is Shubham ";
		System.out.println("Input String :" + splitThis);
		StringDisplayPattern obj = new StringDisplayPattern();
		String[] a = obj.splitThis(splitThis);
		obj.returnCharArray(a);
		System.out.print(map.get("My")[0]);
		System.out.print(map.get("Name")[0]);
		System.out.print(map.get("Is")[0]);
		System.out.print(map.get("Shubham")[0]);
		
		System.out.println();
		System.out.print(map.get("My")[1]);
		System.out.print(map.get("Name")[1]);
		System.out.print(map.get("Is")[1]);
		System.out.print(map.get("Shubham")[1]);

		/*for(int i=0;i<map.size();i++) {
			System.out.println(map.get(a[i])[i]);
		}*/
	}

	public String[] splitThis(String splitThis) {
		String[] a = {null,null,null,null};
		for(int i=0;i<=a.length-1;i++) {
			if(i==0) {
				a[i] = splitThis.substring(0, splitThis.indexOf(' ')).trim();
				
			}else if(i==a.length-1) {
				splitThis=splitThis.substring(splitThis.indexOf(' '), splitThis.length()).trim();
				a[i]=splitThis.substring(0, splitThis.length());
			}
			else{
				splitThis=splitThis.substring(splitThis.indexOf(' '), splitThis.length()).trim();
				a[i]=splitThis.substring(0, splitThis.indexOf(' '));
			}
			//System.out.println(a[i]);
		}
		return a;
	}
	
	public void returnCharArray(String[] splitThis) {
		for(int i=0;i<splitThis.length;i++) {
			map.put(splitThis[i], splitThis[i].toCharArray());
		}
	}
}
