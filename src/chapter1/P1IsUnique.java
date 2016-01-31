package chapter1;

import java.util.HashSet;

public class P1IsUnique {
	
	public Boolean isUnique(String s1) {
		if(s1 == null || s1.length() == 0 )
			return false;
		
		HashSet<Character> charSet = new HashSet<Character>();
		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			if (charSet.contains(c))
				return false;
			charSet.add(c);
		}
		
		return true;
	}
	
	
}
