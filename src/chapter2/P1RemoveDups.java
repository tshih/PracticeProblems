package chapter2;

import java.util.HashSet;
import java.util.Set;

public class P1RemoveDups {

	public void removeDups(Node n) {

		if(n == null)
			return;

		Set<Integer> set = new HashSet<Integer>();
		
		Node<Integer> n1 = n;
		Node<Integer> n2 = n.getNext();
		
		set.add(n1.getData());
		
		while(n2 != null) {
			if(set.contains(n2.getData())) {
				n2 = n2.getNext();
				n1.setNext(n2);
			}
			else {
				set.add(n2.getData());
				n1 = n1.getNext();
				n2 = n2.getNext();
			}
		}
	}
}
