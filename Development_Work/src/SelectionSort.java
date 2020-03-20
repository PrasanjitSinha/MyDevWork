import java.util.Scanner;


public class SelectionSort {

	static void sortArray(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			int index = i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[j] == arr[index]){
					index = j;
				}
			}
			int smallerNumber = arr[index];
			arr[index] = arr[i];
			arr[i] = smallerNumber;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[10];
		for(int i = 0;i<array.length;i++){
			array[i] = sc.nextInt();
		}
		sortArray(array);
		for(int i : array){
			System.out.println(i + " ");
		}
	}
}
