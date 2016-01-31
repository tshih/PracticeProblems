package chapter1;

import java.util.HashMap;

public class P2CheckPerm {
	
	public boolean checkPerm(String s1, String s2) {
		
		if(s1 == null && s2 == null)
			return true;
		if(s1 == null || s2 == null)
			return false;
		if(s1.length() != s2.length())
			return false;
		
		
		HashMap<Character, Integer> charMap1 = createCharMap(s1);
		HashMap<Character, Integer> charMap2 = createCharMap(s1);
		
		if(charMap1.equals(charMap2))
			return true;
		return false;
	}

	private HashMap<Character, Integer> createCharMap(String s1) {
		char c;
		HashMap<Character, Integer> charMap1 = new HashMap<Character, Integer>();
		for(int i = 0; i < s1.length(); i++) {
			c = s1.charAt(i);
			
			
			if(!charMap1.containsKey(c))
				charMap1.put(c, 0);
			charMap1.put(c, charMap1.get(c) + 1);
		}
		return charMap1;
	}
	
}
