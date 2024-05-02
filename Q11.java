package GenericsAndCollectionPart2;

import java.util.HashMap;

public class Q11 {
    public static void main(String[] args) {
        /*
        Given an unsorted array of integers from 1 to 10,
        find smallest positive number missing in the array.
        Use a hash map HashMap<Integer, Integer> to keep track of elements.
         */
        int[] array = {3, 4, 7, 1, 6, 2, 9, 10}; // Example unsorted array
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i : array){
            h.put(i,h.getOrDefault(i,0)+1);
        }
        for(int i=1;i<=10;i++){
            if(!h.containsKey(i)){
                System.out.println("Smallest missing number is "+i);
                break;
            }

        }

    }
}
