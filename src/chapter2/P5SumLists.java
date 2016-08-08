package chapter2;

/**
 * Created by Timothy Shih on 8/7/2016.
 */
public class P5SumLists {

    public Integer sumLists(Node<Integer> n1, Node<Integer> n2) {

        int total = 0;

        int carryOver = 0;

        boolean continueN1 = true;
        boolean continueN2 = true;
        for(int i = 0 ; ; i++) {
            Integer a = 0;
            Integer b = 0;

            if(continueN1) {
                a = n1.getData();
            }

            if(continueN2) {
                b = n2.getData();
            }

            Integer placeSum = a + b + carryOver;

            if(placeSum - 9 > 0) {
                placeSum -= 10;
                carryOver = 1;
            }

            total += (placeSum) * Math.pow(10, i);

            continueN1 = n1.hasNext();
            continueN2 = n2.hasNext();

            if(continueN1)
                n1 = n1.getNext();

            if(continueN2)
                n2 = n2.getNext();

            if(!continueN1 && !continueN2) {
                total+= carryOver * Math.pow(10, i+1);
                break;
            }

            carryOver = 0;
        }

        return total;
    }
}
