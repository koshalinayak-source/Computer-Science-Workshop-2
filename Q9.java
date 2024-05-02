package GenericsAndCollectionPart2;

import java.util.HashSet;

public class Q9 {
    public static void main(String[] args) {
        /*
        Given an array of integers, print the repeating
        integers in the array with the help of a HashSet.
         */
        int[] ar= {7, 1, 3, 1, 3, 6, 3};
        for (int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> repeating = new HashSet<>();
        System.out.println();
        for(int a : ar){

            if(!seen.add(a)){
                repeating.add(a);
            }
            /* adds elements to the seen HashSet as it checks for duplicates,
               and if an element is already present in seen,
               it's added to the repeating HashSet. Finally,
               it prints the elements in the repeatingv    */

        }
        System.out.println(repeating);
    }
}
