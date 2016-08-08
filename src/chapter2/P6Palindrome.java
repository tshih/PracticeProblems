package chapter2;

import java.util.Stack;

/**
 * Created by Timothy Shih on 8/7/2016.
 */
public class P6Palindrome {
    public boolean isPalindrome(Node<Integer> n) {
        if(!n.hasNext())
            return true;

        Stack<Integer> stack = new Stack<Integer>();

        Node<Integer> n1 = n;
        Node<Integer> n2 = n;

//        while(true) {
//            stack.push(n1.getData());
//
//            if(n2.hasNext()) {
//                if(n2.getNext().hasNext()) {
//                    n1 = n1.getNext();
//                    n2 = n2.getNext().getNext();
//                } else {
//                    break;
//                }
//            } else {
//                stack.pop();
//                break;
//            }
//        }

        while(n2 != null && n2.hasNext()) {
            stack.push(n1.getData());
            n1 = n1.getNext();
            n2 = n2.getNext().getNext();
        }

        if(n2 == null) {
            stack.pop();
        }

        n1 = n1.getNext();

        while(n1 != null) {

            if(n1.getData() != stack.pop())
                return false;

            n1 = n1.getNext();
        }
        return true;
    }
}
