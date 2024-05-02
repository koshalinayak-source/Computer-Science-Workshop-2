package GenericsAndCollectionPart2;

import java.util.PriorityQueue;

public class Q12 {
    public static void main(String[] args) {
        /*
        Declare an array of integers. int[] arr = {1,2,10,8,7,3,4,6,5,9};.
        Then create a min heap of elements from the array using Priority
        Queue class. Again Dequeue elements of Priority Queue
        using appropriate methods.
         */
        int[] arr = {1,2,10,8,7,3,4,6,5,9};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        //add array elements in pq
        for(int i =0;i< arr.length;i++){
            pq.offer(arr[i]);
        }
        System.out.println();

        //Dequeue elements of Priority Queue using appropriate methods
        while (!pq.isEmpty()){
            int ele = pq.poll();
            System.out.print(ele+" ");
        }
    }
}
