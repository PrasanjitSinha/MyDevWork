import java.util.Arrays;
import java.util.Scanner;

public class ArrayCopy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[]{1,2,3};

        int n = arr.length;
        int[] temp = Arrays.copyOf(arr,arr.length-1);

        for (int i=0;i<temp.length;i++){
            System.out.println(temp[i]);
        }
    }
}
