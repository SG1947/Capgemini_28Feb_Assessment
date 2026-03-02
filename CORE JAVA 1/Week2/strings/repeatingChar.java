package Week2.strings;

import java.util.HashMap;
import java.util.Map;

//repeating chars beautifulu->beauutifuuuluuuu
public class repeatingChar {
//we want mutable , no sync req so use stringbuilder
	public static void main(String[] args) {
		StringBuilder str=new StringBuilder("bassa");
        if(check(str)) System.out.println("OK");
	}
	public static boolean check(StringBuilder str) {
		int [] arr= new int[26];
		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i)-'a']++;
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>1)
				System.out.println((char)(i+'a')+" "+arr[i]);
		}
		return true;
	}

}
