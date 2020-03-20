import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargest {

    /*static void kthLargest(Integer[] arr, int k){
        Arrays.sort(arr, Collections.reverseOrder());
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i] +" ");
        }

    }*/

    static int kthLargest(Integer[] arr, int k){
        PriorityQueue<Integer> q = new PriorityQueue<>(k);
        for (int i=k;i<arr.length;i++){
            if(arr[i]>q.peek()){
                q.poll();
                q.add(arr[i]);
            }
        }
        return q.peek();
    }
    public static void main(String[] args) {
        Integer arr[] = new Integer[]{12, 3, 5, 7, 19};
        int k = 2;

        System.out.println(kthLargest(arr, k));
    }
}
