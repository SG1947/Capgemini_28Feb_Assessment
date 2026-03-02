package Week2.strings;

import java.util.*;

public class anagram {

	public static void main(String[] args) {
		String str1="eat";
		String str2="ate";
		if (comp(str1,str2)) System.out.println("Anagram");
		else System.out.println("Not anagram");
	}
	public static boolean comp(String s1, String s2) {
		if(s1.length()!=s2.length()) return false;
		char [] arr1= s1.toCharArray();
		Arrays.sort(arr1);
		
		char [] arr2= s2.toCharArray();
		Arrays.sort(arr2);
		 
//		String sortedString = new String(charArray);
		for (int i = 0; i < arr2.length; i++) {
			if(arr1[i]!=arr2[i]) return false;
		}
		return true;
	}

}
