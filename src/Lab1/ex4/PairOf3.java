package Lab1.ex4;

import java.util.HashMap;

public class PairOf3 {

    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int pair = 0;
        int arrays[] = {-1, -1, -1, 2} ;
        for (int i = 0; i < arrays.length; i++)
        {
            if (hm.containsKey(arrays[i]))
                hm.put(arrays[i], hm.get(arrays[i]) + 1);
            else
                hm.put(arrays[i], 1);
        }
        for (int i : hm.keySet())
        {
            if (hm.get(i) % 3 == 0)
                pair +=1;
        }

        System.out.println("The number of pairs of 3 are: " +pair);

    }
}
