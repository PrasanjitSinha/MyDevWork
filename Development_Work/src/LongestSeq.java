import java.util.Scanner;

public class LongestSeq {

	static int array(int[] array){
		int count = 1, max = 1;
		for (int i = 1; i < array.length; i++) {
		    if (array[i] >= array[i - 1]) {
		        count++;
		    } else {
		        count = 1;
		    }
		    if (count > max) {
		        max = count;
		    }
		}
		return max;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int[] arr = new int[x];
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println(array(arr));
	}
}
