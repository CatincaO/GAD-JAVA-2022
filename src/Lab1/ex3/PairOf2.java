package Lab1.ex3;

import java.util.HashMap;

public class PairOf2 {

    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int pair = 0;
        int arrays[] = {2, 2, 3, 4, 3, 4, 4, 5} ;
        for (int i = 0; i < arrays.length; i++)
        {
            if (hm.containsKey(arrays[i]))
                hm.put(arrays[i], hm.get(arrays[i]) + 1);
            else
                hm.put(arrays[i], 1);
        }
        for (int i : hm.keySet())
        {
            if (hm.get(i) % 2 == 0)
                pair +=1;
        }

        System.out.println("The number of pairs of 2 are: " +pair);

    }
}
