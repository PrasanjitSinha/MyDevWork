import java.util.ArrayList;
import java.util.Scanner;


public class OddEvenArray {

	public static void main(String[] args) {

		int[] arr= new int[10];
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
			if(arr[i] % 2 == 0){
				list1.add(arr[i]);
			} else{
				list2.add(arr[i]);
			}
		}
		list2.addAll(list1);
		for(int a : list2){
			System.out.print(a+ " ");
		}
	}
}
