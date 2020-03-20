import java.util.Scanner;


public class FindElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array.....");
		int n = sc.nextInt();
		int[] array = new int[n];
		System.out.println("Enter element in array.....");
		for(int i=0;i<n;i++){
			array[i] = sc.nextInt();
		}
		int search_elem = sc.nextInt();
		int findindex = -1;
		for(int j=0;j<array.length-1;j++){
			if(array[j]==search_elem){
				findindex = j;
				break;
			}
		}
		if(findindex !=-1){
			System.out.println("search element is " + search_elem);
			System.out.println("index is " + findindex );
		} else{
			System.out.println("Element is not present in array...");
		}
	}
}
