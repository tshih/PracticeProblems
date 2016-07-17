package chapter1;

/**
 * Created by Timothy Shih on 5/31/2016.
 */
public class P5OneAway {

    public boolean oneAway(String s1, String s2) {
        if(Math.abs(s1.length() - s2.length()) > 1)
            return false;

        String shorter = s1.length() > s2.length() ? s2 : s1;
        String longer = s1.length() > s2.length() ? s1 : s2;

        int i = shorter.length() - 1;
        int j = longer.length() - 1;
        boolean diffFound = false;
        while(i >= 0 && j >= 0) {
            if(shorter.charAt(i) != longer.charAt(j)) {
                if (diffFound)
                    return false;
                diffFound = true;

                if(shorter.length() == longer.length())
                    i--;
            } else {
                i--;
            }
            j--;
        }

        return true;
    }

}
