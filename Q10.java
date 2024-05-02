package GenericsAndCollectionPart2;
import java.util.Map;
import java.util.Set;

import java.util.Hashtable;
import java.util.Iterator;

public class Q10 {
    public static void main(String[] args) {
        /*
        In given large string, find the most occurring words in the string.
        Hint:-
      a. Create a Hashtable which will keep track of <word, frequency>
      b. Iterate through the string and keep track of word frequency
         by inserting into Hash-Table.
      c. When we have a new word, we will insert it into the Hashtable
         with frequency 1. For all repetition of the word, we will increase
         the frequency.
      d. We can keep track of the most occurring words whenever we are
         increasing the frequency we can see if this is the most occurring
         word or not.
         */
        String s ="jkhgjhgldjlkdhjkldjhkdth";
        String[] words =s.split("\\s+");
        Hashtable<String,Integer> h = new Hashtable<>();

        for(String w : words){
            h.put(w,h.getOrDefault(w,0)+1);
        }
        int maxf=0;
        for (int f : h.values()) {
            if (f > maxf) {
                maxf = f;
            }
        }
        String maxWord;
        Set set = h.entrySet();
        Iterator it = set.iterator();
        while (it.hasNext()){
            Map.Entry map= (Map.Entry)it.next();
            if(map.getValue().equals(maxf)){
                System.out.println("Max Word : "+map.getKey());
            }
        }

    }
}
