package chapter1;

import java.util.HashMap;

/**
 * Created by Timothy Shih on 5/31/2016.
 */
public class P4PalinPerm {

    public P4PalinPerm() {

    }

    public boolean testPerm(String s) {
        HashMap<Character, Integer> countMap = new HashMap<Character, Integer>();
        for(char c : s.toCharArray()) {
            if(!countMap.containsKey(c)) {
                countMap.put(c, 0);
            }
            countMap.put(c, countMap.get(c) + 1);
        }
        boolean oddFlag = false;
        for(char c : countMap.keySet()) {
            if(countMap.get(c) % 2 == 1) {
                if (oddFlag)
                    return false;
                oddFlag = true;
            }
        }
        return true;
    }

}
