import java.util.ArrayList;
import java.util.List;

public class GreatestGreater {

    static int maxElement(int[] arr){
        int max= arr[0];
        for (int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    static void replaceElements(int[] arr){
        int max = maxElement(arr);
        List<Integer> list = new ArrayList<>();
        for (int i=0;i<arr.length;i++){
            if(!list.contains(arr[i])){
                list.add(arr[i]);
            } else{
                arr[i] = max+1;
                list.add(arr[i]);
                max++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 5, 3 };
        int n = arr.length;
        replaceElements(arr);
        for (int i = 0; i < n; i++)
            System.out.print( arr[i] + " ");
    }
}
