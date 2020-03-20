import java.util.Arrays;

public class KthSmallest {

    static int kthSmallest(int[] arr, int k){
        Arrays.sort(arr);

        return arr[k-1];
    }
    public static void main(String[] args) {
        int arr[] = {12, 3, 5, 7, 19};
        int k = 2;
        System.out.print( "K'th smallest element is "+
                kthSmallest(arr, k) );
    }
}
